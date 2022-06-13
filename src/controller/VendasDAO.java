
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Clientes;
import model.Vendas;

/**
 *
 * @author Eduardo
 */
public class VendasDAO {
    private Connection conn;
    
    public VendasDAO(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarVenda(Vendas vendas){
        try {
            String sql = "INSERT INTO tb_vendas VALUES (null, ?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, vendas.getCliente().getId());
            
            stmt.setString(2, vendas.getDataVenda());
            stmt.setDouble(3, vendas.getTotalVenda());
            stmt.setString(4, vendas.getObs());
            
            stmt.execute();
            stmt.close();
            
           JOptionPane.showMessageDialog(null, "Venda registrada com sucesso" + vendas.getCliente().getId());
                    
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    public int retornaUltimaVenda(){
        try {
            int idVenda = 0;
            
            String sql = "SELECT MAX(id)id FROM tb_vendas";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                Vendas p = new Vendas();
                
                p.setId(rs.getInt("id"));
                idVenda = p.getId();
            }
            return idVenda;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Vendas> listarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_fim){
        try {
            List<Vendas>lista = new ArrayList<>();
            
            String sql = "SELECT v.id, date_format(v.data_venda,'%d/%m/%Y') AS data_formatada, c.nome, v.total_venda, v.observacoes FROM tb_vendas AS v "
                    + "INNER JOIN tb_clientes AS c ON(v.cliente_id = c.id)WHERE v.data_venda BETWEEN ? AND ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas objVendas = new Vendas();
                Clientes objClientes = new Clientes();
                
                objVendas.setId(rs.getInt("v.id"));
                objVendas.setDataVenda(rs.getString("data_formatada"));
                objClientes.setNome(rs.getString("c.nome"));
                objVendas.setTotalVenda(rs.getDouble("v.total_venda"));
                objVendas.setObs(rs.getString("v.observacoes"));
                
                objVendas.setCliente(objClientes);
                
                lista.add(objVendas);
              
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro VendasDAO: " + erro);
            return null;
        }
    }
    
    public double retornaTotalVendaPorData(LocalDate data_venda){
        try {
            
            double totalvenda = 0;
            
            String sql = "SELECT sum(total_venda) AS total FROM tb_vendas WHERE data_venda =?;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, data_venda.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                totalvenda = rs.getDouble("total");
            }
            
            return totalvenda;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
}

