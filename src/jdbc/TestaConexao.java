package jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception erro) { 
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + erro);
        }
    }
}
