/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacao;
import java.sql.*;
import Validacao.Conexao;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Angel Banze
 */
public class Fornecedor extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     * Creates new form FornecedorNovo
     */
    public Fornecedor() {
        initComponents();
        conexao = Conexao.Conector();
    }

    private void AdicionarFornecedor(){
        String sql = "insert into fornecedor (forn_nome, forn_cidade, forn_avenida, forn_nuit, forn_tipo_produto, forn_email, forn_celular) Values (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtCidade.getText());
            pst.setString(3, txtAv.getText());
            pst.setString(4, txtNUIT.getText());
            pst.setString(5, txtTipo.getText());
            pst.setString(6, txtEmail.getText());
            pst.setString(7, txtCell.getText());
            
            if(txtNome.getText().equals("") ||  txtEmail.getText().equals("") || txtNUIT.getText().equals("")){
                JOptionPane.showMessageDialog(null, "preencha todos os campos obrigatorios sff");
            } else {
                int resultado = pst.executeUpdate();
                
                if(resultado > 0){
                    JOptionPane.showMessageDialog(null, "Fornecedor adicionado com sucesso!!!");
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtNome.setText(null);
        txtCidade.setText(null);
        txtCell.setText(null);
        txtEmail.setText(null);
        txtNUIT.setText(null);
        txtAv.setText(null);
        txtCell.setText(null);
        txtTipo.setText(null);
        txtCod.setText(null);
    }
    
    private void PesquisaFornecedor(){
        
        String sql = "select * from fornecedor where forn_nome like ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtChave.getText() + "%");
            rs = pst.executeQuery();
            
            tblFornecedor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void PreenchimentoCampos(){
        int ind = tblFornecedor.getSelectedRow();
        txtCod.setText(tblFornecedor.getModel().getValueAt(ind, 0).toString());
        txtNome.setText(tblFornecedor.getModel().getValueAt(ind, 1).toString());
        txtCidade.setText(tblFornecedor.getModel().getValueAt(ind, 2).toString());
        txtAv.setText(tblFornecedor.getModel().getValueAt(ind, 3).toString());
        txtNUIT.setText(tblFornecedor.getModel().getValueAt(ind, 4).toString());
        txtTipo.setText(tblFornecedor.getModel().getValueAt(ind, 5).toString());
        txtEmail.setText(tblFornecedor.getModel().getValueAt(ind, 6).toString());
        txtCell.setText(tblFornecedor.getModel().getValueAt(ind, 7).toString());
    }
    
    private void ActualizarFornecedor(){
        String sql = "update fornecedor set forn_nome = ?, forn_cidade = ?, forn_avenida = ?, forn_nuit = ?, forn_tipo_produto = ?, forn_email = ?, forn_celular = ? where forn_cod = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText().toString());
            pst.setString(2, txtCidade.getText());
            pst.setString(3, txtAv.getText());
            pst.setString(4, txtNUIT.getText());
            pst.setString(5, txtTipo.getText());
            pst.setString(6, txtEmail.getText());
            pst.setString(7, txtCell.getText());
            pst.setString(8, txtCod.getText());
            
            if(txtNome.getText().equals("") ||  txtEmail.getText().equals("") || txtNUIT.getText().equals("")){
                JOptionPane.showMessageDialog(null, "preencha todos os campos obrigatorios sff");
            } else {
                int resposta = pst.executeUpdate();
                
                if(resposta > 0){
                    JOptionPane.showMessageDialog(null, "Dados do fornecedor alterados com sucesso!!!");
                    
                }
                txtNome.setText(null);
                txtCidade.setText(null);
                txtCell.setText(null);
                txtEmail.setText(null);
                txtNUIT.setText(null);
                txtAv.setText(null);
                txtCell.setText(null);
                txtTipo.setText(null);
                txtCod.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void RemoveFornecedor (){
        int confirmar = JOptionPane.showConfirmDialog(null, "Certeza que deseja remover Fornecedor???", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION){
            String sql = "delete from  fornecedor where forn_cod = ?";
            
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtCod.getText());
                int deletar = pst.executeUpdate();
                
                if (deletar > 0){
                    JOptionPane.showConfirmDialog(null, "Fornecedor removido com sucesso");
                    txtNome.setText(null);
                    txtCidade.setText(null);
                    txtCell.setText(null);
                    txtEmail.setText(null);
                    txtNUIT.setText(null);
                    txtAv.setText(null);
                    txtCell.setText(null);
                    txtTipo.setText(null);
                    txtCod.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCell = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAv = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtChave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtNUIT = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(144, 180, 90));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("*e-mail");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 140, 57, 18);

        txtEmail.setBackground(new java.awt.Color(144, 180, 90));
        txtEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtEmail.setText("eg: xxx@hotmail.com ");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(110, 140, 177, 20);

        txtCell.setBackground(new java.awt.Color(144, 180, 90));
        txtCell.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCell.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCell);
        txtCell.setBounds(150, 110, 131, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 110, 54, 18);

        txtNome.setBackground(new java.awt.Color(144, 180, 90));
        txtNome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtNome);
        txtNome.setBounds(150, 80, 130, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("*Nome");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(18, 80, 70, 18);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 51, 0));
        jLabel13.setText("Localização");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(300, 90, 110, 18);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(390, 110, 53, 18);

        txtCidade.setBackground(new java.awt.Color(144, 180, 90));
        txtCidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCidade);
        txtCidade.setBounds(490, 110, 170, 20);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Avenida");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(390, 140, 70, 18);

        txtAv.setBackground(new java.awt.Color(144, 180, 90));
        txtAv.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtAv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtAv);
        txtAv.setBounds(490, 140, 170, 20);

        txtTipo.setBackground(new java.awt.Color(144, 180, 90));
        txtTipo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtTipo);
        txtTipo.setBounds(380, 50, 180, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Codigo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 50, 58, 18);

        txtCod.setBackground(new java.awt.Color(144, 180, 90));
        txtCod.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCod);
        txtCod.setBounds(150, 50, 130, 20);

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setText("Chave");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(20, 20, 60, 18);

        txtChave.setBackground(new java.awt.Color(144, 180, 90));
        txtChave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtChave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChaveKeyReleased(evt);
            }
        });
        jPanel1.add(txtChave);
        txtChave.setBounds(150, 20, 130, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("*Tipo de Produtos a fornecer");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 20, 230, 18);

        btnSubmit.setBackground(new java.awt.Color(144, 180, 90));
        btnSubmit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSubmit.setText("Adicionar");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(190, 270, 110, 30);

        btnApagar.setBackground(new java.awt.Color(144, 180, 90));
        btnApagar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnApagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnApagar);
        btnApagar.setBounds(320, 270, 60, 30);

        btnactualizar.setBackground(new java.awt.Color(144, 180, 90));
        btnactualizar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnactualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar);
        btnactualizar.setBounds(400, 270, 90, 30);

        tblFornecedor.setBackground(new java.awt.Color(144, 180, 90));
        tblFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "forn_cod", "forn_nome", "forn_cidade", "forn_avenida", "forn_nuit", "forn_produto", "forn_email", "Title 8"
            }
        ));
        tblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecedor);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 380, 710, 90);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("*NUIT");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 180, 50, 18);

        txtNUIT.setBackground(new java.awt.Color(144, 180, 90));
        txtNUIT.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNUIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtNUIT);
        txtNUIT.setBounds(140, 180, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtChaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyReleased
        // enquanto digitando vai actualizando
        PesquisaFornecedor();
    }//GEN-LAST:event_txtChaveKeyReleased

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        AdicionarFornecedor();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        RemoveFornecedor();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        ActualizarFornecedor();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void tblFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedorMouseClicked
        // TODO add your handling code here:
        PreenchimentoCampos();
    }//GEN-LAST:event_tblFornecedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txtAv;
    private javax.swing.JTextField txtCell;
    private javax.swing.JTextField txtChave;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNUIT;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
