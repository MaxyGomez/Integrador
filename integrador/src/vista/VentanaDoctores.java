/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import modelo.Medico;
import modelo.Paciente;



public class VentanaDoctores extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Medico medico;
    
    public VentanaDoctores(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        this.medico = medico;
        initComponents();      
        limpiar();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LDoctor = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LDoctor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LDoctorValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LDoctor);

        jLabel1.setText("LISTA DE DOCTORES");

        bEditar.setText("Editar Doctor");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bAgregar.setText("Agregar Doctor");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAgregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEditar)
                    .addComponent(bAgregar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     void limpiar() {
        this.LDoctor.setListData(this.controlador.listarMedicos().toArray());
        this.LDoctor.clearSelection();
     }
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
    VentanaDoctoresABM vdabm = new VentanaDoctoresABM(this.controlador, this);
    this.setVisible(false);
    vdabm.setLocationRelativeTo(null);
    vdabm.setResizable(false);
    vdabm.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

        if (!this.LDoctor.isSelectionEmpty()) {
            VentanaDoctoresABM vdABM = new VentanaDoctoresABM(this.controlador, this, this.medico);
            this.setVisible(true);
            vdABM.setLocationRelativeTo(null);
            vdABM.setResizable(false);
            vdABM.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    private void LDoctorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LDoctorValueChanged
         if (!this.LDoctor.isSelectionEmpty()) {
            this.medico = (Medico) this.LDoctor.getSelectedValue();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LDoctorValueChanged

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList LDoctor;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
