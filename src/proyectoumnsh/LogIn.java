/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoumnsh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author glzgi
 */
public class LogIn extends javax.swing.JFrame {
    
    private String usuario,contrasena; // varibles para el inicio de sesion
    private ResultSet consulta; //variable que guardará el resultado de la consulta
    private PreparedStatement pst; //variable que ejecutará las sentencias a la B.D.
    private Connection conexion=null; //variable que llevará a cabo la conexión a la B.D.

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        jPswPassword.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLblUsuario = new javax.swing.JLabel();
        jLblPassword = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jPswPassword = new javax.swing.JPasswordField();
        jBtnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log In", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLblUsuario.setText("Usuario");

        jLblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLblPassword.setText("Password");

        jTxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtUsuarioFocusLost(evt);
            }
        });

        jPswPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPswPasswordFocusLost(evt);
            }
        });
        jPswPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPswPasswordActionPerformed(evt);
            }
        });
        jPswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPswPasswordKeyTyped(evt);
            }
        });

        jBtnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnEntrar.setText("Entrar");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed
        // Probara la connecion con la base de datos:
        try
        {   
            String sql;
            
            //coge los datos del formulario
            usuario = jTxtUsuario.getText();
            contrasena = String.valueOf(jPswPassword.getPassword());
            
            //valida que no esten vacios los datos
            if (usuario.isEmpty() || contrasena.isEmpty() ) {
                JOptionPane.showMessageDialog(null,"Hay valores vacios");
            } else{
                //se crea la sentecia mysql para insertar
                sql = "SELECT * FROM Admin WHERE Usuario = '"+usuario+"' && Password = '"+contrasena+"';";
                pst=conexion.prepareStatement(sql);
                consulta=pst.executeQuery(); //se ejecuta la consulta a la B.D.
                
                //valida si existe el ususario y el pass
                if (consulta.next() == false) {
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectas");
                }else{
                    Menu verFormulario = new Menu ();
                    verFormulario.setVisible(true);
                    this.setVisible(false);
                    
                }
                
                
          
            }
          
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());  
        }
        
    }//GEN-LAST:event_jBtnEntrarActionPerformed

    private void jPswPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPswPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPswPasswordActionPerformed

    private void jTxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtUsuarioFocusLost
        // TODO add your handling code here:
        if (jTxtUsuario.getText().equals("")) {
            jTxtUsuario.requestFocus();
            getToolkit().beep();
        }else{
            jPswPassword.setEnabled(true);
            jPswPassword.requestFocus();
        }
    }//GEN-LAST:event_jTxtUsuarioFocusLost

    private void jPswPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPswPasswordKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPswPasswordKeyTyped

    private void jPswPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPswPasswordFocusLost
        // TODO add your handling code here:
        if (jPswPassword.getPassword().length == 0) {
            jPswPassword.requestFocus();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jPswPasswordFocusLost

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPswPassword;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
