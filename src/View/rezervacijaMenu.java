/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Spuda
 */
public class rezervacijaMenu extends javax.swing.JFrame {
int index;
    GridLayout gl;
    public JFrame BookingFormFrame;
    public JPanel BookingFormPanel;
    public JLabel l1,l3,l4,l6,l7,l8,l11,l13,l14,l16,l17,l18,mjestoLabel,imeTuristaL;
    public JTextField t3;
    public  javax.swing.JComboBox odabirTuristaCombo;
    /**
     * Creates new form rezervacijaMenu
     */
    public rezervacijaMenu() {
        initComponents();
        datumDolaska();
        prikazTabliceRezervacije();
        
    }
    public void datumDolaska(){
        Date date = new Date(); 
        datumDolaska.setDate(date);
    }
    public void comboBox(){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
        String sql = "Select * from turist";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            String ime = rs.getString("imeTurista");
            odabirTuristaCombo.addItem(ime);
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void prikazTabliceRezervacije(){
                        Connection  conn;
                        Statement stt;
                        ResultSet rss;
                        try
                        {
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
                            String ss;
                            stt=conn.createStatement();
                            ss="select * from rezervacija";
                            rss=stt.executeQuery(ss);
                            DefaultTableModel model2=(DefaultTableModel) tablicaBooking.getModel();
                            while(rss.next())
                            {
                                model2.addRow(new Object[]{rss.getString(1),rss.getString(2),rss.getString(3),rss.getString(4),rss.getString(5)});
                            }
                        }
                        catch(Exception  e)
                        {
                            System.out.println(e);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        unosMjestaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datumDolaska = new com.toedter.calendar.JDateChooser();
        pretraziGumb = new javax.swing.JButton();
        natragGumb = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablicaRezervacija = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablicaBooking = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Broj mjesta rezervacije");

        unosMjestaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                unosMjestaFieldFocusLost(evt);
            }
        });

        jLabel3.setText("Odabir datuma dolaska");

