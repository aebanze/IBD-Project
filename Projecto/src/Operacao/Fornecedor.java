/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacao;

/**
 *
 * @author Angel Banze
 */
public class Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Fornecedor
     */
    public Fornecedor() {
        initComponents();
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
        btnSubmit1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(144, 180, 90));
        jPanel1.setLayout(null);

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
        jPanel1.add(btnSubmit1);
        btnSubmit1.setBounds(430, 370, 170, 60);

        jRadioButton2.setBackground(new java.awt.Color(144, 180, 90));
        jRadioButton2.setText("Fem");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(250, 200, 41, 19);

        jRadioButton1.setBackground(new java.awt.Color(144, 180, 90));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Masc");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(190, 200, 45, 19);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 200, 56, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("e-mail");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 170, 47, 18);

        jTextField5.setBackground(new java.awt.Color(144, 180, 90));
        jTextField5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField5.setText("eg: xxx@hotmail.com ");
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 170, 177, 20);

        jTextField3.setBackground(new java.awt.Color(144, 180, 90));
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField3.setText("+258 ");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 140, 131, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 140, 54, 18);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Outros nomes");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 110, 109, 18);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Produtos a fornecer");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 50, 160, 18);

        jTextField1.setBackground(new java.awt.Color(144, 180, 90));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 80, 130, 20);

        jTextField2.setBackground(new java.awt.Color(144, 180, 90));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 110, 130, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Apelido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 80, 58, 18);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 51, 0));
        jLabel13.setText("Morada");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(90, 230, 58, 18);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 270, 53, 18);

        jTextField8.setBackground(new java.awt.Color(144, 180, 90));
        jTextField8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(210, 270, 130, 20);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Distrito");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(90, 300, 56, 18);

        jTextField9.setBackground(new java.awt.Color(144, 180, 90));
        jTextField9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(210, 300, 130, 20);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Bairro");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(90, 330, 48, 18);

        jTextField10.setBackground(new java.awt.Color(144, 180, 90));
        jTextField10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField10);
        jTextField10.setBounds(210, 330, 130, 20);

        jTextField11.setBackground(new java.awt.Color(144, 180, 90));
        jTextField11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField11);
        jTextField11.setBounds(460, 80, 130, 20);

        jTextField12.setBackground(new java.awt.Color(144, 180, 90));
        jTextField12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(460, 110, 130, 20);

        jTextField13.setBackground(new java.awt.Color(144, 180, 90));
        jTextField13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField13);
        jTextField13.setBounds(460, 170, 130, 20);

        jTextField14.setBackground(new java.awt.Color(144, 180, 90));
        jTextField14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextField14);
        jTextField14.setBounds(460, 140, 130, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}