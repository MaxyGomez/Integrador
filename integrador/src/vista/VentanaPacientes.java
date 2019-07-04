package vista;

import controlador.Controlador;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import modelo.Paciente;

public class VentanaPacientes extends javax.swing.JFrame {
    
    private final Controlador controlador;
    private final JFrame previo;
    private Paciente paciente;
    
    
    public VentanaPacientes(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();      
        limpiar();     
    }
    
    void limpiar() {
        this.LPacientes.setListData(this.controlador.listarPacientes().toArray());
        this.LPacientes.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LPacientes = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana de Pacientes");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LPacientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LPacientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LPacientes);

        jLabel1.setText("LISTA DE PACIENTES");

        bAgregar.setText("Agregar Paciente");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bEditar.setText("Editar Pacientes");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bEditar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
    
    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
    VentanaPacienteABM vpabm = new VentanaPacienteABM(this.controlador, this);
    this.setVisible(false);
    vpabm.setLocationRelativeTo(null);
    vpabm.setResizable(false);
    vpabm.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
    // verificamos que la lista tenga un item seleccionado
    // obtengo el item seleccionado
    
    
    if (!this.LPacientes.isSelectionEmpty()) {
        VentanaPacienteABM vpabm = new VentanaPacienteABM(this.controlador, this, this.paciente);
        this.setVisible(false);
        vpabm.setLocationRelativeTo(null);
        vpabm.setResizable(false);
        vpabm.setVisible(true);
    }
    
    // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    private void LPacientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LPacientesValueChanged
        if (!this.LPacientes.isSelectionEmpty()) {
            this.paciente =(Paciente) this.LPacientes.getSelectedValue();                        
        }
    /*    // verificamos que la lista tenga un item seleccionado
        if (!this.LPacientes.isSelectionEmpty()) {
            // obtengo el item seleccionado
            Paciente empleado = (Empleado) this.listaEmpleados.getSelectedValue();
            // asigno los valores de los atributos a las caja de texto
            this.labelId.setText(empleado.getId().toString());
            this.txtApellidos.setText(empleado.getApellidos());
            this.txtNombres.setText(empleado.getNombres());
            // en el caso de fecha verifico si hay un valor            
            if (empleado.getFechaIngreso() != null ) {
                // asigno el valor del atributo fechaAlta a la caja de texto
                SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                this.txtFechaIngreso.setText(fecha.format(empleado.getFechaIngreso()));
            } else {
                this.txtFechaIngreso.setText("");
            }
            // obtengo la direccion
            Direccion d = empleado.getDireccion();
            // si existe una direccion cargo
            // asigno los valores de los atributos a las caja de texto
            if (d != null) {
                this.txtCalle.setText(d.getCalle());
                this.txtNumero.setText(d.getNumero());
                this.txtLocalidad.setText(d.getLocalidad());
                this.txtProvincia.setText(d.getProvincia());
            } else {
                // sino dejo vacias las cajas de texto
                this.txtCalle.setText("");
                this.txtNumero.setText("");
                this.txtLocalidad.setText("");
                this.txtProvincia.setText("");
            }
            // si el departamento no existe
            System.out.println(empleado.getDepartamento());
            if (empleado.getDepartamento() != null) {
                this.comboDepartamentos.setSelectedItem(empleado.getDepartamento());
            } else {
                this.comboDepartamentos.setSelectedItem(null);
            }
        }*/
    
        // TODO add your handling code here:
    }//GEN-LAST:event_LPacientesValueChanged

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList LPacientes;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

