package telaloginswing;

/**
 *
 * @author Douglas Frohlich
 */
public class CadastroProf extends javax.swing.JInternalFrame {

    public CadastroProf() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jrfem = new javax.swing.JRadioButton();
        jrmasc = new javax.swing.JRadioButton();
        cpf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtend = new javax.swing.JTextField();
        jtcpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtcomplemento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtcidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcestado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtcep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtconfemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtpassword = new javax.swing.JPasswordField();
        jbcadastrar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jtdata = new javax.swing.JFormattedTextField();
        jbnovo = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Professor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Sexo: *");

        buttonGroup1.add(jrfem);
        jrfem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrfem.setText("Feminino");
        jrfem.setEnabled(false);

        buttonGroup1.add(jrmasc);
        jrmasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrmasc.setText("Masculino");
        jrmasc.setEnabled(false);

        cpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpf.setText("CPF: *");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome: *");

        jtnome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Data Nascimento: *");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Endereço: *");

        jtend.setEnabled(false);

        jtcpf.setEnabled(false);
        jtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcpfActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Complemento: *");

        jtcomplemento.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Cidade: *");

        jtcidade.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Estado: *");

        jcestado.setEditable(true);
        jcestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcestado.setEnabled(false);
        jcestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcestadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CEP: *");

        jtcep.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("E-mail: *");

        jtemail.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Confirme o E-mail: *");

        jtconfemail.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Senha: *");

        jtpassword.setEnabled(false);
        jtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtpasswordActionPerformed(evt);
            }
        });

        jbcadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbcadastrar.setText("Cadastrar");
        jbcadastrar.setEnabled(false);

        jblimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblimpar.setText("Limpar");
        jblimpar.setEnabled(false);
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        jtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jtdata.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtdata.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jtdata.setEnabled(false);
        jtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdataActionPerformed(evt);
            }
        });

        jbnovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnovo.setText("Novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        fechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Cadastro Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtconfemail))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtcomplemento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtend))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtnome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtcidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrmasc)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrfem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtemail))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbcadastrar))))
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(jtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrmasc)
                    .addComponent(jrfem))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtconfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbcadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jbnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(37, 37, 37))
        );

        setBounds(400, 10, 579, 745);
    }// </editor-fold>//GEN-END:initComponents

    private void jtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcpfActionPerformed
       			
    }//GEN-LAST:event_jtcpfActionPerformed

    private void jcestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcestadoActionPerformed

    private void jtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdataActionPerformed

    private void jtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtpasswordActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
        jtnome.setEnabled(true);
        jtcpf.setEnabled(true);
        jtdata.setEnabled(true);
        jrmasc.setEnabled(true);
        jrfem.setEnabled(true);
        jtend.setEnabled(true);
        jtcomplemento.setEnabled(true);
        jtcidade.setEnabled(true);
        jcestado.setEnabled(true);
        jtcep.setEnabled(true);
        jtemail.setEnabled(true);
        jtconfemail.setEnabled(true);
        jtpassword.setEnabled(true);
        
        jblimpar.setEnabled(true);
        jbcadastrar.setEnabled(true);
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        
        jtnome.setText("");
        jtcpf.setText("");
        jtdata.setText("");
        jrmasc.setText("");
        jrfem.setText("");
        jtend.setText("");
        jtcomplemento.setText("");
        jtcidade.setText("");
        jcestado.setToolTipText("");
        jtcep.setText("");
        jtemail.setText("");
        jtconfemail.setText("");
        jtpassword.setText("");
        
        
    }//GEN-LAST:event_jblimparActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.fechar(); 
    }//GEN-LAST:event_fecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpf;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbcadastrar;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jbnovo;
    private javax.swing.JComboBox<String> jcestado;
    private javax.swing.JRadioButton jrfem;
    private javax.swing.JRadioButton jrmasc;
    private javax.swing.JTextField jtcep;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtcomplemento;
    private javax.swing.JTextField jtconfemail;
    private javax.swing.JFormattedTextField jtcpf;
    private javax.swing.JFormattedTextField jtdata;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtend;
    private javax.swing.JTextField jtnome;
    private javax.swing.JPasswordField jtpassword;
    // End of variables declaration//GEN-END:variables

    private void fechar(){  
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÂO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            this.dispose();  
        }  
    }  
}

