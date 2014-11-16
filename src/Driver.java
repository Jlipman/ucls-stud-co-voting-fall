/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lipman
 */
public class Driver extends javax.swing.JFrame {

    /**
     * Creates new form Driver
     */
    public Driver() {
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

        SetupB = new javax.swing.JButton();
        StudentVoterB = new javax.swing.JButton();
        ResultsB = new javax.swing.JButton();
        SchoolLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setName("Start Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(764, 500));

        SetupB.setText("Run Setup");
        SetupB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SetupBStateChanged(evt);
            }
        });
        SetupB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetupBMouseClicked(evt);
            }
        });

        StudentVoterB.setText("Run Student Voter");
        StudentVoterB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentVoterBMouseClicked(evt);
            }
        });

        ResultsB.setText("Run Results");
        ResultsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultsBMouseClicked(evt);
            }
        });

        SchoolLogo.setBackground(new java.awt.Color(153, 0, 0));
        SchoolLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SchoolLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SchoolLogo.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SetupB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResultsB)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(SchoolLogo)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StudentVoterB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(SchoolLogo)
                .addGap(36, 36, 36)
                .addComponent(StudentVoterB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetupB)
                    .addComponent(ResultsB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetupBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SetupBStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SetupBStateChanged

    private void SetupBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetupBMouseClicked
        this.dispose();
        Setup.main();
    }//GEN-LAST:event_SetupBMouseClicked

    private void StudentVoterBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentVoterBMouseClicked
        this.dispose();
        StudentVoter.main();
    }//GEN-LAST:event_StudentVoterBMouseClicked

    private void ResultsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultsBMouseClicked
        this.dispose();
        Results.main();
    }//GEN-LAST:event_ResultsBMouseClicked

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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResultsB;
    private javax.swing.JLabel SchoolLogo;
    private javax.swing.JButton SetupB;
    private javax.swing.JButton StudentVoterB;
    // End of variables declaration//GEN-END:variables
}
