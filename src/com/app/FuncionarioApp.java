
package com.app;

import com.entidades.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import util.HibernateUtil;


/**
 *
 * @author Catherin
 */
public class FuncionarioApp extends javax.swing.JDialog {

    /**
     * Creates new form FuncionariosApp
     */
    public FuncionarioApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        arranque();
    }
    
    private Session st;
    private DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFunc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Funcionarios"));

        jLabel2.setText("Id");

        jLabel3.setText("Nombre");

        jLabel4.setText("Cargo");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Depósito", "Contabilidad" }));

        jLabel5.setText("Apellido");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Dirección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Dirección", "Teléfono", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFunc);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setText("Nuevo");
        btnNuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);

        btnGuardar.setText("Guardar");
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);

        btnEditar.setText("Editar");
        btnEditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);

        btnInforme.setText("Informe");
        btnInforme.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnInforme);

        btnCancelar.setText("Cancelar");
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("FUNCIONARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncMouseClicked
        obtenerTabla();
    }//GEN-LAST:event_tblFuncMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        arranque();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioApp dialog = new FuncionarioApp(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFunc;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        txtId.setText(null);
        txtNom.setText(null);
        txtApe.setText(null);
        txtDir.setText(null);
        txtTel.setText(null);
        cbCargo.setSelectedIndex(-1);
        btnGuardar.setText("Guardar");
    }
    
    private void arranque() {
        txtId.setEnabled(false);
        txtNom.setEnabled(false);
        txtApe.setEnabled(false);
        txtDir.setEnabled(false);
        txtTel.setEnabled(false);
        cbCargo.setEnabled(false);
        limpiar();
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnInforme.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnGuardar.setText("Guardar");
        tblFunc.setEnabled(true);
        defaultTableModel();
        cargarTabla();
    }

    private void obtenerTabla() {
        st = HibernateUtil.getSessionFactory().openSession();
        st.beginTransaction();
        int selectedRow = tblFunc.getSelectedRow();
        int idFunc = Integer.parseInt(String.valueOf(model.getValueAt(selectedRow, 0)));
        Funcionario func = (Funcionario)st.load(Funcionario.class, idFunc);
        txtId.setText(String.valueOf(func.getId()));
        txtNom.setText(String.valueOf(func.getNombres()));
        txtApe.setText(String.valueOf(func.getApellidos()));
        txtDir.setText(String.valueOf(func.getDir()));
        txtTel.setText(String.valueOf(func.getTel()));
        cbCargo.setSelectedItem(func.getCargo());
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setText("Actualizar");
        st.getTransaction().commit();
        st.close();
    }

    private void nuevo() {
        limpiar();
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtDir.setEnabled(true);
        txtTel.setEnabled(true);
        cbCargo.setEnabled(true);
        txtId.setText("Auto");
    }

    private void guardar() {
        if(txtNom.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete el Nombre del Funcionario.");
        }else{
            if(txtApe.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Complete el Apellido del Funcionario.");
            }else{
                if(txtDir.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete la dirección del Funcionario.");
                }else{
                    if(txtTel.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Complete el teléfono del Funcionario.");
                    }else{
                        if(cbCargo.getSelectedIndex()==-1){
                            JOptionPane.showMessageDialog(null, "Seleccione el cargo del Funcionario.");
                        }else{
                            if(btnGuardar.getText().equals("Guardar")){
                                st = HibernateUtil.getSessionFactory().openSession();
                                st.beginTransaction();
                                Funcionario func = new Funcionario();
                                func.setNombres(txtNom.getText());
                                func.setApellidos(txtApe.getText());
                                func.setDir(txtDir.getText());
                                func.setTel(txtTel.getText());
                                func.setCargo(String.valueOf(cbCargo.getSelectedItem()));
                                st.save(func);
                                st.getTransaction().commit();
                                st.close();
                                arranque();
                                JOptionPane.showMessageDialog(null, "Funcionario guardado correctamente.");                           
                            }else{
                                st = HibernateUtil.getSessionFactory().openSession();
                                st.beginTransaction();
                                int selectedRow = tblFunc.getSelectedRow();
                                int idFunc = Integer.parseInt(String.valueOf(model.getValueAt(selectedRow, 0)));
                                Funcionario func = (Funcionario)st.load(Funcionario.class, idFunc);
                                func.setNombres(txtNom.getText());
                                func.setApellidos(txtApe.getText());
                                func.setDir(txtDir.getText());
                                func.setTel(txtTel.getText());
                                func.setCargo(String.valueOf(cbCargo.getSelectedItem()));
                                st.update(func);
                                st.getTransaction().commit();
                                st.close();
                                arranque();
                                JOptionPane.showMessageDialog(null, "Funcionario actualizado correctamente.");
                            }
                        }
                    }
                }
            }
        }
    }

    private void editar() {
        btnGuardar.setEnabled(true);
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtDir.setEnabled(true);
        txtTel.setEnabled(true);
        cbCargo.setEnabled(true);
        btnEliminar.setEnabled(false);
        tblFunc.setEnabled(false);
        btnGuardar.setText("Actualizar");
    }

    private void eliminar() {
        int opc = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este Funcionario?", "Eliminación de Registro", JOptionPane.YES_NO_OPTION);
        if(opc == 1){
            JOptionPane.showMessageDialog(null, "Registro no eliminado.");
        }
        else{
            st = HibernateUtil.getSessionFactory().openSession();
            st.beginTransaction();
            int selectedRow = tblFunc.getSelectedRow();
            Object valueAt = model.getValueAt(selectedRow, 0);
            int idFunc = Integer.parseInt(valueAt.toString());
            Funcionario func = (Funcionario)st.load(Funcionario.class, idFunc);
            st.delete(func);
            st.getTransaction().commit();
            st.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado.");
            arranque();
        }
    }

    private void defaultTableModel() {
        tblFunc.getColumnModel().getColumn(0).setPreferredWidth(25);
        tblFunc.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFunc.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblFunc.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblFunc.getColumnModel().getColumn(4).setPreferredWidth(100);
        model = (DefaultTableModel)tblFunc.getModel();
        model.setNumRows(0);
    }

    private void cargarTabla() {
        st = HibernateUtil.getSessionFactory().openSession();
        st.beginTransaction();
        List<Funcionario> lista = (List<Funcionario>)st.createQuery("From Funcionario").list();
        for(Funcionario funList : lista){
            model.addRow(new Object[]{
                funList.getId(),funList.getNombres() + " " + funList.getApellidos(), funList.getDir(),
                funList.getTel(), funList.getCargo()
            });
        }
        st.getTransaction().commit();
        st.close();
    }
}
