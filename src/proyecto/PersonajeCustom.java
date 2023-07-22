/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author UO279176
 */
public class PersonajeCustom extends javax.swing.JDialog {

    /**
     * Creates new form PersonajeCustom
     */
    private PersonajeCustom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PersonajeCustom()
    {
        this(null, true);
    }
    
    public boolean showDialog()
    {
        POK = false;
        setVisible(true);
        return POK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SVida = new javax.swing.JSpinner();
        SAtaque = new javax.swing.JSpinner();
        SDefensa = new javax.swing.JSpinner();
        SProbCrit = new javax.swing.JSpinner();
        SFatigaI = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BAceptar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BVida = new javax.swing.JButton();
        BAtaque = new javax.swing.JButton();
        BFatigaI = new javax.swing.JButton();
        BDefensa = new javax.swing.JButton();
        BProbCrit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        SVida.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SVidaStateChanged(evt);
            }
        });

        SAtaque.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SAtaqueStateChanged(evt);
            }
        });

        SDefensa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SDefensaStateChanged(evt);
            }
        });

        SProbCrit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SProbCritStateChanged(evt);
            }
        });

        SFatigaI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SFatigaIStateChanged(evt);
            }
        });

        jLabel2.setText("Vida:");

        jLabel3.setText("Ataque:");

        jLabel4.setText("Defensa:");

        jLabel5.setText("Prob. Crit:");

        jLabel6.setText("Fatiga inicial:");

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        BVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/question_mark.png"))); // NOI18N
        BVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVidaActionPerformed(evt);
            }
        });

        BAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/question_mark.png"))); // NOI18N
        BAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtaqueActionPerformed(evt);
            }
        });

        BFatigaI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/question_mark.png"))); // NOI18N
        BFatigaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFatigaIActionPerformed(evt);
            }
        });

        BDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/question_mark.png"))); // NOI18N
        BDefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDefensaActionPerformed(evt);
            }
        });

        BProbCrit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/question_mark.png"))); // NOI18N
        BProbCrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProbCritActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SFatigaI, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(SProbCrit)
                                .addComponent(SDefensa)
                                .addComponent(SAtaque)
                                .addComponent(SVida)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BVida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BFatigaI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BProbCrit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(SVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BVida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(BAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(BDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SProbCrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(BProbCrit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SFatigaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(BFatigaI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAceptar)
                    .addComponent(BCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVidaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "La vida máxima e inicial del personaje. Cada dos puntos de vida se consume un punto de habilidad.", "Atributo: Vida", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BVidaActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        // TODO add your handling code here:
        POK = true;
        setVisible(false);
    }//GEN-LAST:event_BAceptarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtaqueActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El daño base que infligirá al contrario, muy importante para el cálculo de daño.", "Atributo: Ataque", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BAtaqueActionPerformed

    private void BDefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDefensaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Aguante del personaje ante un ataque. Se trata como un porcentaje de absorción de daño. Máximo 50 de defensa.", "Atributo: Defensa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BDefensaActionPerformed

    private void BProbCritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProbCritActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Si atacas, puedes llegar a ignorar las defensas del contrario y además infligir el doble del ataque. Al defender, puedes contrarrestar el ataque del contrario y hacerle un 50% del daño que se iba a recibir. Se trata como un porcentaje. Máximo 100 de probabilidad crítica.", "Atributo: Probabilidad crítica", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BProbCritActionPerformed

    private void BFatigaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFatigaIActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cada vez que ataques, tu fatiga aumentará en esta cantidad y cuando te recuperes de un fallo volverá a este valor. Al defender se puede bajar de este límite inferior. Se trata como un porcentaje. Máximo 100 de fatiga inicial. Ganas 2 puntos por cada unidad de fatiga inicial para asignar a otro atributo.", "Atributo: Fatiga inicial", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BFatigaIActionPerformed

    private void SDefensaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SDefensaStateChanged
        // TODO add your handling code here:
        if ((int)SDefensa.getValue() > 50) SDefensa.setValue(50);
        else if ((int)SDefensa.getValue() < 0) SDefensa.setValue(0);
    }//GEN-LAST:event_SDefensaStateChanged

    private void SProbCritStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SProbCritStateChanged
        // TODO add your handling code here:
        if ((int)SProbCrit.getValue() > 100) SProbCrit.setValue(100);
        else if ((int)SProbCrit.getValue() < 0) SProbCrit.setValue(0);
    }//GEN-LAST:event_SProbCritStateChanged

    private void SFatigaIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SFatigaIStateChanged
        // TODO add your handling code here:
        if ((int)SFatigaI.getValue() > 100) SFatigaI.setValue(100);
        else if ((int)SFatigaI.getValue() < 0) SFatigaI.setValue(0);
    }//GEN-LAST:event_SFatigaIStateChanged

    private void SAtaqueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SAtaqueStateChanged
        // TODO add your handling code here:
        if ((int)SAtaque.getValue() < 0) SAtaque.setValue(0);
    }//GEN-LAST:event_SAtaqueStateChanged

    private void SVidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SVidaStateChanged
        // TODO add your handling code here:
        if ((int)SVida.getValue() < 0) SVida.setValue(0);
    }//GEN-LAST:event_SVidaStateChanged

    public String getNombreD() {return TFNombre.getText();}
    public int getVidaD() {return (int)SVida.getValue();}
    public int getAtaqueD() {return (int)SAtaque.getValue();}
    public int getDefensaD() {return (int)SDefensa.getValue();}
    public int getProbCritD() {return (int)SProbCrit.getValue();}
    public int getFatigaID() {return (int)SFatigaI.getValue();}
    
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
            java.util.logging.Logger.getLogger(PersonajeCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonajeCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonajeCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonajeCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonajeCustom dialog = new PersonajeCustom(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private boolean POK;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BAtaque;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BDefensa;
    private javax.swing.JButton BFatigaI;
    private javax.swing.JButton BProbCrit;
    private javax.swing.JButton BVida;
    private javax.swing.JSpinner SAtaque;
    private javax.swing.JSpinner SDefensa;
    private javax.swing.JSpinner SFatigaI;
    private javax.swing.JSpinner SProbCrit;
    private javax.swing.JSpinner SVida;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
