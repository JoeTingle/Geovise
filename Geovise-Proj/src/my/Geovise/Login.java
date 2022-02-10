package my.Geovise; // This class file is part of the my.contacteditor package
    import java.sql.*; // Importing the neccesary MySQL libraries
    import javax.swing.*; // Importing Swing Libraries for the GUI (Buttons etc.)
    import java.awt.event.*; // Importing events, allows for events such as on button click
    import javax.swing.Timer; //Importing timer to allow for clock functionality, aswell as on timed quiz etc.
    import java.util.Calendar; // Imports for the date format (e.g dd/mm/yy and hr/min/sc)

public class Login extends javax.swing.JFrame // Allows for the use of GUI features
{

    //Creates new JForm ContactEditorUI
    int xMouse; // The integer Variable for the location of the mouse (X coord)
    int YMouse; // The integer Variable for the location of the mouse (Y coord)
    public static String USERNAME; // Declaring a global variable to store the username, can be accessed from anywhere
    public static int One = 1;
    public static int Zero = 0;      
    public static int HighestScore; // Declaring a global variable for the HighScore, can be accessed from anywhere
    public static int FirstRoundComplete; // Declaring a global variable for the First round or tutorial, can be accessed from anywhere    
    boolean WarningDisplayed = false; // Boolean variable for the Past 10 o'clock warning. Prevents the 'spamming' issue
    public Login()
    {
        initComponents(); //Initialising the file.
        Timer t = new Timer(100, new Listener()); //Creating a timer listener for the clock
        t.start(); //Starting the timer
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OK = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        HelpToolbar = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        ExitButtonToolbar = new javax.swing.JLabel();
        MinimiseToolbar = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        PasswordBox = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        yourClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geovise");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 479));
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

        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/confirm.png"))); // NOI18N
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 30, 30));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/exit.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 30));

        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/register.png"))); // NOI18N
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 60, -1));

        HelpToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/help.png"))); // NOI18N
        HelpToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(HelpToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/options.png"))); // NOI18N
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/VolcanicSmall.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        ExitButtonToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/quit.png"))); // NOI18N
        ExitButtonToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(ExitButtonToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        MinimiseToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/IconAssets/minimize.png"))); // NOI18N
        MinimiseToolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimiseToolbarMouseClicked(evt);
            }
        });
        getContentPane().add(MinimiseToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 0, 30, 27));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/Geovise_Logo-Alt.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 340, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 80, 20));

        UsernameBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        UsernameBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 210, 30));

        PasswordBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordBoxKeyPressed(evt);
            }
        });
        getContentPane().add(PasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 210, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Geovise/Assets/LoginBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        yourClock.setForeground(new java.awt.Color(255, 255, 255));
        yourClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(yourClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 28));

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    class Listener implements ActionListener //Creating the Listener class to update
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar rightNow = Calendar.getInstance(); //Gets the current time from the Calendar Libary
                // These variables below are aquired from the calendar library.
            int hour = rightNow.get(Calendar.HOUR_OF_DAY); // Setting the current hour to an integer variable called hour
            int min = rightNow.get(Calendar.MINUTE); // Setting the current minuite to an integer variable called min.
            int AMPM = rightNow.get(Calendar.AM_PM); // Setting wheter the time is currently AM or PM, this is also an integer variable called AMPM
            yourClock.setText(hour + ":" + min + " " + AMPM); // Outputting the clock in the stated format, in the jLabel
            
            if(AMPM == 1) // AMPM is an integer variable, 1 being PM and 0 being AM. Its an integer so have to check if 1 or 0
            {
                if(min < 10) // The format does not add a zero to values below 10, so 10:09 would display 10:9 without this.
                {
                    yourClock.setText(hour + ":" + "0" + min + " " + "PM"); // The format does not add a zero to values below 10, so 10:09 would display 10:9 without this.
                }
                else // However if its not below 10 then the extra 0 is not required.
                {
                    yourClock.setText(hour + ":" + min + " " + "PM"); // No extra zero, just outputting the time with PM
                }

            }

            else // AMPM can either be 1 or 0, 1 is PM so the only other value is 0 which must be AM, no need for if statement
            {
                if(min < 10)// The format does not add a zero to values below 10, so 10:09 would display 10:9 without this.
                {
                    yourClock.setText(hour + ":" + "0" + min + " " + "AM"); // Uses same code from above to add extra zero.
                }
                else
                {
                 yourClock.setText(hour + ":" + min + " " + "AM");// No extra zero, just outputting the time with AM
                }


            }
            if(hour >= 22) // Another quick feature, warning user if they are revising too late.
            {               // So if it is after 22:00 at night then it warns them.
               if(WarningDisplayed == false) // To prevent errors of it 'spamming' the user with the message
               {
                 JOptionPane.showMessageDialog(null, "WARNING : The current time is not optimal for revision please reconsider"); // The warning dialog
                 WarningDisplayed = true; // breaking/exiting the statement
               }
            }

        }
    }
    private void PasswordBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordBoxKeyPressed
        //^ The password field event, when the user clicks on the password box the following will be executed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)// Asking has the user pressed the Enter key
        {
            jButton1.doClick(); // Performs a click action on the jButton executing the login code

        }
    }//GEN-LAST:event_PasswordBoxKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon(getClass().getResource("Volcanic.png")).getImage());
        //Sets the default icon of the window to a custom .png file (The volcano icon)
    }//GEN-LAST:event_formWindowOpened

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX(); //Grabbing the current x coord of the mouse when clicked
        YMouse = evt.getY(); //Grabbing the current y coord of the mouse when clicked
        System.out.println("X coord of Mouse within frame : " + xMouse + "  " +"Y Coord of Mouse within frame : " + YMouse);
        // ^^ this ouputs the x and y coords of the mouse within the JFrame.
        System.out.println(" ");
    }//GEN-LAST:event_FrameDragMousePressed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen(); //Grabbing the final location where it is dragged to, for x coord
        int y = evt.getYOnScreen();//Grabbing the final location where it is dragged to, for y coord
        System.out.println("X coord of Frame on screen : " + x + "  " +"Y Coord of Frame on screen : " + y);
        // ^^ This outputs the x and y coords of the mouse on the entire screen.
        this.setLocation(x - xMouse, y - YMouse); //Offsetting to fix issue where it jumps to the right when moved.
    }//GEN-LAST:event_FrameDragMouseDragged

    private void ExitButtonToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonToolbarMouseClicked
        System.exit(0); //Closes the program
    }//GEN-LAST:event_ExitButtonToolbarMouseClicked

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        if(UsernameBox.getText().length()==0 || PasswordBox.getPassword().length==0)  // Checking for empty field
        JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill\n");
        //else if(PasswordBox.getPassword().length==0)  // Checking for empty field
        //JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else{
            String user = UsernameBox.getText();   // Collecting the input
            USERNAME = user;
            char[] pass = PasswordBox.getPassword(); // Collecting the input
            String pwd = String.copyValueOf(pass);  // converting from array to string
            if(validate_login(user,pwd)) //If the validate_login function returns true then the following is executed
            {
                    GetHighScore(USERNAME);//Runs the function to get the highest score for the current user, passes through the global username.
                    GetFirstRound(USERNAME);//Runs the function to check if the tutorial round has been completed for the current user, passes through the global username.
                    JOptionPane.showMessageDialog(null, "Correct Login Credentials");//If the validate_login function returns true then the following is executed
                    this.dispose();//Closes the current login window
                    new MainUI().setVisible(true);//Sets the visiblity of the main menu to true so that the user can see it                    
            }
            else
            JOptionPane.showMessageDialog(null, "Incorrect Login Credentials"); //If the function doesn't return true then it tells the user their details are incorrect
        }
    }//GEN-LAST:event_OKMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0); //Closes the program
    }//GEN-LAST:event_ExitMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        JOptionPane.showMessageDialog(null, "Settings Disabled Untill Login..."); //Creates a dialog box telling the user that the settings are disabled
    }//GEN-LAST:event_SettingsMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        this.dispose(); //Closes current window which is in focus
        new Register().setVisible(true); //Opens the register menu, and sets visibility to true
    }//GEN-LAST:event_RegisterMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(UsernameBox.getText().length()==0)  // Checking for empty field
        JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else if(PasswordBox.getPassword().length==0)  // Checking for empty field
        JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else{
            String user = UsernameBox.getText();   // Collecting the input
            System.out.println(user);
            USERNAME = user;
            char[]pass = PasswordBox.getPassword(); // Collecting the input
            String pwd = String.copyValueOf(pass);  // converting from array to string
            if(validate_login(user,pwd)){//If the validate_login function returns true then the following is executed
                    GetHighScore(USERNAME);//Runs the function to get the highest score for the current user, passes through the global username.
                    GetFirstRound(USERNAME);//Runs the function to check if the tutorial round has been completed for the current user, passes through the global username.
                    JOptionPane.showMessageDialog(null, "Correct Login Credentials");//If the validate_login function returns true then the following is executed
                    this.dispose();//Closes the current login window
                    new MainUI().setVisible(true);//Sets the visiblity of the main menu to true so that the user can see it                    


            }
            else
            JOptionPane.showMessageDialog(null, "Incorrect Login Credentials"); //If the function doesn't return true then it tells the user their details are incorrect
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MinimiseToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseToolbarMouseClicked
        setExtendedState(JFrame.ICONIFIED); //Minimises to the task bar if clicked
    }//GEN-LAST:event_MinimiseToolbarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void HelpToolbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpToolbarMouseClicked
        JOptionPane.showMessageDialog(null, "Help Disabled Untill Login..."); //Creates a dialog box telling the user that the settings are disabled
    }//GEN-LAST:event_HelpToolbarMouseClicked

    private boolean validate_login(String username,String password) 
    {
        System.out.println("Running Validate Login ...");
        try{ //Try and catch incase any errors are produced, such as a failed connection
            Class.forName("com.mysql.jdbc.Driver").newInstance();  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql8.freemysqlhosting.net:3306/sql8133165?" + "user=sql8133165&password=" + "qWIM2CcWQf");
            // ^^ Creating the connection w/ user and pass
            PreparedStatement pst = conn.prepareStatement("Select * from Login where username=? and password=?"); //Actual SQL statement
            pst.setString(1, username); // Passing through username and password
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery(); //Executing the statement and setting that as the result set
            System.out.println("Executing SQL query...");
            if(rs.next())
                return true; //Will return true if the statement was executed sucessfully
            else
                return false;
        }
        catch(Exception e){
            e.printStackTrace(); //Outputs any errors to the output box
            return false;
        }
    }
  
    public int GetHighScore(String USERNAME)
    {
        try//Try and catch incase any errors are produced, such as a failed connection
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql8.freemysqlhosting.net:3306/sql8133165?" + "user=sql8133165&password=" + "qWIM2CcWQf");//Creating the connection w/ user and pass
            PreparedStatement pst = conn.prepareStatement("Select HighestScore from Login where username ='"+USERNAME+"'"); //Actual SQL statement
            ResultSet rs = pst.executeQuery();//Executing the statement and setting that as the result set
            while(rs.next())
            {
                HighestScore=rs.getInt("HighestScore"); //Setting the global variable HighestScore to the ouput of the statement
            }
        }
        catch(Exception e)
        {

        }
        System.out.println(HighestScore);
        return HighestScore;
    }
    
    public static int GetFirstRound(String USERNAME)
    {
        try//Try and catch incase any errors are produced, such as a failed connection
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql8.freemysqlhosting.net:3306/sql8133165?" + "user=sql8133165&password=" + "qWIM2CcWQf");//Creating the connection w/ user and pass
            PreparedStatement pst = conn.prepareStatement("Select FirstRoundComplete from Login where username ='"+USERNAME+"'"); //Actual SQL statement
            ResultSet rs = pst.executeQuery();//Executing the statement and setting that as the result set
            while(rs.next())
            {
                FirstRoundComplete=rs.getInt("FirstRoundComplete"); //Setting the global variable HighestScore to the ouput of the statement
            }
        }
        catch(Exception e)
        {

        }
        System.out.println(FirstRoundComplete);
        return FirstRoundComplete;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel ExitButtonToolbar;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel HelpToolbar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel MinimiseToolbar;
    private javax.swing.JLabel OK;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Settings;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel yourClock;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        public void run()
        {
            new Login().setVisible(true);
        }
    }
}