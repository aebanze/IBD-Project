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
public class Cliente extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form ClienteNovo
     */
    public Cliente() {
        initComponents();
        conexao = Conexao.Conector();
    }

    
    private void Adicionar(){
        String sql = "insert into cliente (cli_sexo, cli_nome, cli_apelido, cli_celular, cli_email) Values (?, ?, ?, ?, ?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, comboSexo.getSelectedItem().toString());
            pst.setString(2, txtNomes.getText());
            pst.setString(3, txtApelido.getText());
            pst.setString(4, txtCell.getText());
            pst.setString(5, txtEmail.getText());
            
            if(txtNomes.getText().equals("") || txtApelido.getText().equals("") || txtEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null, "preencha todos os campos obrigatorios sff");
            } else {
                int resultado = pst.executeUpdate();
                
                if(resultado > 0){
                    JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!!!");
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtNomes.setText(null);
        txtApelido.setText(null);
        txtCell.setText(null);
        txtEmail.setText(null);
    }
    
    private void PesquisaCliente(){
        
        String sql = "select * from cliente where cli_nome like ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtChave.getText() + "%");
            rs = pst.executeQuery();
            
            tblCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void PreencherCampos(){
        int nr = tblCliente.getSelectedRow();
        txtCod.setText(tblCliente.getModel().getValueAt(nr, 0).toString());
        comboSexo.setSelectedItem(tblCliente.getModel().getValueAt(nr, 1).toString());
        txtNomes.setText(tblCliente.getModel().getValueAt(nr, 2).toString());
        txtApelido.setText(tblCliente.getModel().getValueAt(nr, 3).toString());
        txtCell.setText(tblCliente.getModel().getValueAt(nr, 4).toString());
        txtEmail.setText(tblCliente.getModel().getValueAt(nr, 5).toString());
    }
    
    private void ActualizarCliente(){
        String sql = "update cliente set cli_sexo = ?, cli_nome = ?, cli_apelido = ?, cli_celular = ?, cli_email = ? where cli_cod = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, comboSexo.getSelectedItem().toString());
            pst.setString(2, txtNomes.getText());
            pst.setString(3, txtApelido.getText());
            pst.setString(4, txtCell.getText());
            pst.setString(5, txtEmail.getText());
            pst.setString(6, txtCod.getText());
            
            if(txtNomes.getText().equals("") || txtApelido.getText().equals("") || txtEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null, "preencha todos os campos obrigatorios sff");
            } else {
                int resultado = pst.executeUpdate();
                
                if(resultado > 0){
                    JOptionPane.showMessageDialog(null, "Dados do cliente alterados com sucesso!!!");
                    
                }
                txtNomes.setText(null);
                txtApelido.setText(null);
                txtCell.setText(null);
                txtEmail.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void Remover (){
        int confirmar = JOptionPane.showConfirmDialog(null, "Certeza que deseja remover Cliente???", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION){
            String sql = "delete from  cliente where cli_cod = ?";
            
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtCod.getText());
                int apagar = pst.executeUpdate();
                
                if (apagar > 0){
                    JOptionPane.showConfirmDialog(null, "Cliente removido com sucesso");
                    txtNomes.setText(null);
                    txtApelido.setText(null);
                    txtCell.setText(null);
                    txtEmail.setText(null);
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
        txtApelido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomes = new javax.swing.JTextField();
        txtCell = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnSubmit1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtChave = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(144, 180, 90));
        jPanel1.setLayout(null);

        txtApelido.setBackground(new java.awt.Color(144, 180, 90));
        txtApelido.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtApelido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtApelido);
        txtApelido.setBounds(260, 80, 130, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("*Apelido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(118, 80, 80, 18);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("*Outros nomes");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(119, 110, 130, 18);

        txtNomes.setBackground(new java.awt.Color(144, 180, 90));
        txtNomes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNomes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtNomes);
        txtNomes.setBounds(260, 110, 130, 20);

        txtCell.setBackground(new java.awt.Color(144, 180, 90));
        txtCell.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCell.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCell);
        txtCell.setBounds(260, 140, 131, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 140, 54, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("*e-mail");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 170, 57, 18);

        txtEmail.setBackground(new java.awt.Color(144, 180, 90));
        txtEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtEmail.setText("eg: xxx@hotmail.com ");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(220, 170, 177, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("*Genero");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 200, 70, 18);

        btnSubmit.setBackground(new java.awt.Color(144, 180, 90));
        btnSubmit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/Submit.png"))); // NOI18N
        btnSubmit.setText("Submeter");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(550, 450, 190, 60);

        btnSubmit1.setBackground(new java.awt.Color(144, 180, 90));
        btnSubmit1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSubmit1.setText("Adicionar");
        btnSubmit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSubmit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit1);
        btnSubmit1.setBounds(140, 240, 110, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 50, 55, 18);

        txtCod.setBackground(new java.awt.Color(144, 180, 90));
        txtCod.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCod);
        txtCod.setBounds(260, 50, 130, 20);

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
        btnApagar.setBounds(270, 240, 60, 30);

        btnUpdate.setBackground(new java.awt.Color(144, 180, 90));
        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(510, 430, 90, 44);

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
        btnactualizar.setBounds(350, 240, 90, 30);

        comboSexo.setBackground(new java.awt.Color(144, 180, 90));
        comboSexo.setEditable(true);
        comboSexo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        comboSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        jPanel1.add(comboSexo);
        comboSexo.setBounds(260, 200, 124, 24);

        tblCliente.setBackground(new java.awt.Color(144, 180, 90));
        tblCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Apelido", "Nome", "Cell", "e-mail", "Title 6"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 290, 580, 90);

        txtChave.setBackground(new java.awt.Color(144, 180, 90));
        txtChave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtChave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChaveKeyReleased(evt);
            }
        });
        jPanel1.add(txtChave);
        txtChave.setBounds(260, 20, 130, 20);

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setText("Chave");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(128, 20, 60, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        Adicionar();
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void txtChaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyReleased
        // enquanto digitando vai actualizando
        PesquisaCliente();
    }//GEN-LAST:event_txtChaveKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        PreencherCampos();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        Remover();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        ActualizarCliente();
    }//GEN-LAST:event_btnactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtCell;
    private javax.swing.JTextField txtChave;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomes;
    // End of variables declaration//GEN-END:variables
}
