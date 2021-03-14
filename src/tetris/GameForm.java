
package tetris;


import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.KeyStroke;


public
 class GameForm extends JFrame {
private GameArea ga;
   
   public
    GameForm() {
      initComponents();
      ga=new GameArea(placeholder, 10);
      this.add(ga);
      initControls();
      startGame();
   }
    private void initControls(){
       InputMap im=this.getRootPane().getInputMap();
       ActionMap am=this.getRootPane().getActionMap();
       
       im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
       im.put(KeyStroke.getKeyStroke("LEFT"), "left");
       im.put(KeyStroke.getKeyStroke("UP"), "up");
       im.put(KeyStroke.getKeyStroke("DOWN"), "down");
       
    am.put("right", new AbstractAction() {

          @Override
          public
          void actionPerformed(ActionEvent e) {
           ga.moveBlockRight();

          }
       });
    am.put("left", new AbstractAction() {

          @Override
          public
          void actionPerformed(ActionEvent e) {
          ga.moveBlockLeft();
          }
       });
    am.put("up", new AbstractAction() {

          @Override
          public
          void actionPerformed(ActionEvent e) {
   ga.rotateBlock();
          }
       });
    am.put("down", new AbstractAction() {

          @Override
          public
          void actionPerformed(ActionEvent e) {
           ga.dropBlock();
          }
       });
       
    }
public void startGame(){
   new GameThread(ga).start();
}

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      placeholder = new javax.swing.JPanel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      placeholder.setBackground(new java.awt.Color(238, 238, 238));
      placeholder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      javax.swing.GroupLayout placeholderLayout = new javax.swing.GroupLayout(placeholder);
      placeholder.setLayout(placeholderLayout);
      placeholderLayout.setHorizontalGroup(
         placeholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 200, Short.MAX_VALUE)
      );
      placeholderLayout.setVerticalGroup(
         placeholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 438, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addComponent(placeholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(150, 150, 150))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(placeholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

 
   public static
    void main(String args[]) {
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
         java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public
          void run() {
            new GameForm().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel placeholder;
   // End of variables declaration//GEN-END:variables
}
