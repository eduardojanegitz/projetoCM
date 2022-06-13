
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Clientes;
import model.Mercados;

/**
 *
 * @author Eduardo
 */
public class MercadoDAO {
    
    private Connection conn;

    public MercadoDAO(){
    this.conn = new ConnectionFactory().getConnection();
}
     public List<Mercados> ListarMercados() {

        try {
            //1º passo: criar a lista
            List<Mercados> listaDeMercados = new ArrayList<>();
            //2º passo: criar o sql, organizar e executar
            String sql = "SELECT * FROM tb_mercados;";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Mercados objMercados = new Mercados();
                objMercados.setId(rs.getInt("id"));
                objMercados.setNome(rs.getString("nome"));
                objMercados.setCnpj(rs.getString("cnpj"));
                objMercados.setTelefone(rs.getString("telefone"));
                objMercados.setCelular(rs.getString("celular"));
                objMercados.setCep(rs.getString("cep"));
                objMercados.setEndereco(rs.getString("endereco"));
                objMercados.setNumero(rs.getInt("numero"));
                objMercados.setComplemento(rs.getString("complemento"));
                objMercados.setBairro(rs.getString("bairro"));
                objMercados.setCidade(rs.getString("cidade"));
                objMercados.setEstado(rs.getString("estado"));

                listaDeMercados.add(objMercados);
            }

            return listaDeMercados;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
     
       public void cadastrarMercados(Mercados obj) {

        try {
            String sql = "INSERT INTO tb_mercados VALUES  (null, ?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }
     
}
