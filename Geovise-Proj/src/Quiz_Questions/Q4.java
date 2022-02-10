/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_Questions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
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
public class Q4 extends javax.swing.JFrame {

    /**
     * Creates new form Q4
     */
    int xMouse;
    int YMouse;
    public boolean OneSelected = false;
    public boolean TwoSelected = false;
    public boolean ThreeSelected = false;
    public boolean FourSelected = false;
    public static Timer t2;
    public static int count;
    public Q4() {
        initComponents();
        javax.swing.Timer t = new javax.swing.Timer(100, new Q4.Listener());
        t.start();
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
        Icon = new javax.swing.JLabel();
        QuestionNum = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        ExitButtonToolbar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        HelpToolbar = new javax.swing.JLabel();
        CurrentScore = new javax.swing.JLabel();
        yourClock = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        Question = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geovise - Tutorial Q4");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1015, 637));
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
        getContentPane().add(QuestionNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 360, 30));

        Score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ScoreComponentShown(evt);
            }
        });
        getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 60, 30));

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

        CurrentScore.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CurrentScore.setForeground(new java.awt.Color(255, 255, 255));
        CurrentScore.setText("Current Score :");
        getContentPane().add(CurrentScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, -1, 50));

        yourClock.setForeground(new java.awt.Color(255, 255, 255));
        yourClock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(yourClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 170, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1 Point");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 60, -1));

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

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 100, 30));

        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/589231f3dce64737817719.gif"))); // NOI18N
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 160, 160));

        Question.setEditable(false);
        Question.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Question.setText("   What stage of the demographic transition model was Germany in between 2004 and 2012?");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        getContentPane().add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 790, 130));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Stage 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 100, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Stage 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 100, 30));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Stage 3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 100, 30));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("Stage 4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Quiz_Table_PopQ.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1023, 644));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar rightNow = Calendar.getInstance();
            
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            int min = rightNow.get(Calendar.MINUTE);
            int AMPM = rightNow.get(Calendar.AM_PM);
            if(AMPM == 1)
            {
                if(min < 10)
                {
                    yourClock.setText(hour + ":" + "0" + min + " " + "PM");                     
                }
                else
                {
                    yourClock.setText(hour + ":" + min + " " + "PM");                       
                }
   
            }
               
            else
            {
                if(min < 10)
                {
                    yourClock.setText(hour + ":" + "0" + min + " " + "PM");                     
                }
                else
                {
                 yourClock.setText(hour + ":" + min + ":" + "PM");                       
                }
   
       
            }
         
        }
    }
    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        resetAnswer(); 
        FourSelected = true;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        resetAnswer(); 
        TwoSelected = true;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        resetAnswer();  
        ThreeSelected = true;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - YMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        resetAnswer();
        OneSelected = true;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(FourSelected == true)
        {
            Time.setVisible(false);
            t2.stop();            
            this.dispose();
            JOptionPane.showMessageDialog(null, "Correct ! (1 Point)");
            my.Geovise.Quiz.Score = my.Geovise.Quiz.Score + 1;
            new Q5().setVisible(true);
            
        }
        else
        {
            Time.setVisible(false);
            t2.stop();            
            this.dispose();
            JOptionPane.showMessageDialog(null, "Incorrect ! (0 Point)");
            new Q5().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ScoreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ScoreComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        my.Geovise.Quiz.CurrentQuestion = 4;
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
                           new Q5().setVisible(true);
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

    public void resetAnswer()
    {
        OneSelected = false;
        TwoSelected = false;
        ThreeSelected = false;
        FourSelected = false;         
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
            java.util.logging.Logger.getLogger(Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q4().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel yourClock;
    // End of variables declaration//GEN-END:variables
}