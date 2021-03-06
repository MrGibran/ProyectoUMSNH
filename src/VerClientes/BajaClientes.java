/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VerClientes;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import proyectoumnsh.Menu;

/**
 *
 * @author Raul Duran
 */
public class BajaClientes extends javax.swing.JFrame {
    private int ID = 0;
    private String curp;
    private ResultSet consulta; //variable que guardará el resultado de la consulta
    private PreparedStatement pst; //variable que ejecutará las sentencias a la B.D.
    private Connection conexion=null; //variable que llevará a cabo la conexión a la B.D.
    /**
     * Creates new form BajaClientes
     */
    public BajaClientes() {
        initComponents();
        jTxtId.setEnabled(false);
        jTxtPorCurp.setEnabled(false);
        try //manejo de interrupciones
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //se registra el controlador de MySql
            conexion=DriverManager.getConnection("jdbc:mysql://auth-db628.hostinger.com/u523670221_Banco", "u523670221_general", "AGTT.MbdD3bpJ#d");
            //se realiza la conexion mediante la dirección URL, integrada por el tipo de 
            //controlador, la ubicación de la B.D., el usuario y la contraseña para ingresar
        }
        catch(SQLException e) //si existe algún error, esta parte lo captura y administra
        {
            JOptionPane.showMessageDialog(null, e.toString());//se muestra el error generado 
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPnlEliminarCliente = new javax.swing.JPanel();
        jChcId = new javax.swing.JCheckBox();
        jTxtId = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jChcCurp = new javax.swing.JCheckBox();
        jTxtPorCurp = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMn1Opciones = new javax.swing.JMenu();
        jMntMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnlEliminarCliente.setBackground(new java.awt.Color(0, 51, 51));
        jPnlEliminarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baja de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        buttonGroup1.add(jChcId);
        jChcId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jChcId.setForeground(new java.awt.Color(255, 255, 255));
        jChcId.setText("ID");
        jChcId.setContentAreaFilled(false);
        jChcId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChcIdMouseClicked(evt);
            }
        });

        jTxtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdKeyTyped(evt);
            }
        });

        jBtnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jChcCurp);
        jChcCurp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jChcCurp.setForeground(new java.awt.Color(255, 255, 255));
        jChcCurp.setText("CURP");
        jChcCurp.setContentAreaFilled(false);
        jChcCurp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChcCurpMouseClicked(evt);
            }
        });

        jTxtPorCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPorCurpKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPnlEliminarClienteLayout = new javax.swing.GroupLayout(jPnlEliminarCliente);
        jPnlEliminarCliente.setLayout(jPnlEliminarClienteLayout);
        jPnlEliminarClienteLayout.setHorizontalGroup(
            jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlEliminarClienteLayout.createSequentialGroup()
                .addGroup(jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlEliminarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jChcId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlEliminarClienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBtnBuscar)
                        .addGap(45, 45, 45)
                        .addComponent(jBtnLimpiar)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPnlEliminarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jChcCurp)
                        .addGap(26, 26, 26)
                        .addComponent(jTxtPorCurp)))
                .addContainerGap())
        );
        jPnlEliminarClienteLayout.setVerticalGroup(
            jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlEliminarClienteLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChcId)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChcCurp)
                    .addComponent(jTxtPorCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPnlEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBuscar)
                    .addComponent(jBtnLimpiar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jMn1Opciones.setText("Opciones");

        jMntMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMntMenu.setText("Ir al  menu");
        jMntMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMntMenuActionPerformed(evt);
            }
        });
        jMn1Opciones.add(jMntMenu);

        jMenuBar1.add(jMn1Opciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdKeyTyped
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_jTxtIdKeyTyped

    private void jTxtPorCurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPorCurpKeyTyped
        if(jTxtPorCurp.getText().length() >= 18){
            evt.consume();
        }
    }//GEN-LAST:event_jTxtPorCurpKeyTyped

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jTxtId.setText("");
        jTxtPorCurp.setText("");
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jChcIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChcIdMouseClicked
        jTxtId.setEnabled(true);
        jTxtPorCurp.setEnabled(false);
    }//GEN-LAST:event_jChcIdMouseClicked

    private void jChcCurpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChcCurpMouseClicked

        jTxtPorCurp.setEnabled(true);
        jTxtId.setEnabled(false);
    }//GEN-LAST:event_jChcCurpMouseClicked

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
         ID = Integer.parseInt(jTxtId.getText());
         curp = jTxtPorCurp.getText();
         String sql,message;
        
        try{
            if (jChcId.isSelected()) {
                
                pst=conexion.prepareStatement("SELECT * FROM `Usuarios` WHERE idUsuarios = "+ID+" ");
                consulta=pst.executeQuery();
                
                if (consulta.next()){
                    message="Estas seguro que deseas eliminar a \n"
                            + ""+consulta.getString(2)+" "+ consulta.getString(3)+" "+ consulta.getString(4);
                    int input = JOptionPane.showConfirmDialog(null, message, "Confirmacion", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        int resultado,resultado2;
                     pst=conexion.prepareStatement("DELETE FROM Movimientos WHERE idUsuarios ="+ID+" ");
                     resultado = pst.executeUpdate();
                     if(resultado==1){
                         pst=conexion.prepareStatement("DELETE FROM Usuarios WHERE idUsuarios ="+ID+" ");
                         resultado2 = pst.executeUpdate();
                         if(resultado2==1){
                             JOptionPane.showMessageDialog(null, "Borrado correctamente");
                         } 
                     }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro registro!!!");
                }
            }
            if (jChcCurp.isSelected()) {
                pst=conexion.prepareStatement("SELECT * FROM `Usuarios` WHERE curp = '"+curp+"'");
                consulta=pst.executeQuery();
                
                if (consulta.next()){
                    message="Estas seguro que deseas eliminar a \n"
                            + ""+consulta.getString(2)+" "+ consulta.getString(3)+" "+ consulta.getString(4);
                    int input = JOptionPane.showConfirmDialog(null, message, "Confirmacion", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        int resultado,resultado2;
                     pst=conexion.prepareStatement("DELETE FROM Movimientos WHERE idUsuarios ="+curp+" ");
                     resultado = pst.executeUpdate();
                     if(resultado==1){
                         pst=conexion.prepareStatement("DELETE FROM Usuarios WHERE idUsuarios ="+curp+" ");
                         resultado2 = pst.executeUpdate();
                         if(resultado2==1){
                             JOptionPane.showMessageDialog(null, "Borrado correctamente");
                         } 
                     }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro registro!!!");
                }
            }
   
        }catch(SQLException e){
            System.out.println(e.toString());
        }
       
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jMntMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMntMenuActionPerformed
        Menu verFormulario = new Menu();
        verFormulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMntMenuActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BajaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JCheckBox jChcCurp;
    private javax.swing.JCheckBox jChcId;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMn1Opciones;
    private javax.swing.JMenuItem jMntMenu;
    private javax.swing.JPanel jPnlEliminarCliente;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtPorCurp;
    // End of variables declaration//GEN-END:variables
}
