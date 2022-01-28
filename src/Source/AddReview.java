package Source;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
import java.sql.*;

/**
 *
 * @author gargp
 */
public class AddReview extends javax.swing.JFrame {
      public AddReview(String custid){
     
      }
    /**
     * Creates new form AddReview
     */
    public AddReview() {
        initComponents();


        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kleon", "root", "");

            Class.forName("java.sql.DriverManager");


            String sql;

            sql = " select MovieName,MovieID from movies where MovieId>0 order by MovieId asc";
            System.out.println("" + sql);


            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No Movies in Database");
            } else {
                rs.previous();
                while (rs.next()) {


                    CM.addItem(rs.getString("MovieName"));
                    System.out.println("" + rs.getString("MovieName"));


                }
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error:  " + e.getMessage());


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
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Rev = new javax.swing.JTextArea();
        CM = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/aaa.png"))); // NOI18N
        back.setToolTipText("Go back to Homepage and Logout");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Review");

        Rev.setColumns(20);
        Rev.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        Rev.setLineWrap(true);
        Rev.setRows(5);
        Rev.setText("Start Typing.....");
        Rev.setWrapStyleWord(true);
        Rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RevMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Rev);

        CM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Movie" }));
        CM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMMouseClicked(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Rating:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 118, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(289, 289, 289))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addGap(18, 18, 18)
                .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RevMousePressed
        if (Rev.getText().equals("Start Typing.....")) {
            Rev.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_RevMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (CM.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a movie first");
        } else {
            int mrid;
            //Add code to connect to mysql    
            String custid = "";
            int MovieId = CM.getSelectedIndex();
            String reviewtxt = Rev.getText();
            String rating = rat.getText();
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kleon", "root", "");
                String sql, sql2, sql3;
                sql2 = "select max(MovRevId) from reviews where MovieId=" + MovieId;
                sql3 = "select max(ReviewId) from reviews";
                System.out.println(""+sql2);
                System.out.println(""+sql3);
                Statement st2 = con.createStatement();
                ResultSet rs2 = st2.executeQuery(sql2);
               
                Statement st3 = con.createStatement();
                ResultSet rs3 = st3.executeQuery(sql3);
                
                
                  String sql4 = "select CustUserName from temp";
                  System.out.println(""+sql4);
                
               
                  
                if (!rs2.next()) {
                    mrid = 1;
                    
                } else {
                    System.out.println(""+rs2.getString("max(MovRevId)"));
                 mrid = Integer.parseInt(rs2.getString("max(MovRevId)")) + 1;
                    System.out.println(""+mrid);
                }
                rs3.next();
                 int revid = Integer.parseInt(rs3.getString("max(ReviewId)")) + 1;
                 Statement st4 = con.createStatement();
                ResultSet rs4 = st2.executeQuery(sql4);
                rs4.next();
                custid=rs4.getString("CustUsername");
                System.out.println("" + revid);
                System.out.println("" + custid);
                System.out.println("" + MovieId);
                System.out.println("" + rating);
                System.out.println("" + mrid);
                System.out.println("" + sql2);
                System.out.println("" + sql3);
                sql = "insert into reviews values(" + revid + ",'" + custid + "'," + MovieId + ",'" + reviewtxt + "'," + rating + "," + mrid + ")";
               System.out.println("" + sql);
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Your review was succesdfully addded");
            } catch (ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

            }
            this.dispose();
            new Start().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CMMouseClicked

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        new Start().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_backMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddReview().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CM;
    private javax.swing.JTextArea Rev;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rat;
    // End of variables declaration//GEN-END:variables
}
