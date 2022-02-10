/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_Questions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static my.Geovise.Login.USERNAME;
import static my.Geovise.MainUI.OptionOpen;
import my.Geovise.Options;

/**
 *
 * @author 2010jtingle
 */
public class Q2 extends javax.swing.JFrame {
    public boolean ReservoirSelected = false;
    public boolean BoatSelected = false;
    public boolean MeanderSelected = false;
    public boolean DepositionSelected = false;
    public boolean OxbowSelected = false;
    public boolean ErosionSelected = false;
    public boolean LakeSelected = false;
    public static Timer t2;
    public static int count;
    int xMouse;
    int YMouse;
    /**
     * Creates new form Q1
     */
    public Q2() {
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

        Icon = new javax.swing.JLabel();
        QuestionNum = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        ExitButtonToolbar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        HelpToolbar = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        CurrentScore = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Question = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geovise - Tutorial Q2");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1011, 627));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/VolcanicSmall.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        QuestionNum.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        QuestionNum.setForeground(new java.awt.Color(255, 255, 255));
        QuestionNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QuestionNum.setText("Question 1");
        getContentPane().add(QuestionNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 110, 30));

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

        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/589231f3dce64737817719.gif"))); // NOI18N
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 160, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1 Point");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Toolbar_Medium.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 27));

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 100, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 160, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<----");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 70, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<-----");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 70, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("---->");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 70, 50));

        Question.setEditable(false);
        Question.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Question.setText(" Name the following processes shown in the image below");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        getContentPane().add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 530, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Quiz_Background1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 1020, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String answerOne_low = jTextField1.getText();
        String answerTwo_low = jTextField2.getText();
        String answerThree_low = jTextField3.getText();
        String answerOne_up = answerOne_low.toUpperCase();
        String answerTwo_up = answerTwo_low.toUpperCase();
        String answerThree_up = answerThree_low.toUpperCase();
        if(answerOne_up.contains("MEANDER") && answerTwo_up.contains("EROSION") && answerThree_up.contains("DEPOSITION"))
        {
            my.Geovise.Quiz.Score = my.Geovise.Quiz.Score + 1;
            Time.setVisible(false);
            t2.stop();
            JOptionPane.showMessageDialog(null, "Correct ! (1 Point)");
            this.dispose();
            new Q3().setVisible(true);
        }
        else
        {
            Time.setVisible(false);
            t2.stop();            
            JOptionPane.showMessageDialog(null, "Inccorrect ! (0 Points)");
            this.dispose();
            new Q3().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - YMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void ScoreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ScoreComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        my.Geovise.Quiz.CurrentQuestion = 2;
        my.Geovise.Quiz.Question = my.Geovise.Quiz.Question + 1;
        Score.setText(String.valueOf(my.Geovise.Quiz.Score + "!"));
        QuestionNum.setText("Question " + String.valueOf(my.Geovise.Quiz.Question + " / 10"));
        if(my.Geovise.Quiz.TimedModeSelected == true)
        {
            Time.setVisible(true);
            t2 = new Timer(1000, new ActionListener()
            {
                   @Override
                   public void actionPerformed(ActionEvent e)
                   {
                       if(count==10)
                       {
                           Time.setVisible(false);
                           t2.stop();
                           JOptionPane.showMessageDialog(null, "You have run out of time, Next Question >>>");
                           dispose();
                           new Q3().setVisible(true);
                       }
                       count ++;
                    }
            });

        }
        else
        {
            Time.setVisible(false);            
        }
        t2.start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentScore;
    private javax.swing.JLabel ExitButtonToolbar;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel HelpToolbar;
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField Question;
    private javax.swing.JLabel QuestionNum;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Settings;
    private javax.swing.JLabel Time;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