        datumDolaska.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datumDolaskaPropertyChange(evt);
            }
        });

        pretraziGumb.setText("Pretraži");
        pretraziGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretraziGumbActionPerformed(evt);
            }
        });

        natragGumb.setText("Natrag");
        natragGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natragGumbActionPerformed(evt);
            }
        });

        tablicaRezervacija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime smještaja", "Datum dolaska", "Broj mjesta", "Slobodna mjesta"
            }
        ));
        tablicaRezervacija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablicaRezervacijaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablicaRezervacija);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(natragGumb)
                            .addComponent(pretraziGumb))
                        .addContainerGap(391, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(unosMjestaField)
                            .addComponent(jLabel3)
                            .addComponent(datumDolaska, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unosMjestaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datumDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pretraziGumb)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(natragGumb)
                .addContainerGap())
        );

        tablicaBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime recepcionera", "idSmjestaja", "Broj zauzetih mjesta", "Ime Turista"
            }
        ));
        tablicaBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablicaBookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablicaBooking);
        if (tablicaBooking.getColumnModel().getColumnCount() > 0) {
            tablicaBooking.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void natragGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natragGumbActionPerformed
        mainMenu mainMenus = new mainMenu();
        mainMenus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_natragGumbActionPerformed

    private void pretraziGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretraziGumbActionPerformed
    DefaultTableModel model0=(DefaultTableModel) tablicaRezervacija.getModel();
        int x=model0.getRowCount();
        if(x!=0)
        {
        for(int i=0;i<x;i++)
        {
           model0.removeRow(0);
        }
        }
        ResultSet rs;
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String get = sdf.format(datumDolaska.getDate());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
            Statement stmt = conn.createStatement();
            String sql =  "select * from smjestaj where datumSmjestaja='"+get+"' && slobodniKapacitet >='"+unosMjestaField.getText()+"'";
            rs=stmt.executeQuery(sql);
            DefaultTableModel model=(DefaultTableModel) tablicaRezervacija.getModel();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_pretraziGumbActionPerformed

    private void unosMjestaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unosMjestaFieldFocusLost
        if (unosMjestaField.getText().isEmpty()) {
            //upozoravanje na unos broj mjesta
            JOptionPane.showMessageDialog(null, "Unesite broj mjesta","Informacija!", JOptionPane.INFORMATION_MESSAGE);
            // vracanje fokusa nazad na text field ako se ne unese broj mjesta prije
            unosMjestaField.requestFocus();
        }
    }//GEN-LAST:event_unosMjestaFieldFocusLost

    private void datumDolaskaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datumDolaskaPropertyChange

    }//GEN-LAST:event_datumDolaskaPropertyChange

    private void tablicaBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablicaBookingMouseClicked
       
    }//GEN-LAST:event_tablicaBookingMouseClicked

    private void tablicaRezervacijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablicaRezervacijaMouseClicked
        
        index = tablicaRezervacija.getSelectedRow();
        TableModel model=tablicaRezervacija.getModel();
        String idSmjestaja=(String) model.getValueAt(index, 0);
        String imeSmjestaja=(String) model.getValueAt(index, 1);
        String datumDolaskabook=(String) model.getValueAt(index, 2);
        String ukupnoSmjestaja=(String) model.getValueAt(index, 3);
        String slobodnoMjesta=(String) model.getValueAt(index, 4);
        BookingFormFrame=new JFrame();
        BookingFormPanel=new JPanel();
        gl=new GridLayout(11,2);
        l1=new JLabel("ID");
        l11=new JLabel(idSmjestaja);
        l3=new JLabel("Ime Smjestaja");
        l13=new JLabel(imeSmjestaja);
        l4=new JLabel("Datum dolaska");
        l14=new JLabel(datumDolaskabook);
        l6=new JLabel("Ukupno smjestaja");
        l16=new JLabel(String.valueOf(ukupnoSmjestaja));
        l7=new JLabel("Slobodno mjesta");
        l17=new JLabel(String.valueOf(slobodnoMjesta));
        mjestoLabel=new JLabel("Unesite Broj Mjesta");
        imeTuristaL=new JLabel("First Name");
        odabirTuristaCombo = new JComboBox();
        t3=new JTextField(20);
        comboBox();
        BookingFormFrame.getContentPane().add(BookingFormPanel);
        BookingFormPanel.setLayout(gl);
        
        BookingFormPanel.add(l1);
        BookingFormPanel.add(l11);
        BookingFormPanel.add(l3);
        BookingFormPanel.add(l13);
        BookingFormPanel.add(l4);
        BookingFormPanel.add(l14);
        BookingFormPanel.add(l6);
        BookingFormPanel.add(l16);
        BookingFormPanel.add(l7);
        BookingFormPanel.add(l17);
        BookingFormPanel.add(mjestoLabel);
        BookingFormPanel.add(t3);
        BookingFormPanel.add(imeTuristaL);
        BookingFormPanel.add(odabirTuristaCombo);
        
        int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {
            
            String booking_user="Marin Spudic";
            String imeTurista = (String)odabirTuristaCombo.getSelectedItem();
            String brojMjesta = t3.getText();
            int preostaloMjesta=Integer.parseInt(slobodnoMjesta)-Integer.parseInt(brojMjesta);
            Connection  con;
            Statement st;
            ResultSet rs;
            try
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
                st=con.createStatement();    
                String s= "select * from smjestaj where idSmjestaja ='"+idSmjestaja+"'";
                rs=st.executeQuery(s);
                String si= "insert into rezervacija(imeRecepcionera,idSmjestaja,brojZauzetihMjesta,imeTurista) values('"+booking_user+"','"+idSmjestaja+"','"+brojMjesta+"','"+imeTurista+"')";
                int i= st.executeUpdate(si);
                if(i==1)
                {
                    String updateQuery="update smjestaj set slobodniKapacitet='"+preostaloMjesta+"' where idSmjestaja='"+idSmjestaja+"'";
                    int j=st.executeUpdate(updateQuery);
                    if(j==1)
                    {
                        int aa=JOptionPane.showConfirmDialog(null,"REZERVIRANO","Obavijest",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                        if(aa==JOptionPane.OK_OPTION)
                        {
                            
                        DefaultTableModel model0=(DefaultTableModel) tablicaBooking.getModel();
                        int x=model0.getRowCount();
                        if(x!=0)
                        {
                            for(i=0;i<x;i++)
                            {
                               model0.removeRow(0);
                            }
                        }   
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
            DefaultTableModel dtm = (DefaultTableModel) tablicaBooking.getModel();
            dtm.setRowCount(0);
            prikazTabliceRezervacije();
    }//GEN-LAST:event_tablicaRezervacijaMouseClicked

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
            java.util.logging.Logger.getLogger(rezervacijaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rezervacijaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rezervacijaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rezervacijaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rezervacijaMenu().setVisible(true);
            }
        });
    }

    public JComboBox getOdabirTuristaCombo() {
        return odabirTuristaCombo;
    }

    public void setOdabirTuristaCombo(JComboBox odabirTuristaCombo) {
        this.odabirTuristaCombo = odabirTuristaCombo;
    }

    public JTextField getUnosMjestaField() {
        return unosMjestaField;
    }

    public void setUnosMjestaField(JTextField unosMjestaField) {
        this.unosMjestaField = unosMjestaField;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datumDolaska;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton natragGumb;
    private javax.swing.JButton pretraziGumb;
    private javax.swing.JTable tablicaBooking;
    private javax.swing.JTable tablicaRezervacija;
    private javax.swing.JTextField unosMjestaField;
    // End of variables declaration//GEN-END:variables

}
