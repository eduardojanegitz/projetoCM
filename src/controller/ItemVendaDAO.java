
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.ItemVenda;
import model.Produtos;

/**
 *
 * @author Eduardo
 */
public class ItemVendaDAO {
    private Connection conn;
    
    public ItemVendaDAO(){
    this.conn = new ConnectionFactory().getConnection();
  
}
    public void cadastraItem(ItemVenda obj){
        try {
            String sql = "INSERT INTO tb_itensvendas VALUES (null, ?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ItemVendaDAO: " + erro);
        }
    }
    
    public List<ItemVenda> listaItensPorVenda(int venda_id){
         List<ItemVenda> lista = new ArrayList<>();
        try {
            
            
            String sql = "SELECT i.id, p.nomeProduto, i.qtd, p.preco, i.subtotal FROM tb_itensvendas AS i "
                       + "INNER JOIN tb_produtos AS p ON(i.produto_id = p.id) WHERE i.venda_id=?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ItemVenda item = new ItemVenda();
                Produtos produtos = new Produtos();
                
                item.setId(rs.getInt("i.id"));
                produtos.setNomeProduto(rs.getString("p.nomeProduto"));
                item.setQtd(rs.getInt("i.qtd"));
                produtos.setPreco(rs.getDouble("p.preco"));
                item.setSubtotal(rs.getDouble("i.subtotal"));
                
                item.setProduto(produtos);
                
                lista.add(item);
            }
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ItemVendaDAO: " + erro);
        }
        return null;
    }
    
}
