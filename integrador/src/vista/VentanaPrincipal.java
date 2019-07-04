
package vista;

import controlador.Controlador;

/**
 *
 * @author Maxy
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private final Controlador controlador;
    /**
     * Creates new form ventana_principal
     */
    public VentanaPrincipal(Controlador c) {
        this.controlador = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_doc = new javax.swing.JButton();
        btn_pac = new javax.swing.JButton();
        btn_cit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Integrador ");
        setPreferredSize(new java.awt.Dimension(300, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_doc.setText("Doctores");
        btn_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docActionPerformed(evt);
            }
        });

        btn_pac.setText("Pacientes");
        btn_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacActionPerformed(evt);
            }
        });

        btn_cit.setText("Citas");
        btn_cit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citActionPerformed(evt);
            }
        });

        jButton1.setText("Especialidades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_doc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cit, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docActionPerformed
        VentanaDoctores vd = new VentanaDoctores(this.controlador, this);
        this.setVisible(false);
        vd.setLocationRelativeTo(null);
        vd.setResizable(false);
        vd.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_docActionPerformed
    
    private void btn_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacActionPerformed
    VentanaPacientes vp = new VentanaPacientes(this.controlador, this);
    this.setVisible(false);
    vp.setLocationRelativeTo(null);
    vp.setResizable(false);
    vp.setVisible(true);
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pacActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btn_citActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citActionPerformed
        VentanaCitas vc = new VentanaCitas(this.controlador, this);
        this.setVisible(false);
        vc.setLocationRelativeTo(null);
        vc.setResizable(false);
        vc.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaEspecialidades ve = new VentanaEspecialidades(this.controlador, this);
        this.setVisible(true);
        ve.setLocationRelativeTo(null);
        ve.setResizable(false);
        ve.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cit;
    private javax.swing.JButton btn_doc;
    private javax.swing.JButton btn_pac;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
