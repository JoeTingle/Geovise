/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_Questions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static my.Geovise.MainUI.OptionOpen;
import my.Geovise.Options;
import static my.Geovise.Quiz.runDiffScaler;

/**
 *
 * @author 2010jtingle
 */
public class Q31 extends javax.swing.JFrame {

    /**
     * Creates new form Q5
     */
    int xMouse;
    int YMouse;
    public Q31() {
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

        ExitButtonToolbar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        HelpToolbar = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        CurrentScore = new javax.swing.JLabel();
        QuestionNum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(ExitButtonToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/minimize.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 30, 27));

        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/options.png"))); // NOI18N
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        HelpToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/help.png"))); // NOI18N
        HelpToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(HelpToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/VolcanicSmall.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        Score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ScoreComponentShown(evt);
            }
        });
        getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 60, 30));

        CurrentScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CurrentScore.setForeground(new java.awt.Color(255, 255, 255));
        CurrentScore.setText("Current Score :");
        getContentPane().add(CurrentScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, -1, 50));

        QuestionNum.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        QuestionNum.setForeground(new java.awt.Color(255, 255, 255));
        QuestionNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QuestionNum.setText("Question 1");
        getContentPane().add(QuestionNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 360, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Question 31");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, 60));

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
        getContentPane().add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Toolbar_Medium.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/arrowRight.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - YMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        runDiffScaler();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ScoreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ScoreComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        my.Geovise.Quiz.CurrentQuestion = 31;
        my.Geovise.Quiz.Question = my.Geovise.Quiz.Question + 1;
        Score.setText(String.valueOf(my.Geovise.Quiz.Score + "!"));
        QuestionNum.setText("Question " + String.valueOf(my.Geovise.Quiz.Question + " / 10"));
    }//GEN-LAST:event_formWindowOpened

    private void ExitButtonToolbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExitButtonToolbarFocusGained

    }//GEN-LAST:event_ExitButtonToolbarFocusGained

    private void ExitButtonToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonToolbarMouseClicked
        System.exit(0); // Exiting the program
    }//GEN-LAST:event_ExitButtonToolbarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        if(OptionOpen != true) //Checks if the boolean variable is false, so is the options menu open
        {
            new Options().setVisible(true); //If its not open then it will open up the options menu
            OptionOpen = true; // It will also change the value of the variable to true. Of course once they click on the settings again it wont go into the statement above.
        }
        else // However if the options menu is open, and the variable is true
        {
            if(OptionOpen == true)
            {
                JOptionPane.showMessageDialog(null, "WARNING : Settings Already Open !"); //It will display a dialog box, and not open up the options menu
            }
        }
    }//GEN-LAST:event_SettingsMouseClicked

    private void HelpToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpToolbarMouseClicked
        this.dispose(); // Closes the current active window
        new Help.MainHelp().setVisible(true); // Opens the help menu
    }//GEN-LAST:event_HelpToolbarMouseClicked

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
            java.util.logging.Logger.getLogger(Q31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentScore;
    private javax.swing.JLabel ExitButtonToolbar;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel HelpToolbar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel QuestionNum;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Settings;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
