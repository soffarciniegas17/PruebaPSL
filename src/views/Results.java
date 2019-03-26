/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConvertNumber;
import controllers.CreateCode;
import controllers.ReadFile;

/**
 *
 * @author Sophie
 */
public class Results extends javax.swing.JFrame {
    
    String route;
    int tipo;

    /**
     * Creates new form Results
     *
     * @param ruta
     */
    public Results(String ruta, int tipo) {
        initComponents();
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        codenumber.setVisible(false);
        this.route = ruta;
        setLocationRelativeTo(null);
        this.tipo = tipo;
        results(this.tipo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        codenumber = new javax.swing.JLabel();
        botton_again = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botton_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, 20));

        c2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 320, 20));

        c3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, 20));

        codenumber.setBackground(new java.awt.Color(255, 255, 255));
        codenumber.setFont(new java.awt.Font("Microsoft Tai Le", 0, 36)); // NOI18N
        codenumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(codenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, 60));

        botton_again.setBackground(new java.awt.Color(255, 255, 255));
        botton_again.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        botton_again.setText("Volver a descodificar");
        botton_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_againActionPerformed(evt);
            }
        });
        getContentPane().add(botton_again, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-blanco.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, 60));

        botton_menu.setBackground(new java.awt.Color(255, 255, 255));
        botton_menu.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        botton_menu.setText("Menú");
        botton_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_menuActionPerformed(evt);
            }
        });
        getContentPane().add(botton_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, 30));

        texto.setBackground(new java.awt.Color(255, 255, 255));
        texto.setFont(new java.awt.Font("Microsoft Tai Le", 0, 24)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("Descodificación de archivo txt");
        texto.setToolTipText("");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 420, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-Azul.png"))); // NOI18N
        jLabel1.setText("sdfsfdkf");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_menuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botton_menuActionPerformed

    private void botton_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_againActionPerformed
        // TODO add your handling code here:
        if (this.tipo == 1) {
            RouteDialog routeD = new RouteDialog();
            routeD.setVisible(true);
            this.setVisible(false);
        } else {
            NumberDialog num = new NumberDialog(this, rootPaneCheckingEnabled);
            num.setVisible(true);
            this.setVisible(false);
        }
        

    }//GEN-LAST:event_botton_againActionPerformed
    
    private void results(int tipo) {
        if (tipo == 1) {
            ReadFile ld = new ReadFile();
            ConvertNumber controller = new ConvertNumber();
            controller.init(ld.leer(this.route), codenumber);
            setTitle("Resultado de descodificación");
            codenumber.setVisible(true);
        } else {
            c1.setVisible(true);
            c2.setVisible(true);
            c3.setVisible(true);
            texto.setText("Codificación de números ingresados");
            botton_again.setText("Volver a codificar");
            setTitle("Resultado de codificación");
            CreateCode code = new CreateCode();
            code.init(route, c1, c2, c3);
        }
    }

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results("", 0).setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botton_again;
    private javax.swing.JButton botton_menu;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel codenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static final javax.swing.JLabel texto = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
