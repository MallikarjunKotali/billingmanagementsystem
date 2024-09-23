
import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

public class print extends javax.swing.JFrame {

    private String lbId;
    private String ldate;
    public print() {
        initComponents();
    }
    String ltot;
    String lpaid;
    String lretu;
    
     public print(String tot,String paid,String retu,TableModel tableModel) throws PrinterException {
        initComponents();

        this.ltot = tot;
        this.lpaid = paid;
        this.lretu = retu;
        
        txtprint.setText(txtprint.getText()+"\tAayush Garments & Textiles, Solapur\n\n");
        //txtprint.setText(txtprint.getText()+"BillNo:" + bId +"\t\t\t" + date+"\n\n");
        txtprint.setText(txtprint.getText()+"========================================================\n");
        txtprint.setText(txtprint.getText()+"Product"+"\t\t"+"Rate"+"\t"+"Qty"+"\t"+"Total"+"\n");
        
        for(int i=0; i< tableModel.getRowCount(); i++)
        {
            String product = (String) tableModel.getValueAt(i, 0);
            int rate = (int) tableModel.getValueAt(i, 2);
            int quantity = (int) tableModel.getValueAt(i, 3);
            int total = (int) tableModel.getValueAt(i, 4);
            
            txtprint.setText(txtprint.getText()+product+"\t\t"+rate+"\t"+quantity+"\t"+total+"\n");  
        }
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        
        txtprint.setText(txtprint.getText()+"\t\t\t"+"SubTotal:\t"+tot+ "\n");
        txtprint.setText(txtprint.getText()+"\t\t\t"+"PaidAmt: \t"+paid+ "\n");
        txtprint.setText(txtprint.getText()+"\t\t\t"+"ReturnAmt: \t"+retu+ "\n");
        
        txtprint.setText(txtprint.getText()+"========================================================\n");
        txtprint.setText(txtprint.getText()+"================Thank You..!! Visit Again=====================\n");
        
        txtprint.print();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtprint.setColumns(20);
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
