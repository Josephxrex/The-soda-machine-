/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22.pkg10.pkg21;

import java.util.Stack;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class MaquinaExpendedora extends javax.swing.JFrame {
         
         Stack < Double > totalDin = new Stack < Double > ();
        
    public MaquinaExpendedora() {
        initComponents();
        setLocationRelativeTo(null);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbcoca);
        grupo1.add(rbligth);
        grupo1.add(rbSprite);
        grupo1.add(rbmanzanita);
        grupo1.add(rbounch);
        grupo1.add(rbfanta);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbfanta = new javax.swing.JRadioButton();
        rbounch = new javax.swing.JRadioButton();
        rbligth = new javax.swing.JRadioButton();
        rbcoca = new javax.swing.JRadioButton();
        rbSprite = new javax.swing.JRadioButton();
        rbmanzanita = new javax.swing.JRadioButton();
        canLigth = new javax.swing.JLabel();
        canFanta = new javax.swing.JLabel();
        canManzanita = new javax.swing.JLabel();
        canCoca = new javax.swing.JLabel();
        canPunch = new javax.swing.JLabel();
        canSprite = new javax.swing.JLabel();
        canfanta = new javax.swing.JLabel();
        canFanta3 = new javax.swing.JLabel();
        monedadtext = new javax.swing.JTextField();
        canFanta4 = new javax.swing.JLabel();
        btnTomar = new javax.swing.JButton();
        canFanta6 = new javax.swing.JLabel();
        txtSaldoAC1 = new javax.swing.JLabel();
        btnInsertar1 = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbfanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbfanta.setForeground(new java.awt.Color(255, 255, 255));
        rbfanta.setText("Fanta");
        rbfanta.setEnabled(false);
        getContentPane().add(rbfanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        rbounch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbounch.setForeground(new java.awt.Color(255, 255, 255));
        rbounch.setText("Punch");
        rbounch.setEnabled(false);
        getContentPane().add(rbounch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        rbligth.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbligth.setForeground(new java.awt.Color(255, 255, 255));
        rbligth.setText("Coca light");
        rbligth.setEnabled(false);
        getContentPane().add(rbligth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        rbcoca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbcoca.setForeground(new java.awt.Color(255, 255, 255));
        rbcoca.setText("Coca Cola");
        rbcoca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbcoca.setEnabled(false);
        getContentPane().add(rbcoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        rbSprite.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbSprite.setForeground(new java.awt.Color(255, 255, 255));
        rbSprite.setText("Sprite");
        rbSprite.setEnabled(false);
        getContentPane().add(rbSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        rbmanzanita.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbmanzanita.setForeground(new java.awt.Color(255, 255, 255));
        rbmanzanita.setText("Manzanita");
        rbmanzanita.setEnabled(false);
        getContentPane().add(rbmanzanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        canLigth.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canLigth.setForeground(new java.awt.Color(255, 255, 255));
        canLigth.setText("5");
        getContentPane().add(canLigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        canFanta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canFanta.setForeground(new java.awt.Color(153, 153, 153));
        canFanta.setText("[0.5,1,2,5,10]");
        getContentPane().add(canFanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 110, -1));

        canManzanita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canManzanita.setForeground(new java.awt.Color(255, 255, 255));
        canManzanita.setText("5");
        getContentPane().add(canManzanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        canCoca.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canCoca.setForeground(new java.awt.Color(255, 255, 255));
        canCoca.setText("5");
        getContentPane().add(canCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        canPunch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canPunch.setForeground(new java.awt.Color(255, 255, 255));
        canPunch.setText("5");
        getContentPane().add(canPunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        canSprite.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canSprite.setForeground(new java.awt.Color(255, 255, 255));
        canSprite.setText("5");
        getContentPane().add(canSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        canfanta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canfanta.setForeground(new java.awt.Color(255, 255, 255));
        canfanta.setText("5");
        getContentPane().add(canfanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        canFanta3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canFanta3.setForeground(new java.awt.Color(153, 153, 153));
        canFanta3.setText("moneda:");
        getContentPane().add(canFanta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 110, -1));

        monedadtext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        monedadtext.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(monedadtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, -1));

        canFanta4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canFanta4.setForeground(new java.awt.Color(153, 153, 153));
        canFanta4.setText("Introduzca ");
        getContentPane().add(canFanta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, -1));

        btnTomar.setBackground(new java.awt.Color(255, 255, 51));
        btnTomar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTomar.setForeground(new java.awt.Color(102, 102, 102));
        btnTomar.setText("Tomar Refresco");
        btnTomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 290, -1));

        canFanta6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        canFanta6.setForeground(new java.awt.Color(153, 153, 153));
        canFanta6.setText("Saldo Actual");
        getContentPane().add(canFanta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, -1));

        txtSaldoAC1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSaldoAC1.setForeground(new java.awt.Color(255, 204, 51));
        txtSaldoAC1.setText("0.0");
        getContentPane().add(txtSaldoAC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 110, -1));

        btnInsertar1.setBackground(new java.awt.Color(255, 255, 51));
        btnInsertar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInsertar1.setForeground(new java.awt.Color(102, 102, 102));
        btnInsertar1.setText("Insertar");
        btnInsertar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertar1MouseClicked(evt);
            }
        });
        btnInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg22/pkg10/pkg21/Fondo (2).png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed
       
    }//GEN-LAST:event_btnInsertar1ActionPerformed

    private void btnInsertar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertar1MouseClicked
         //Codigo boton 
         String din,aux;
         double dinero=0,total=0;
         din=monedadtext.getText();
         aux=revisarCadena(din);
         dinero=dinero+Double.parseDouble(aux);
         if(( dinero!= 0.5) &&(  dinero!= 1) &&(  dinero!= 2) && (  dinero != 5) && (  dinero != 10)) {
	  javax.swing.JOptionPane.showMessageDialog(null,"SOLO MONEDAS DE .50, 1, 2, 5, 10");
          monedadtext.setText("");
         }else{
         totalDin.push(dinero);
         for(int i = 0; i < totalDin.size(); i++)
            {
          total+=totalDin.get(i);
          }
         monedadtext.setText("");
         txtSaldoAC1.setText(Double.toString(total));
         activarRadio(total);
         }
        
    }//GEN-LAST:event_btnInsertar1MouseClicked

    private void btnTomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarActionPerformed
      int c1,c2,c3,c4,c5,c6;
      c1=Integer.parseInt(canCoca.getText());
      c2=Integer.parseInt(canLigth.getText());
      c3=Integer.parseInt(canfanta.getText());
      c4=Integer.parseInt(canSprite.getText());
      c5=Integer.parseInt(canManzanita.getText());
      c6=Integer.parseInt(canPunch.getText());
      double cambio=0,precio;
      precio=Double.parseDouble(txtSaldoAC1.getText());
      //COCA COLA
      if(rbcoca.isSelected()==true){
        cambio=precio-13;
        JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu Coca");
        funcionX();
        if(c1!=0){
         c1--;
         canCoca.setText(Integer.toString(c1));
        }
        else{
        JOptionPane.showMessageDialog(null,"Ya no quedan mas ");
        }
      }
     
       //COCA COLA LIGTH
      if(rbligth.isSelected()==true){
        cambio=precio-15;
         JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu Coca Ligth");
         funcionX();
         if(c2!=0){
         c2--;
         canLigth.setText(Integer.toString(c2));
        }else{
        JOptionPane.showMessageDialog(null,"Ya no quedan mas ");
        }
      }
      //Fanta
      if(rbfanta.isSelected()==true){
        cambio=precio-11;
        JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu  Fanta");
        funcionX();
        if(c3!=0){
         c3--;
         canfanta.setText(Integer.toString(c3));
        }
      }
     //Sprite
      if(rbSprite.isSelected()==true){
        cambio=precio-13.5;
       JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu  Sprite");
       funcionX();
       if(c4!=0){
         c4--;
         canSprite.setText(Integer.toString(c4));
        }else{
        JOptionPane.showMessageDialog(null,"Ya no quedan mas ");
        }
      }
      //Manzanita
       if(rbmanzanita.isSelected()==true){
        cambio=precio-11;
       JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu Manzanita");
       funcionX();
       if(c5!=0){
         c5--;
         canManzanita.setText(Integer.toString(c5));
        }else{
        JOptionPane.showMessageDialog(null,"Ya no quedan mas ");
        }
      }
       //Brunch
       if(rbounch.isSelected()==true){
       cambio=precio-10;
       JOptionPane.showMessageDialog(null,"Tu cambio es:"+(Double.toString(cambio))+"Disfruta tu Bounch");
       funcionX();
       if(c6!=0){
         c6--;
         canPunch.setText(Integer.toString(c6));
        }else{
        JOptionPane.showMessageDialog(null,"Ya no quedan mas ");
        }
      }
    }//GEN-LAST:event_btnTomarActionPerformed
    public void funcionX(){
     rbcoca.setEnabled(false);
     rbligth.setEnabled(false);
     rbfanta.setEnabled(false);
     rbSprite.setEnabled(false);
     rbounch.setEnabled(false);
     rbmanzanita.setEnabled(false);
     txtSaldoAC1.setText("0");
    
     
     do{
         totalDin.pop();
     }while(!totalDin.isEmpty());
    
    }
    public String revisarCadena(String cadena){
       String m1,m2,m3,m4,m5;
       m1="0.5";
       m2="1";
       m3="2";
       m4="5";
       m5="10";
       if(cadena.equals(m1)||cadena.equals(m2)||cadena.equals(m3)||cadena.equals(m4)||cadena.equals(m4)||cadena.equals(m5)){
           return cadena;
       }else{
        JOptionPane.showMessageDialog(null,"Tu opcion no es valida");
        monedadtext.setText("");
       }
       return cadena;
    }
    public void activarRadio(double precio){
        if(precio>=15){
        rbcoca.setEnabled(true);
        rbligth.setEnabled(true);
        rbSprite.setEnabled(true);
        rbmanzanita.setEnabled(true);
        rbounch.setEnabled(true);
        rbfanta.setEnabled(true);
        }
        if(precio==10){
        rbounch.setEnabled(true);
        }
        if(precio>=11){
         rbounch.setEnabled(true);
         rbfanta.setEnabled(true);
         rbmanzanita.setEnabled(true);
        }
        if(precio>11 &&precio<13){
         rbounch.setEnabled(true);
         rbfanta.setEnabled(true);
         rbmanzanita.setEnabled(true);
         rbcoca.setEnabled(true);
        }
        
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
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaquinaExpendedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnInsertar1;
    private javax.swing.JButton btnTomar;
    private javax.swing.JLabel canCoca;
    private javax.swing.JLabel canFanta;
    private javax.swing.JLabel canFanta3;
    private javax.swing.JLabel canFanta4;
    private javax.swing.JLabel canFanta6;
    private javax.swing.JLabel canLigth;
    private javax.swing.JLabel canManzanita;
    private javax.swing.JLabel canPunch;
    private javax.swing.JLabel canSprite;
    private javax.swing.JLabel canfanta;
    private javax.swing.JTextField monedadtext;
    private javax.swing.JRadioButton rbSprite;
    private javax.swing.JRadioButton rbcoca;
    private javax.swing.JRadioButton rbfanta;
    private javax.swing.JRadioButton rbligth;
    private javax.swing.JRadioButton rbmanzanita;
    private javax.swing.JRadioButton rbounch;
    private javax.swing.JLabel txtSaldoAC1;
    // End of variables declaration//GEN-END:variables
}
