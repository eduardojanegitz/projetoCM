
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.mercados.MercadoTouche;
import view.mercados.Mercado_AlohaStore;
import view.mercados.Mercado_Mysterio;
import view.mercados.Mercado_PegueEPague;
import view.mercados.Mercado_doisirmaos;

/**
 *
 * @author Eduardo
 */
public class TelaMenu1 extends javax.swing.JFrame {

    public String usuarioLogado;
    
    public TelaMenu1() {
        initComponents();
       setResizable(false);
       getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/fundo-8"
            + ".png"));
    Image image = icon.getImage();
    painel_desktop = new javax.swing.JDesktopPane(){

        public void paintComponent(Graphics g){
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    lblUsuario = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jmenuMeusPedidos = new javax.swing.JMenuItem();
    jmenuMinhaConta = new javax.swing.JMenuItem();
    jmenuSair = new javax.swing.JMenuItem();
    jmenuCategorias = new javax.swing.JMenu();
    jmenuProdutos = new javax.swing.JMenu();
    menuConsultaEstoque = new javax.swing.JMenuItem();
    jMenuItem3 = new javax.swing.JMenuItem();
    jmenuPesquisar = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jmenuVendas = new javax.swing.JMenu();
    jmenuHistorico = new javax.swing.JMenuItem();
    jmenuDetalhesDaVenda = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Menu");
    setBackground(new java.awt.Color(255, 255, 255));
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            formWindowActivated(evt);
        }
    });

    jButton1.setBackground(new java.awt.Color(255, 255, 255));
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Touche");
    jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jButton1.setOpaque(false);

    jButton2.setBackground(new java.awt.Color(255, 255, 255));
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("Pegue&Pague");
    jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jButton2.setOpaque(false);

    jButton3.setBackground(new java.awt.Color(255, 255, 255));
    jButton3.setForeground(new java.awt.Color(255, 255, 255));
    jButton3.setText("Mistério");
    jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jButton3.setOpaque(false);

    jButton4.setBackground(new java.awt.Color(255, 255, 255));
    jButton4.setForeground(new java.awt.Color(255, 255, 255));
    jButton4.setText("Aloha");
    jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jButton4.setOpaque(false);

    jButton5.setBackground(new java.awt.Color(255, 255, 255));
    jButton5.setForeground(new java.awt.Color(255, 255, 255));
    jButton5.setText("Bom Lugar");
    jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jButton5.setOpaque(false);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Acesse os mercados");

    painel_desktop.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    painel_desktop.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
    painel_desktop.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
    painel_desktop.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
    painel_desktop.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
    painel_desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
    painel_desktop.setLayout(painel_desktopLayout);
    painel_desktopLayout.setHorizontalGroup(
        painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painel_desktopLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jButton2)
                .addComponent(jButton3)
                .addComponent(jButton4)
                .addComponent(jButton5)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    painel_desktopLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

    painel_desktopLayout.setVerticalGroup(
        painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painel_desktopLayout.createSequentialGroup()
            .addGap(67, 67, 67)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(jButton1)
            .addGap(43, 43, 43)
            .addComponent(jButton2)
            .addGap(43, 43, 43)
            .addComponent(jButton3)
            .addGap(43, 43, 43)
            .addComponent(jButton4)
            .addGap(43, 43, 43)
            .addComponent(jButton5)
            .addContainerGap(163, Short.MAX_VALUE))
    );

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setText("Usuário Logado: ");

    lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    lblUsuario.setForeground(new java.awt.Color(0, 102, 241));
    lblUsuario.setText("Eduardo Alves");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblUsuario)
            .addContainerGap(718, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(lblUsuario))
            .addContainerGap())
    );

    jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

    jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-home.png"))); // NOI18N
    jMenu1.setText("Início");

    jmenuMeusPedidos.setText("Meus Pedidos");
    jmenuMeusPedidos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuMeusPedidosActionPerformed(evt);
        }
    });
    jMenu1.add(jmenuMeusPedidos);

    jmenuMinhaConta.setText("Minha Conta");
    jmenuMinhaConta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuMinhaContaActionPerformed(evt);
        }
    });
    jMenu1.add(jmenuMinhaConta);

    jmenuSair.setText("Sair");
    jmenuSair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuSairActionPerformed(evt);
        }
    });
    jMenu1.add(jmenuSair);

    jMenuBar1.add(jMenu1);

    jmenuCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cardapio.png"))); // NOI18N
    jmenuCategorias.setText("Categorias");
    jMenuBar1.add(jmenuCategorias);

    jmenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
    jmenuProdutos.setText("Produtos");

    menuConsultaEstoque.setText("Consulta de Estoque");
    menuConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            menuConsultaEstoqueActionPerformed(evt);
        }
    });
    jmenuProdutos.add(menuConsultaEstoque);

    jMenuItem3.setText("Cadastro de Produtos");
    jmenuProdutos.add(jMenuItem3);

    jMenuBar1.add(jmenuProdutos);

    jmenuPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/contorno-da-lupa-de-pesquisa.png"))); // NOI18N
    jmenuPesquisar.setText("Pesquisar");
    jmenuPesquisar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuPesquisarActionPerformed(evt);
        }
    });

    jMenuItem1.setText("Consulta de Produtos");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jmenuPesquisar.add(jMenuItem1);

    jMenuBar1.add(jmenuPesquisar);

    jmenuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mao.png"))); // NOI18N
    jmenuVendas.setText("Vendas");

    jmenuHistorico.setText("Histórico de Vendas");
    jmenuHistorico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuHistoricoActionPerformed(evt);
        }
    });
    jmenuVendas.add(jmenuHistorico);

    jmenuDetalhesDaVenda.setText("Detalhes da Venda");
    jmenuDetalhesDaVenda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmenuDetalhesDaVendaActionPerformed(evt);
        }
    });
    jmenuVendas.add(jmenuDetalhesDaVenda);

    jMenuBar1.add(jmenuVendas);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(painel_desktop)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(painel_desktop)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        lblUsuario.setText(usuarioLogado);
        //this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void menuConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaEstoqueActionPerformed
         TelaEstoque estoque = new TelaEstoque();
        estoque.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuConsultaEstoqueActionPerformed

    private void jmenuMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuMinhaContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenuMinhaContaActionPerformed

    private void jmenuMeusPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuMeusPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenuMeusPedidosActionPerformed

    private void jmenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSairActionPerformed
        JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? ");
        
        System.exit(0);
    }//GEN-LAST:event_jmenuSairActionPerformed

    private void jmenuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPesquisarActionPerformed
        
    }//GEN-LAST:event_jmenuPesquisarActionPerformed

    private void jmenuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuHistoricoActionPerformed
       TelaHistorico historico = new TelaHistorico();
       historico.setVisible(true);
       dispose();
    }//GEN-LAST:event_jmenuHistoricoActionPerformed

    private void jmenuDetalhesDaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuDetalhesDaVendaActionPerformed
       TelaDetalheVenda detalhesdavenda = new TelaDetalheVenda();
       detalhesdavenda.setVisible(true);
       dispose();
    }//GEN-LAST:event_jmenuDetalhesDaVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       TelaConsultaProdutos consulta = new TelaConsultaProdutos();
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmenuCategorias;
    private javax.swing.JMenuItem jmenuDetalhesDaVenda;
    private javax.swing.JMenuItem jmenuHistorico;
    private javax.swing.JMenuItem jmenuMeusPedidos;
    private javax.swing.JMenuItem jmenuMinhaConta;
    private javax.swing.JMenu jmenuPesquisar;
    public javax.swing.JMenu jmenuProdutos;
    private javax.swing.JMenuItem jmenuSair;
    public javax.swing.JMenu jmenuVendas;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JMenuItem menuConsultaEstoque;
    private javax.swing.JDesktopPane painel_desktop;
    // End of variables declaration//GEN-END:variables
}
