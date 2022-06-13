package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.categorias.CategoriaBebidas1;
import view.mercados.MercadoTouche;
import view.mercados.Mercado_AlohaStore;
import view.mercados.Mercado_Mysterio;
import view.mercados.Mercado_PegueEPague;
import view.mercados.Mercado_doisirmaos;

/**
 *
 * @author Eduardo
 */
public class TelaMenu extends javax.swing.JFrame {

    public String usuarioLogado;

    public TelaMenu() {
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
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    lblUsuario = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jmenuMinhaConta = new javax.swing.JMenuItem();
    jmenuSair = new javax.swing.JMenuItem();
    jmenuMercados = new javax.swing.JMenu();
    jMenuItemTouche = new javax.swing.JMenuItem();
    jMenuItemAloha = new javax.swing.JMenuItem();
    jmenuCategorias = new javax.swing.JMenu();
    jMenuItem2 = new javax.swing.JMenuItem();
    jmenuProdutos = new javax.swing.JMenu();
    menuConsultaEstoque = new javax.swing.JMenuItem();
    jMenuItem3 = new javax.swing.JMenuItem();
    jmenuPesquisar = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jmenuVendas = new javax.swing.JMenu();
    jmenuHistorico = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Menu");
    setBackground(new java.awt.Color(255, 255, 255));
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            formWindowActivated(evt);
        }
    });

    javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
    painel_desktop.setLayout(painel_desktopLayout);
    painel_desktopLayout.setHorizontalGroup(
        painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 895, Short.MAX_VALUE)
    );
    painel_desktopLayout.setVerticalGroup(
        painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 537, Short.MAX_VALUE)
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

    jmenuMercados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mercearia.png"))); // NOI18N
    jmenuMercados.setText("Mercados");

    jMenuItemTouche.setText("Touché");
    jMenuItemTouche.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemToucheActionPerformed(evt);
        }
    });
    jmenuMercados.add(jMenuItemTouche);

    jMenuItemAloha.setText("Aloha");
    jMenuItemAloha.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemAlohaActionPerformed(evt);
        }
    });
    jmenuMercados.add(jMenuItemAloha);

    jMenuBar1.add(jmenuMercados);

    jmenuCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cardapio.png"))); // NOI18N
    jmenuCategorias.setText("Categorias");

    jMenuItem2.setText("Bebidas");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
        }
    });
    jmenuCategorias.add(jMenuItem2);

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
        TelaMinhaConta minhaconta = new TelaMinhaConta();
        minhaconta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmenuMinhaContaActionPerformed

    private void jmenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSairActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            repaint();
        }
    }//GEN-LAST:event_jmenuSairActionPerformed

    private void jMenuItemToucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemToucheActionPerformed
        MercadoTouche touche = new MercadoTouche();
        touche.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemToucheActionPerformed

    private void jMenuItemAlohaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlohaActionPerformed
        Mercado_AlohaStore aloha = new Mercado_AlohaStore();
        aloha.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAlohaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaConsultaProdutos consulta = new TelaConsultaProdutos();
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CategoriaBebidas1 bebidas = new CategoriaBebidas1();
        bebidas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmenuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuHistoricoActionPerformed
        TelaHistorico historico = new TelaHistorico();
        historico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmenuHistoricoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAloha;
    private javax.swing.JMenuItem jMenuItemTouche;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmenuCategorias;
    private javax.swing.JMenuItem jmenuHistorico;
    public javax.swing.JMenu jmenuMercados;
    private javax.swing.JMenuItem jmenuMinhaConta;
    private javax.swing.JMenu jmenuPesquisar;
    public javax.swing.JMenu jmenuProdutos;
    private javax.swing.JMenuItem jmenuSair;
    private javax.swing.JMenu jmenuVendas;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JMenuItem menuConsultaEstoque;
    private javax.swing.JDesktopPane painel_desktop;
    // End of variables declaration//GEN-END:variables
}
