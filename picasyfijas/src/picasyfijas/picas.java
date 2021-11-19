/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picasyfijas;

import java.util.Random;

public class picas extends javax.swing.JFrame {

    public picas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTexNUM1 = new javax.swing.JTextField();
        jTexNUM2 = new javax.swing.JTextField();
        jTexNUM3 = new javax.swing.JTextField();
        jTexNUM4 = new javax.swing.JTextField();
        jButjugar = new javax.swing.JButton();
        jButsalir = new javax.swing.JButton();
        jTexNUM5 = new javax.swing.JTextField();
        jTexNUM6 = new javax.swing.JTextField();
        jTexNUM7 = new javax.swing.JTextField();
        jTexNUM8 = new javax.swing.JTextField();
        jTextresul = new javax.swing.JTextField();
        jtextguia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PICAS Y FIJAS");
        setBackground(new java.awt.Color(0, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("PICAS Y FIJAS");

        jTexNUM1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexNUM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexNUM4ActionPerformed(evt);
            }
        });

        jButjugar.setBackground(new java.awt.Color(255, 255, 51));
        jButjugar.setText("JUGAR");
        jButjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButjugarActionPerformed(evt);
            }
        });

        jButsalir.setBackground(new java.awt.Color(255, 255, 51));
        jButsalir.setText("SALIR");
        jButsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButsalirActionPerformed(evt);
            }
        });

        jTexNUM5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM6.setBackground(new java.awt.Color(240, 240, 240));
        jTexNUM6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM7.setBackground(new java.awt.Color(240, 240, 240));
        jTexNUM7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTexNUM8.setBackground(new java.awt.Color(240, 240, 240));
        jTexNUM8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTexNUM8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexNUM8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexNUM8ActionPerformed(evt);
            }
        });

        jtextguia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtextguia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextguia.setText("\"Intrucciones: Usted debe adivinar un numero de 4 digitos. Tiene 20 oportunidades, en las que se le irá informando el número de picas y fijas \"); \t\tSystem.out.println(\"Picas: Número correcto en posicion incorrecta\"); \t\tSystem.out.println(\"Fijas: Número correcto en posicion correctaADIVINE EL NÚMERO DE 4 DÍGITOS\");");
        jtextguia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextguiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jTexNUM5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButjugar)
                                        .addGap(9, 9, 9))
                                    .addComponent(jTexNUM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(409, 409, 409)
                                .addComponent(jButsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTexNUM6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTexNUM7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTexNUM8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTexNUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTexNUM4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTexNUM3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addComponent(jtextguia, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 132, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jTextresul, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexNUM5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexNUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexNUM3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtextguia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextresul, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTexNUM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexNUM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexNUM4ActionPerformed

    private void jButjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButjugarActionPerformed
   int num = 0, pos = 0, num2 = 0, num1 = 0, picas = 0, fijas = 0, vidas = 19, opcion;
		int[] Num = new int[4];
		int[] Num1 = new int[4];
        String string = null;
                       
    }//GEN-LAST:event_jButjugarActionPerformed

    private void jButsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButsalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButsalirActionPerformed

    private void jTexNUM8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexNUM8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexNUM8ActionPerformed

    private void jtextguiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextguiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextguiaActionPerformed

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
            java.util.logging.Logger.getLogger(picas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new picas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButjugar;
    private javax.swing.JButton jButsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexNUM1;
    private javax.swing.JTextField jTexNUM2;
    private javax.swing.JTextField jTexNUM3;
    private javax.swing.JTextField jTexNUM4;
    private javax.swing.JTextField jTexNUM5;
    private javax.swing.JTextField jTexNUM6;
    private javax.swing.JTextField jTexNUM7;
    private javax.swing.JTextField jTexNUM8;
    private javax.swing.JTextField jTextresul;
    private javax.swing.JTextField jtextguia;
    // End of variables declaration//GEN-END:variables
}
