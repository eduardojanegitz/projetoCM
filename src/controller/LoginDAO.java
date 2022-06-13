package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Usuario;

/**
 *
 * @author Eduardo
 */
public class LoginDAO {
    private Connection conn = new ConnectionFactory().getConnection();;
    
    public ResultSet autenticacaoUsuario(Usuario usuario){
        
        try {
           String sql = "SELECT * FROM tb_usuario WHERE email=? AND senha=?;";
           PreparedStatement stmt = conn.prepareStatement(sql);
           stmt.setString(1, usuario.getEmail());
           stmt.setString(2, usuario.getSenha());
           
           ResultSet rs = stmt.executeQuery();
           return rs; 
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    
    public ResultSet cadastroDeUsuario(Usuario usuario) {
        
       
        try {
            String sql = "INSERT INTO tb_usuario VALUES (null, ?,?,?,?);";
                                                
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getAcesso());
            
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
        return null;
    }
}
