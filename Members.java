/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wecare;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
    public Members() {
        initComponents();
        DisplayMembers();
        GetCoach();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MNameTb = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        AgeTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        CoachCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TimingCb = new javax.swing.JComboBox<>();
        GenCb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MembersTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payments");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Coachs");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-20, 20, 290, 550);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("Members List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 390, 446, 39);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel5.setText("Phone Number ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 160, 182, 39);

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel6.setText("Member Name ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 110, 190, 39);

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel7.setText("Age");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(710, 110, 110, 39);
        jPanel1.add(MNameTb);
        MNameTb.setBounds(520, 110, 159, 26);

        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneTb);
        PhoneTb.setBounds(520, 160, 150, 26);
        jPanel1.add(AgeTb);
        AgeTb.setBounds(780, 110, 110, 26);

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 220, 159, 22);
        jPanel1.add(AmountTb);
        AmountTb.setBounds(520, 210, 159, 26);

        jPanel1.add(CoachCb);
        CoachCb.setBounds(1010, 110, 81, 26);

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel9.setText("Coach");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(910, 110, 81, 39);

        jLabel10.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel10.setText("Timing");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 260, 120, 39);

        TimingCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6AM-8AM", "8AM-10AM", "4PM-6PM", "6PM-8PM", "8PM-10PM" }));
        jPanel1.add(TimingCb);
        TimingCb.setBounds(520, 260, 110, 26);

        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(GenCb);
        GenCb.setBounds(980, 220, 81, 26);

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(980, 180, 81, 39);

        EditBtn.setBackground(new java.awt.Color(102, 0, 102));
        EditBtn.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn);
        EditBtn.setBounds(450, 320, 117, 47);

        AddBtn.setBackground(new java.awt.Color(153, 0, 153));
        AddBtn.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn);
        AddBtn.setBounds(300, 320, 117, 47);

        DeleteBtn.setBackground(new java.awt.Color(102, 0, 102));
        DeleteBtn.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn);
        DeleteBtn.setBounds(592, 320, 135, 47);

        jLabel12.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel12.setText("Manage Members");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(400, 30, 630, 59);

        MembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MembersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MembersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MembersTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 440, 740, 110);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 0, 860, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1162, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection Con=null;
PreparedStatement pst =null;
ResultSet Rs=null, Rs1=null;
Statement St=null,St1=null;
private void DisplayMembers()
{
    try{
        Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
        St=(Statement) Con.createStatement();
        Rs=St.executeQuery("select * from MemberTbl");
        MembersTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}
    private void GetCoach(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St=(Statement) Con.createStatement();
            String Query="Select * from CoachTbl";
            Rs=St.executeQuery(Query);
            while(Rs.next()){
                String CoachName=Rs.getString("CName");
                CoachCb.addItem(CoachName);
            }
        } catch (Exception e) {
        }
    }
    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Coachs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         new Payments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    int MNum=0;
    private void CountMembers()
    {
        try{
            St1=(Statement) Con.createStatement();
            Rs1= St1.executeQuery("select Max(MId) from MemberTbl");
            Rs1.next();
            MNum=Rs1.getInt(1)+1;
        }catch(Exception e){
            
        }
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        if(MNameTb.getText().isEmpty()||PhoneTb.getText().isEmpty()||AgeTb.getText().isEmpty()||AmountTb.getText().isEmpty()||GenCb.getSelectedIndex()==-1||CoachCb.getSelectedIndex()==-1 || TimingCb.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Missing Information");
        }else
        {
            try{
                CountMembers();
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
             PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into MemberTbl values(?,?,?,?,?,?,?,?)");
             Add.setInt(1, MNum);
             Add.setString(2, MNameTb.getText());
             Add.setString(3, PhoneTb.getText());
             Add.setInt(4, Integer.valueOf(AgeTb.getText()));
             Add.setInt(5, Integer.valueOf(AmountTb.getText()));
             Add.setString(6, TimingCb.getSelectedItem().toString());
             Add.setString(7, CoachCb.getSelectedItem().toString());
             Add.setString(8, GenCb.getSelectedItem().toString());
             int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Member Saved");
            Con.close();
             DisplayMembers();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    int Key=0;
    private void MembersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembersTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)MembersTable.getModel();
        int MyIndex = MembersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        MNameTb.setText(model.getValueAt(MyIndex, 1).toString()); 
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString()); 
        AgeTb.setText(model.getValueAt(MyIndex, 3).toString()); 
        AmountTb.setText(model.getValueAt(MyIndex, 4).toString()); 
        TimingCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        CoachCb.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
    }//GEN-LAST:event_MembersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select the member to delete");
            
        }
        else{
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query = "Delete from MemberTbl where MId="+Key;
                Statement Del=(Statement) Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Member Deleted");
                DisplayMembers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        // TODO add your handling code here:
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select The Member to Edit");
        }else{
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query="Update MemberTbl set MName=?,Mphone=?,MAge=?,MAmount=?,MTiming=?, MCoach=?,MGen=? where MId=?";
                PreparedStatement Edit=(PreparedStatement) Con.prepareStatement(Query);
                Edit.setInt(8, Key);
                Edit.setString(1, MNameTb.getText());
                Edit.setString(2, PhoneTb.getText());
                Edit.setInt(3, Integer.valueOf(AgeTb.getText()));
                Edit.setInt(4, Integer.valueOf(AmountTb.getText()));
                Edit.setString(5, TimingCb.getSelectedItem().toString());
                Edit.setString(6, CoachCb.getSelectedItem().toString());
                Edit.setString(7, GenCb.getSelectedItem().toString());
                int row = Edit.executeUpdate();
            JOptionPane.showMessageDialog(this, "Member Updated");
            Con.close();
             DisplayMembers();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgeTb;
    private javax.swing.JTextField AmountTb;
    private javax.swing.JComboBox<String> CoachCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JTextField MNameTb;
    private javax.swing.JTable MembersTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JComboBox<String> TimingCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
