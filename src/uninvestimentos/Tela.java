/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uninvestimentos;

/**
 *
 * @author User
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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
        jIFrameRegistar = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
<<<<<<< HEAD
        tfApelido = new javax.swing.JTextField();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTelfone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMorada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDataIngresso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        btnGravar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
=======
>>>>>>> parent of 47210d7... Tela De Registo
=======
>>>>>>> parent of 47210d7... Tela De Registo
        jMenuBar1 = new javax.swing.JMenuBar();
        mnRegistar = new javax.swing.JMenu();
        mnPesquisar = new javax.swing.JMenu();
        mnListar = new javax.swing.JMenu();
        mnRemover = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jIFrameRegistar.setClosable(true);
        jIFrameRegistar.setTitle("Registar Funcionario");
        jIFrameRegistar.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Apelido:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sexo:");

<<<<<<< HEAD
<<<<<<< HEAD
        tfApelido.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfApelido.setBorder(null);

        rbM.setText("Masculino");

        rbF.setText("Feminino");

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfNome.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        tfTelfone.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfTelfone.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Morada:");

        tfMorada.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfMorada.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Data de Ingresso: ");

        tfDataIngresso.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfDataIngresso.setBorder(null);

        jLabel7.setText("dd/mm/yyyy");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Salario:");

        tfSalario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfSalario.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccione a categoria", "CAIXA", "GESTOR", "FAXINEIRO" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout internalFrameRegistarLayout = new javax.swing.GroupLayout(internalFrameRegistar.getContentPane());
        internalFrameRegistar.getContentPane().setLayout(internalFrameRegistarLayout);
        internalFrameRegistarLayout.setHorizontalGroup(
            internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFrameRegistarLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(80, 80, 80)
                            .addComponent(tfApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFrameRegistarLayout.createSequentialGroup()
                            .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                                    .addComponent(rbM)
                                    .addGap(79, 79, 79)
                                    .addComponent(rbF))
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                            .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfDataIngresso)
                                .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                                    .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                                            .addComponent(btnLimpar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGravar))
                                        .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfTelfone)
                                            .addComponent(tfMorada)
                                            .addComponent(jLabel7)
                                            .addComponent(tfSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(18, Short.MAX_VALUE))
=======
        javax.swing.GroupLayout jIFrameRegistarLayout = new javax.swing.GroupLayout(jIFrameRegistar.getContentPane());
        jIFrameRegistar.getContentPane().setLayout(jIFrameRegistarLayout);
        jIFrameRegistarLayout.setHorizontalGroup(
            jIFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFrameRegistarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
=======
        javax.swing.GroupLayout jIFrameRegistarLayout = new javax.swing.GroupLayout(jIFrameRegistar.getContentPane());
        jIFrameRegistar.getContentPane().setLayout(jIFrameRegistarLayout);
        jIFrameRegistarLayout.setHorizontalGroup(
            jIFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFrameRegistarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
>>>>>>> parent of 47210d7... Tela De Registo
                .addGroup(jIFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(478, Short.MAX_VALUE))
<<<<<<< HEAD
>>>>>>> parent of 47210d7... Tela De Registo
=======
>>>>>>> parent of 47210d7... Tela De Registo
        );
        jIFrameRegistarLayout.setVerticalGroup(
            jIFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFrameRegistarLayout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
<<<<<<< HEAD
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfApelido, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3))
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbM)
                    .addComponent(rbF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                .addComponent(jLabel1)
>>>>>>> parent of 47210d7... Tela De Registo
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
<<<<<<< HEAD
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)

                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfTelfone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDataIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(internalFrameRegistarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)


                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(internalFrameRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnLimpar))
                .addContainerGap())
=======
                .addComponent(jLabel3)
                .addContainerGap(502, Short.MAX_VALUE))
>>>>>>> parent of 47210d7... Tela De Registo
=======
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(502, Short.MAX_VALUE))
>>>>>>> parent of 47210d7... Tela De Registo
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jIFrameRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jIFrameRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        mnRegistar.setText("Registar");
        jMenuBar1.add(mnRegistar);

        mnPesquisar.setText("Pesquisar");
        jMenuBar1.add(mnPesquisar);

        mnListar.setText("Listar");
        jMenuBar1.add(mnListar);

        mnRemover.setText("Remover");
        jMenuBar1.add(mnRemover);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
<<<<<<< HEAD
    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGravarActionPerformed

    private void mnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistarActionPerformed
       
    }//GEN-LAST:event_mnRegistarActionPerformed

    private void mnRegistarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRegistarMouseClicked
        internalFrameRegistar.setVisible(true);
    }//GEN-LAST:event_mnRegistarMouseClicked

=======
>>>>>>> parent of 47210d7... Tela De Registo
=======
>>>>>>> parent of 47210d7... Tela De Registo
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JInternalFrame internalFrameRegistar;


    private javax.swing.JButton jButton1;

    private javax.swing.JComboBox jComboBox1;

=======
    private javax.swing.JInternalFrame jIFrameRegistar;
>>>>>>> parent of 47210d7... Tela De Registo
=======
    private javax.swing.JInternalFrame jIFrameRegistar;
>>>>>>> parent of 47210d7... Tela De Registo
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnListar;
    private javax.swing.JMenu mnPesquisar;
    private javax.swing.JMenu mnRegistar;
    private javax.swing.JMenu mnRemover;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JRadioButton rbF;
    private javax.swing.ButtonGroup rbGrupoSexo;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField tfApelido;
    private javax.swing.JTextField tfDataIngresso;
    private javax.swing.JTextField tfMorada;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTelfone;
=======
>>>>>>> parent of 47210d7... Tela De Registo
=======
>>>>>>> parent of 47210d7... Tela De Registo
    // End of variables declaration//GEN-END:variables
}
