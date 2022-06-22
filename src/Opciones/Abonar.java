/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opciones;
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
 * @author RONALDO
 */
public class Abonar extends javax.swing.JFrame {
    private ResultSet consulta; //variable que guardará el resultado de la consulta
    private PreparedStatement pst; //variable que ejecutará las sentencias a la B.D.
    private Connection conexion=null; //variable que llevará a cabo la conexión a la B.D.
    private String Monto, Motivo;
    private int seleccion;
    /**
     * Creates new form Abonar
     */
    public Abonar() {
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

        jPnlAbonar = new javax.swing.JPanel();
        jLblMonto = new javax.swing.JLabel();
        jLblMotivo = new javax.swing.JLabel();
        jTxtMonto = new javax.swing.JTextField();
        jTxtMotivo = new javax.swing.JTextField();
        jBtnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCmbCliente = new javax.swing.JComboBox<>();
        jMnbOpciones = new javax.swing.JMenuBar();
        jMn1Menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPnlAbonar.setBackground(new java.awt.Color(0, 51, 51));
        jPnlAbonar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abonar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPnlAbonar.setForeground(new java.awt.Color(0, 102, 102));

        jLblMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblMonto.setForeground(new java.awt.Color(255, 255, 255));
        jLblMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMonto.setText("Monto:");

        jLblMotivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblMotivo.setForeground(new java.awt.Color(255, 255, 255));
        jLblMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMotivo.setText("Motivo:");

        jTxtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMontoKeyTyped(evt);
            }
        });

        jBtnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(0, 51, 51));
        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAceptarMouseClicked(evt);
            }
        });
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N Cliente:");

        jCmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPnlAbonarLayout = new javax.swing.GroupLayout(jPnlAbonar);
        jPnlAbonar.setLayout(jPnlAbonarLayout);
        jPnlAbonarLayout.setHorizontalGroup(
            jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAbonarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlAbonarLayout.createSequentialGroup()
                        .addComponent(jLblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlAbonarLayout.createSequentialGroup()
                        .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jCmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlAbonarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPnlAbonarLayout.setVerticalGroup(
            jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAbonarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMn1Menu.setText("Opciones");
        jMn1Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMn1MenuActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ir a menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMn1Menu.add(jMenuItem1);

        jMnbOpciones.add(jMn1Menu);

        setJMenuBar(jMnbOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlAbonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlAbonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAceptarMouseClicked

    }//GEN-LAST:event_jBtnAceptarMouseClicked

    private void jMn1MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMn1MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMn1MenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Menu verFormulario = new Menu();
        verFormulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed

        Monto = jTxtMonto.getText();
        Motivo = jTxtMotivo.getText();
        seleccion = jCmbCliente.getSelectedIndex()+1;
        
        System.out.println(seleccion);
        
        if (Monto.isEmpty()) {
          JOptionPane.showMessageDialog(null, "Motivo esta vacio");
        }
        else{
            int input = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres abonar: "+Monto+" ?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            
            //System.out.println(input);
            
            if (input == 0) {
                        try
                   {      
                       int resultado;
                       String sql;

                       sql = "INSERT INTO `Movimientos` (`idMovimientos`, `idUsuarios`,`Tipo`, `descripcion`, `fecha`, `hora`, `cantidad`) "
                               + "VALUES "
                               + "(NULL, '"+seleccion+"','Ingreso ', '"+Motivo+"', CURRENT_DATE, CURRENT_TIME, '"+Monto+"')";
                       pst=conexion.prepareStatement(sql);

                     resultado=pst.executeUpdate();
                     if (resultado==1) 
                     {
                         JOptionPane.showMessageDialog(null,"El abono ha sido insertado correctamente");
                         jTxtMonto.setText(null);
                         jTxtMotivo.setText(null);
                     }

                     else
                     {
                         JOptionPane.showMessageDialog(null,"El abono No ha sido insertado"); 
                     }


                   }
                   catch(SQLException e)
                   {
                       JOptionPane.showMessageDialog(null, e.toString());  
                   }
            }
            
                if(input ==1 )
                   {
                     jTxtMonto.setText(null);
                     jTxtMotivo.setText(null);
                     jTxtMonto.requestFocus();
                     
                   }
               
        }
        
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jTxtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMontoKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar(); // se obtiene el caracter de la tecla presioanada
        
        if (Character.isDigit(letra) || evt.getKeyChar()== KeyEvent.VK_BACK_SPACE) {
            //si secumple alguna de las 2 condidiones se despliega el numero o se borra el numero tecleado 
        }else {
        
            evt.consume();
            getToolkit().beep();
            
        }
    }//GEN-LAST:event_jTxtMontoKeyTyped

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
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abonar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JComboBox<String> jCmbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblMonto;
    private javax.swing.JLabel jLblMotivo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMn1Menu;
    private javax.swing.JMenuBar jMnbOpciones;
    private javax.swing.JPanel jPnlAbonar;
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
