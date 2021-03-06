/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Help;
    import java.sql.*;
    import javax.swing.*;
    import java.awt.event.*;
import static my.Geovise.MainUI.OptionOpen;
import my.Geovise.Options;
/**
 *
 * @author Joe Tingle
 */
public class MainHelp extends javax.swing.JFrame {

    /**
     * Creates new form MainHelp
     */
    int xMouse;
    int YMouse;
    public MainHelp() 
    {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Settings = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        HelpToolbar = new javax.swing.JLabel();
        ExitButtonToolbar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yourClock = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geovise - Help");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(849, 567));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/options.png"))); // NOI18N
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/VolcanicSmall.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        HelpToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/help.png"))); // NOI18N
        HelpToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(HelpToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        ExitButtonToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/quit.png"))); // NOI18N
        ExitButtonToolbar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ExitButtonToolbarFocusGained(evt);
            }
        });
        ExitButtonToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(ExitButtonToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/minimize.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 27));

        yourClock.setForeground(new java.awt.Color(255, 255, 255));
        yourClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(yourClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 28));

        FrameDrag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Toolbar_Large.png"))); // NOI18N
        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        getContentPane().add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Hover over the items below for help :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 90, 30));

        jButton2.setText("Notes");
        jButton2.setToolTipText("To open up the notes page simply click  on the notes button and enter anything in the box. To save these navigate to File and then save local menu item");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setEnabled(false);
        jButton2.setSelected(true);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 110, 30));

        jButton3.setText("Main Menu");
        jButton3.setToolTipText("To use the main menu simply click on any one of the buttons listed which will take you to another page");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setEnabled(false);
        jButton3.setSelected(true);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        jButton4.setText("Quiz");
        jButton4.setToolTipText("First you have to complete a tutorial round, and from then on the diff will be scaled.");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setEnabled(false);
        jButton4.setSelected(true);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 110, 30));

        jButton5.setText("Case Studies");
        jButton5.setToolTipText("When on the case studies page click on any one of the buttons which wil then display the information on the right");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setEnabled(false);
        jButton5.setSelected(true);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Help_Logo_Main.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 850, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Help_Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        if(OptionOpen != true)
        {
            new Options().setVisible(true); 
            OptionOpen = true;
        }
        else
        {
            if(OptionOpen == true)
            {
                JOptionPane.showMessageDialog(null, "WARNING : Settings Already Open !");
            }
        }
    }//GEN-LAST:event_SettingsMouseClicked

    private void ExitButtonToolbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExitButtonToolbarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonToolbarFocusGained

    private void ExitButtonToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonToolbarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonToolbarMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - YMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new my.Geovise.MainUI().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HelpToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpToolbarMouseClicked
        this.dispose(); // Closes the current active window
        new Help.MainHelp().setVisible(true); // Opens the help menu
    }//GEN-LAST:event_HelpToolbarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon(getClass().getResource("Volcanic.png")).getImage());//replaces the default java icon with a custom icon image.
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MainHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButtonToolbar;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel HelpToolbar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Settings;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel yourClock;
    // End of variables declaration//GEN-END:variables
}
