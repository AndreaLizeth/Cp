/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundogui;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class HolaMundo extends javax.swing.JFrame {
     ArrayList list = new ArrayList();
    /**
     * Creates new form HolaMundo
     */
    public HolaMundo() {
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

        lblHola = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        lblOp = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDialog = new javax.swing.JLabel();
        txtItems = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre: ");

        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        btnOK.setText("Añadir a la Lista");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblHola))
                        .addGap(202, 202, 202))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDialog)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblNombre)
                        .addGap(46, 46, 46)
                        .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOK)
                        .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDialog)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblHola)
                .addGap(18, 18, 18)
                .addComponent(lblOp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtTextoActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
               
        
       
        /*list.add("Hola");
        list.add(1);
        
        System.out.println("Posicion 0: " + list.get(0));
        System.out.println("Posicion 1: "+ list.get(1));*/
        
     /*   String grados = txtC.getText();
     
       double gr = Double.parseDouble(grados);
        
         double total = (1.8 * gr) + 32 ;
         
         String re = Double.toString(total);
         
            txtF.setText(re);*/
     String txt;
     txt = txtTexto.getText();
        // Icon icon = new Icon();
  //  JOptionPane.showMessageDialog(rootPane, txt , "Mensaje" , JOptionPane.PLAIN_MESSAGE);
  
    int option = JOptionPane.showConfirmDialog(rootPane,"ESTÁ SEGURO ?", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
    if(option == 0){
        txtTexto.getText();
        this.list.add(txt);
        JOptionPane.showMessageDialog(rootPane,"El ítem se añadió a las lista");
        
        for(Object item : list){
        txtItems.setText((String)item);
      
        }
      
    }else if(option == 1) {
        JOptionPane.showMessageDialog(rootPane,"El ítem no se añadió a las lista.");
    }
    
    
     /* System.out.println("Usted seleccionó: " + option);
      String op;
      op = Integer.toString(option);
    
        lblOp.setText(op);
        
      lblH.setText(txt);
     String Dialog = JOptionPane.showInputDialog("Ingrese el mensaje: ");*/
     
    /* String opcion []= new String [4];
     opcion [0] = "uno";
     opcion [1] = "dos";
     opcion [2] = "tres";
     opcion [3] = "cuatro";
     
     int se = JOptionPane.showOptionDialog(rootPane,"Seleccione su deporte favorito", "Deportes", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,null, opcion, opcion[3]);
     
     lblDialog.setText(Dialog);*/
    
    
   
    }//GEN-LAST:event_btnOKActionPerformed

    
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
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HolaMundo().setVisible(true);//crea un anueva instancia y la hace visible.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDialog;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblHola;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOp;
    private javax.swing.JTextField txtItems;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}