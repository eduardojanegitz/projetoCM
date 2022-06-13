package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Mercados;
import model.Produtos;

/**
 *
 * @author Eduardo
 */
public class ProdutosDAO {
    private Connection conn;
    
    public ProdutosDAO() {
    this.conn = new ConnectionFactory().getConnection();
}
    
    public void cadastraProduto(Produtos obj){
        try {
            String sql = "INSERT INTO tb_produtos VALUES (null, ?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNomeProduto());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getPreco());
            stmt.setInt(4, obj.getQtd_estoque());
            
            stmt.setInt(5, obj.getMercados().getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    public List<Produtos> ListarProdutos() {

        try {
            //1º passo: criar a lista
            List<Produtos> lista = new ArrayList<>();
            //2º passo: criar o sql, organizar e executar
            String sql = "SELECT p.id, p.nomeProduto, p.descricao, p.preco, p.qtd_estoque, m.nome FROM tb_produtos as p INNER JOIN tb_mercados as m ON (p.for_id = m.id);";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Mercados m = new Mercados();
                Produtos objProdutos = new Produtos();
                
                objProdutos.setId(rs.getInt("p.id"));
                objProdutos.setNomeProduto(rs.getString("p.nomeProduto"));
                objProdutos.setDescricao(rs.getString("p.descricao"));
                objProdutos.setPreco(Double.parseDouble(rs.getString("p.preco")));
                objProdutos.setQtd_estoque(Integer.parseInt(rs.getString("p.qtd_estoque")));
                
                m.setNome(rs.getString(("m.nome")));
                objProdutos.setMercados(m);
                
              

                lista.add(objProdutos);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    
    public List<Produtos> ListarProdutosPorPreco() {

        try {
            //1º passo: criar a lista
            List<Produtos> lista = new ArrayList<>();
            //2º passo: criar o sql, organizar e executar
            String sql = "SELECT p.nomeProduto, p.descricao, p.preco, m.nome FROM tb_produtos as p INNER JOIN tb_mercados as m ON (p.for_id = m.id);";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Mercados m = new Mercados();
                Produtos objProdutos = new Produtos();
                
                objProdutos.setNomeProduto(rs.getString("p.nomeProduto"));
                objProdutos.setDescricao(rs.getString("p.descricao"));
                objProdutos.setPreco(Double.parseDouble(rs.getString("p.preco")));
                
                m.setNome(rs.getString(("m.nome")));
                objProdutos.setMercados(m);
                
              

                lista.add(objProdutos);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    
        public Produtos buscaPorCodigo(int id) {

        try {
            
            String sql = "SELECT * FROM tb_produtos WHERE id=?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produtos objProdutos = new Produtos();
            
            while (rs.next()) {

                
                
                objProdutos.setId(rs.getInt("id"));
                objProdutos.setNomeProduto(rs.getString("nomeProduto"));
                objProdutos.setDescricao(rs.getString("descricao"));
                objProdutos.setPreco(Double.parseDouble(rs.getString("preco")));
                objProdutos.setQtd_estoque(Integer.parseInt(rs.getString("qtd_estoque")));
                
               
                
            }

            return objProdutos;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    public List<Produtos> buscaProduto(String nomeProduto) {

        try {
            //1º passo: criar a lista
            List<Produtos> lista = new ArrayList<>();
            //2º passo: criar o sql, organizar e executar
            String sql = "SELECT p.id, p.nomeProduto, p.descricao, p.preco, p.qtd_estoque, m.nome FROM tb_produtos AS "
                       + "p INNER JOIN tb_mercados AS m ON (p.for_id = m.id) WHERE p.nomeProduto LIKE ? ORDER BY p.preco;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeProduto);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos objProdutos = new Produtos();
                Mercados m = new Mercados();
                objProdutos.setId(rs.getInt("p.id"));
                objProdutos.setNomeProduto(rs.getString("p.nomeProduto"));
                objProdutos.setDescricao(rs.getString("p.descricao"));
                objProdutos.setPreco(Double.parseDouble(rs.getString("p.preco")));
                objProdutos.setQtd_estoque(Integer.parseInt(rs.getString("p.qtd_estoque")));
                m.setNome(rs.getString(("m.nome")));
                objProdutos.setMercados(m);
                
                lista.add(objProdutos);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    
    public void alterarProduto(Produtos objProdutos){
        try {
            
            String sql = "UPDATE tb_produtos SET nomeProdutos=?, descricao=?, preco=?, qtd_estoque=?, for_id=? WHERE id=?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, objProdutos.getNomeProduto());
            stmt.setString(2, objProdutos.getDescricao());
            stmt.setDouble(3, objProdutos.getPreco());
            stmt.setInt(4, objProdutos.getQtd_estoque());
            
            stmt.setInt(4, objProdutos.getMercados().getId());
            stmt.setInt(5, objProdutos.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    public void adicionarCarrinho(Produtos objProdutos) {
                try {
                String sql = "SELECT * FROM tb_produtos WHERE nomeProduto=?;";
                
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, objProdutos.getNomeProduto());
                ResultSet rs = stmt.executeQuery();
                } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, erro);
                }
    }
    
    public void baixaEstoque(int id, int qtd_nova){
        try {
            
            String sql = "UPDATE tb_produtos SET qtd_estoque=? WHERE id=?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ProdutosDAO: " + erro);
        }
    }
    
    public void adicionarEstoque(int id, int qtd_nova){
        try {
            String sql = "UPDATE tb_produtos SET qtd_estoque = ? WHERE id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ProdutosDAO: " + erro);
        }
    }
    
    public int retornaEstoqueAtual(int id){
        try {
            int qtd_estoque = 0;
            
            String sql = "SELECT qtd_estoque FROM tb_produtos WHERE id=?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                qtd_estoque = (rs.getInt("qtd_estoque"));
            }
            
             return qtd_estoque;
             
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
 
}

