/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoumnsh.Menu;

/**
 *
 * @author RONALDO
 */
public class Retirar extends javax.swing.JFrame {
    private ResultSet consulta; //variable que guardará el resultado de la consulta
    private PreparedStatement pst; //variable que ejecutará las sentencias a la B.D.
    private Connection conexion=null; //variable que llevará a cabo la conexión a la B.D.
    private String genero; //variable que almacenará el caracter del género del alumno
    private String Monto, Motivo,saldo;
    private int seleccion;
    /**
     * Creates new form Retirar
     */
    public Retirar() {
        initComponents();
        llenarComboBox();
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

        jPnlRetirar = new javax.swing.JPanel();
        jLblMonto = new javax.swing.JLabel();
        jLblMotivo = new javax.swing.JLabel();
        jTxtMonto = new javax.swing.JTextField();
        jTxtMotivo = new javax.swing.JTextField();
        jBntAceptar = new javax.swing.JButton();
        jLblCliente = new javax.swing.JLabel();
        jCmbCliente = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnlRetirar.setBackground(new java.awt.Color(0, 51, 51));
        jPnlRetirar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retirar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLblMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblMonto.setForeground(new java.awt.Color(255, 255, 255));
        jLblMonto.setText("Monto:");

        jLblMotivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblMotivo.setForeground(new java.awt.Color(255, 255, 255));
        jLblMotivo.setText("Motivo:");

        jBntAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBntAceptar.setForeground(new java.awt.Color(0, 51, 51));
        jBntAceptar.setText("Aceptar");
        jBntAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntAceptarMouseClicked(evt);
            }
        });
        jBntAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntAceptarActionPerformed(evt);
            }
        });

        jLblCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLblCliente.setText("Cliente:");

        jCmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPnlRetirarLayout = new javax.swing.GroupLayout(jPnlRetirar);
        jPnlRetirar.setLayout(jPnlRetirarLayout);
        jPnlRetirarLayout.setHorizontalGroup(
            jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlRetirarLayout.createSequentialGroup()
                .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlRetirarLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jBntAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlRetirarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblCliente)
                            .addComponent(jLblMonto)
                            .addComponent(jLblMotivo))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtMonto)
                            .addComponent(jTxtMotivo)
                            .addComponent(jCmbCliente, 0, 129, Short.MAX_VALUE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPnlRetirarLayout.setVerticalGroup(
            jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlRetirarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCliente)
                    .addComponent(jCmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMonto)
                    .addComponent(jTxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMotivo)
                    .addComponent(jTxtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBntAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ir a menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBntAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAceptarMouseClicked
 
    }//GEN-LAST:event_jBntAceptarMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Menu verFormulario = new Menu();
        verFormulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBntAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntAceptarActionPerformed
        Monto = jTxtMonto.getText();
        Motivo = jTxtMotivo.getText();
        seleccion = jCmbCliente.getSelectedIndex()+1;
        String sql0;
        int num=0,num2=0;
               
        sql0 = "SELECT SUM(cantidad)FROM Movimientos WHERE idUsuarios ="+seleccion+"";
        System.out.println(sql0);
                try{
                    pst=conexion.prepareStatement(sql0);
                    consulta=pst.executeQuery();
                    
                    if(consulta.next()){
                        num = consulta.getInt(1);
                        num2= Integer.parseInt(Monto);
                        
                        if(num2 > num){
                            JOptionPane.showMessageDialog(null, "No dispones del saldo suficiente");
                        }else{
                            int input = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres retirar: "+Monto+" ?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            
            System.out.println(input);
            
            if (input == 0) {
                        try
                   {      
                       int resultado;
                       String sql;

                       sql = "INSERT INTO `Movimientos` (`idMovimientos`, `idUsuarios`,`Tipo`, `descripcion`, `fecha`, `hora`, `cantidad`) "
                               + "VALUES "
                               + "(NULL, '"+seleccion+"','Egreso ', '"+Motivo+"', CURRENT_DATE, CURRENT_TIME, '-"+Monto+"')";
                       pst=conexion.prepareStatement(sql);

                     resultado=pst.executeUpdate();
                     if (resultado==1) 
                     {
                         pst=conexion.prepareStatement(sql0);
                        consulta=pst.executeQuery();
                        if(consulta.next()){
                          JOptionPane.showMessageDialog(null,"El abono ha sido retirado correctamente, su nuevo saldo es: " 
                                  + consulta.getInt(1));  
                        }
                         jTxtMonto.setText(null);
                         jTxtMotivo.setText(null);
                     }

                     else
                     {
                         JOptionPane.showMessageDialog(null,"Error"); 
                     }


                   }
                   catch(SQLException e)
                   {
                       JOptionPane.showMessageDialog(null, e.toString());  
                   }
            }
                        }
                            
                    }
                    
                    
                }catch(SQLException e)
                   {
                       JOptionPane.showMessageDialog(null, e.toString());  
                   }
    }//GEN-LAST:event_jBntAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntAceptar;
    private javax.swing.JComboBox<String> jCmbCliente;
    private javax.swing.JLabel jLblCliente;
    private javax.swing.JLabel jLblMonto;
    private javax.swing.JLabel jLblMotivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPnlRetirar;
    private javax.swing.JTextField jTxtMonto;
    private javax.swing.JTextField jTxtMotivo;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBox() {
        jCmbCliente.removeAllItems();
        
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
        
        try {
            pst=conexion.prepareStatement("SELECT * FROM Usuarios");
            consulta=pst.executeQuery();
            
            while (consulta.next()){
                //System.out.println( consulta.getInt(1));
                jCmbCliente.addItem(Integer.toString(consulta.getInt(1)));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }
}
