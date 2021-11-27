/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacao;

import java.sql.*;
import javax.swing.JOptionPane;
import Validacao.Conexao;

/**
 *
 * @author Angel Banze
 */
public class Usuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    
    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        conexao = Conexao.Conector();
    }

    private void Adicionar(){
        String sql = "insert into funcionario (func_nome, func_apelido, func_id_doc, func_nr_doc, func_email, func_nacionalidade, func_es_civil, func_sexo,  func_destrito, func_bairro, func_cidade, username, senha) Values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomes.getText());
            pst.setString(2, txtApelido.getText());
            pst.setString(3, comboDocumento.getSelectedItem().toString());
            pst.setString(4, txtNrDocumento.getText());
            pst.setString(5, txtEmail.getText());
            pst.setString(6, txtNacionalidade.getText());
            pst.setString(7, combEstado.getSelectedItem().toString());
            pst.setString(8, comboSexo.getSelectedItem().toString());
            pst.setString(9, txtDistrito.getText());
            pst.setString(10, txtBairro.getText());
            pst.setString(11, txtCidade.getText());
            pst.setString(12, txtUserName.getText());
            pst.setString(13, txtSenha.getText());
           
           
            //validar campos obrigatorios
            if (txtNomes.getText().equals("") || txtNrDocumento.getText().equals("") || txtEmail.getText().equals("") || txtSenha.getText().equals("") || txtCidade.getText().equals("")|| txtCell1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos importantes");
            } else {
                //adicionando a DB
                
                int resultado = pst.executeUpdate();
                
                if(resultado > 0){
                    JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso!!!");
                    txtNomes.setText(null);
                    txtDistrito.setText(null);
                    txtBairro.setText(null);
                    txtCidade.setText(null);
                    txtSenha.setText(null);
                    txtEmail.setText(null);
                    txtNrDocumento.setText(null);
                    txtApelido.setText(null);
                    txtCod.setText(null);
                    txtNacionalidade.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String sql2 = "insert into telefone (func_cod, telefone) Values (?,?)";
        recuperarCod();
        try {
            pst2 = conexao.prepareStatement(sql2);
            pst2.setString(1, txtCod.getText());
            pst2.setString(2, txtCell1.getText());
            
            pst2.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    private void recuperarCod (){
        String sql = "select max(func_cod) from funcionario";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if (rs.next()){
                txtCod.setText(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        txtApelido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtNomes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCell1 = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtNrDocumento = new javax.swing.JTextField();
        comboDocumento = new javax.swing.JComboBox<>();
        combEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSubmit1 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(144, 180, 90));
        jPanel2.setLayout(null);

        btnSubmit.setBackground(new java.awt.Color(144, 180, 90));
        btnSubmit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSubmit.setText("Adicionar");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubmit);
        btnSubmit.setBounds(240, 440, 110, 40);

        txtApelido.setBackground(new java.awt.Color(144, 180, 90));
        txtApelido.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtApelido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtApelido);
        txtApelido.setBounds(180, 110, 130, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Apelido");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 110, 58, 18);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Outros nomes");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 140, 109, 18);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Senha LogIn");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 170, 100, 18);

        txtSenha.setBackground(new java.awt.Color(144, 180, 90));
        txtSenha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtSenha);
        txtSenha.setBounds(180, 170, 130, 20);

        txtNomes.setBackground(new java.awt.Color(144, 180, 90));
        txtNomes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNomes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtNomes);
        txtNomes.setBounds(180, 140, 130, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Celular");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 250, 54, 18);

        txtCell1.setBackground(new java.awt.Color(144, 180, 90));
        txtCell1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCell1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtCell1);
        txtCell1.setBounds(180, 250, 131, 20);

        txtUserName.setBackground(new java.awt.Color(144, 180, 90));
        txtUserName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtUserName);
        txtUserName.setBounds(180, 210, 131, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("UserName");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 210, 100, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("e-mail");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 280, 47, 18);

        txtEmail.setBackground(new java.awt.Color(144, 180, 90));
        txtEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtEmail.setText("eg: xxx@hotmail.com ");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtEmail);
        txtEmail.setBounds(140, 280, 177, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 310, 56, 18);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Nacionalidade");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(60, 340, 107, 18);

        txtNacionalidade.setBackground(new java.awt.Color(144, 180, 90));
        txtNacionalidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNacionalidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtNacionalidade);
        txtNacionalidade.setBounds(180, 340, 130, 20);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(470, 320, 53, 18);

        txtCidade.setBackground(new java.awt.Color(144, 180, 90));
        txtCidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtCidade);
        txtCidade.setBounds(430, 350, 130, 20);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Distrito");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(620, 320, 56, 18);

        txtDistrito.setBackground(new java.awt.Color(144, 180, 90));
        txtDistrito.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtDistrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtDistrito);
        txtDistrito.setBounds(580, 350, 130, 20);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Bairro");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(760, 320, 48, 18);

        txtBairro.setBackground(new java.awt.Color(144, 180, 90));
        txtBairro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtBairro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtBairro);
        txtBairro.setBounds(720, 350, 130, 20);

        txtNrDocumento.setBackground(new java.awt.Color(144, 180, 90));
        txtNrDocumento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNrDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtNrDocumento);
        txtNrDocumento.setBounds(630, 250, 188, 20);

        comboDocumento.setBackground(new java.awt.Color(144, 180, 90));
        comboDocumento.setEditable(true);
        comboDocumento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        comboDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BI", "Passport", "DIRE" }));
        comboDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        comboDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(comboDocumento);
        comboDocumento.setBounds(630, 220, 124, 24);

        combEstado.setBackground(new java.awt.Color(144, 180, 90));
        combEstado.setEditable(true);
        combEstado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        combEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solteiro/a", "casado/a", "divorciado/a", "viuvo/a" }));
        combEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        combEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(combEstado);
        combEstado.setBounds(630, 180, 124, 24);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Estado Civil");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(460, 180, 90, 18);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Tipo de Documento");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(460, 220, 151, 18);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Nº do Documento");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(460, 250, 150, 18);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 51, 0));
        jLabel13.setText("Morada");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(460, 290, 58, 18);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Dados");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 30, 48, 18);

        jPanel3.setBackground(new java.awt.Color(144, 180, 90));
        jPanel3.setLayout(null);

        btnSubmit1.setBackground(new java.awt.Color(144, 180, 90));
        btnSubmit1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSubmit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/Submit.png"))); // NOI18N
        btnSubmit1.setText("Submeter");
        btnSubmit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSubmit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSubmit1);
        btnSubmit1.setBounds(550, 440, 190, 60);

        jTextField12.setBackground(new java.awt.Color(144, 180, 90));
        jTextField12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField12);
        jTextField12.setBounds(210, 260, 130, 20);

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setText("Apelido");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(90, 260, 58, 18);

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("Outros nomes");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(90, 290, 109, 18);

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setText("Senha LogIn");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(90, 320, 100, 18);

        jTextField13.setBackground(new java.awt.Color(144, 180, 90));
        jTextField13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField13);
        jTextField13.setBounds(210, 320, 130, 20);

        jTextField14.setBackground(new java.awt.Color(144, 180, 90));
        jTextField14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField14);
        jTextField14.setBounds(210, 290, 130, 20);

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("Celular 1");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(90, 360, 69, 18);

        jTextField15.setBackground(new java.awt.Color(144, 180, 90));
        jTextField15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField15.setText("+258 ");
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField15);
        jTextField15.setBounds(210, 360, 131, 20);

        jTextField16.setBackground(new java.awt.Color(144, 180, 90));
        jTextField16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField16.setText("+258 ");
        jTextField16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField16);
        jTextField16.setBounds(210, 390, 131, 20);

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setText("Celular 2");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(90, 390, 69, 18);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setText("e-mail");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(90, 430, 47, 18);

        jTextField17.setBackground(new java.awt.Color(144, 180, 90));
        jTextField17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField17.setText("eg: xxx@hotmail.com ");
        jTextField17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField17);
        jTextField17.setBounds(160, 430, 177, 20);

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel24.setText("Genero");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(90, 450, 56, 18);

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel25.setText("Nacionalidade");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(90, 490, 107, 18);

        jTextField18.setBackground(new java.awt.Color(144, 180, 90));
        jTextField18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField18);
        jTextField18.setBounds(210, 480, 130, 20);

        jRadioButton3.setBackground(new java.awt.Color(144, 180, 90));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Masc");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(200, 450, 45, 19);

        jRadioButton4.setBackground(new java.awt.Color(144, 180, 90));
        jRadioButton4.setText("Fem");
        jRadioButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(260, 450, 41, 19);

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Cidade");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(410, 190, 53, 18);

        jTextField19.setBackground(new java.awt.Color(144, 180, 90));
        jTextField19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField19);
        jTextField19.setBounds(380, 220, 130, 20);

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setText("Distrito");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(550, 190, 56, 18);

        jTextField20.setBackground(new java.awt.Color(144, 180, 90));
        jTextField20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField20);
        jTextField20.setBounds(530, 220, 130, 20);

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Bairro");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(710, 190, 48, 18);

        jTextField21.setBackground(new java.awt.Color(144, 180, 90));
        jTextField21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField21);
        jTextField21.setBounds(670, 220, 130, 20);

        jTextField22.setBackground(new java.awt.Color(144, 180, 90));
        jTextField22.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jTextField22);
        jTextField22.setBounds(580, 120, 188, 20);

        jComboBox3.setBackground(new java.awt.Color(144, 180, 90));
        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BI", "Passaport", "Dire", "Carta de Condução" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(580, 80, 124, 24);

        jComboBox4.setBackground(new java.awt.Color(144, 180, 90));
        jComboBox4.setEditable(true);
        jComboBox4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(580, 50, 124, 24);

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setText("Estado Civil");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(410, 50, 90, 18);

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setText("Aqui vem uma foto");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(90, 70, 147, 18);

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setText("Tipo de Documento");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(410, 90, 151, 18);

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel32.setText("Nº do Documtno");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(410, 120, 128, 18);

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 51, 0));
        jLabel33.setText("Morada");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(410, 160, 58, 18);

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 51, 0));
        jLabel34.setText("Dados");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(90, 220, 48, 18);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Codigo");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 80, 55, 18);

        txtCod.setBackground(new java.awt.Color(144, 180, 90));
        txtCod.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtCod);
        txtCod.setBounds(180, 80, 130, 20);

        btnPesquisa.setBackground(new java.awt.Color(144, 180, 90));
        btnPesquisa.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(btnPesquisa);
        btnPesquisa.setBounds(360, 80, 110, 20);

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
        jPanel2.add(comboSexo);
        comboSexo.setBounds(180, 310, 124, 24);

        btnUpdate.setBackground(new java.awt.Color(144, 180, 90));
        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(360, 440, 110, 40);

        btnDelete.setBackground(new java.awt.Color(144, 180, 90));
        btnDelete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDelete.setText("Actualizar");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(480, 440, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Adicionar();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDocumentoActionPerformed

    private void combEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combEstadoActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> combEstado;
    private javax.swing.JComboBox<String> comboDocumento;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCell1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNomes;
    private javax.swing.JTextField txtNrDocumento;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
