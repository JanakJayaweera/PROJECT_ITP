

package Coding;
import GUI.Internal.Driver.addDriver;

public class interfaceControl {
        private javax.swing.JTable Table1;
        private javax.swing.JLabel idLabel;
        private javax.swing.JTextField fnametxt;
        private javax.swing.JTextField lnametxt;
        private javax.swing.JTextField NICtxt;
        private javax.swing.JTextField drvlicencetxt;
        private javax.swing.JTextField tptxt;
        private javax.swing.JTextField addresstxt;
        private javax.swing.JTextField emailtxt;
        
    public interfaceControl(){
        //Default constructor
    }
    public interfaceControl(javax.swing.JTable pTable1){
        Table1 = pTable1;
        //showTableValues();
    }
    
    
    public void showTableValues(){
    
    //Get table values to text boxes when selected
        
        int row = Table1.getSelectedRow();
        
        String id = Table1.getValueAt(row, 0).toString();
        String fname = Table1.getValueAt(row, 1).toString();
        String lname = Table1.getValueAt(row, 2).toString();
        String nic = Table1.getValueAt(row, 3).toString();
        String licenceno = Table1.getValueAt(row, 4).toString();
        String DOB = Table1.getValueAt(row, 5).toString();
        String telephone = Table1.getValueAt(row, 6).toString();
        String address = Table1.getValueAt(row, 7).toString();
        String email = Table1.getValueAt(row, 8).toString();
        
        idLabel.setText(id);
        fnametxt.setText(fname);
        lnametxt.setText(lname);
        NICtxt.setText(nic);
        drvlicencetxt.setText(licenceno);
        tptxt.setText(telephone);
        addresstxt.setText(address);
        emailtxt.setText(email);
    
    
    }
    
    public void clearForm(javax.swing.JTable Table1){
    
    //Clear form data
        idLabel.setText("Driver ID will assign automatically");
        fnametxt.setText("");
        lnametxt.setText("");
        NICtxt.setText("");
        drvlicencetxt.setText("");
        tptxt.setText("");
        addresstxt.setText("");
        emailtxt.setText("");
        
    
    }
}
