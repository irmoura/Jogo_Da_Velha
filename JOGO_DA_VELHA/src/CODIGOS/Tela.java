/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 * 
 * @author irmoura
 */
public class Tela extends javax.swing.JFrame {
    
    public int primeira_escolha, total_de_movimentos, opcao, a1, a2, a3, b1, b2, b3, c1, c2, c3, x, bola;
    public String ganhador, ia1 = "", ia2 = "", ia3 = "", ib1 = "", ib2 = "", ib3 = "", ic1 = "", ic2 = "", ic3 = "";
    public boolean zerar = false;
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public void verificaJogada(String ia1, String ia2, String ia3, String ib1, String ib2, String ib3, String ic1, String ic2, String ic3, int total_de_movimentos){
        if(ia1.equals("X") && ia2.equals("X") && ia3.equals("X") || ia1.equals("ball") && ia2.equals("ball") && ia3.equals("ball") || 
           ib1.equals("X") && ib2.equals("X") && ib3.equals("X") || ib1.equals("ball") && ib2.equals("ball") && ib3.equals("ball") ||
           ic1.equals("X") && ic2.equals("X") && ic3.equals("X") || ic1.equals("ball") && ic2.equals("ball") && ic3.equals("ball") ||
           ia1.equals("X") && ib1.equals("X") && ic1.equals("X") || ia1.equals("ball") && ib1.equals("ball") && ic1.equals("ball") ||
           ia2.equals("X") && ib2.equals("X") && ic2.equals("X") || ia2.equals("ball") && ib2.equals("ball") && ic2.equals("ball") ||
           ia3.equals("X") && ib3.equals("X") && ic3.equals("X") || ia3.equals("ball") && ib3.equals("ball") && ic3.equals("ball") ||
           ia1.equals("X") && ib2.equals("X") && ic3.equals("X") || ia1.equals("ball") && ib2.equals("ball") && ic3.equals("ball") ||
           ia3.equals("X") && ib2.equals("X") && ic1.equals("X") || ia3.equals("ball") && ib2.equals("ball") && ic1.equals("ball") ||
           total_de_movimentos == 9){
           
           if(!(this.total_de_movimentos == 9)){
               if(ganhador.equals("X")){
               JOptionPane.showMessageDialog(null,"O ganhador foi o X");
               x++;
               vitoriasX.setText("X : "+x);
           }else{
               JOptionPane.showMessageDialog(null,"O ganhador foi a Bola");
               bola++;
               vitoriasO.setText("O : "+bola);
           }
           }else{
               JOptionPane.showMessageDialog(null,"Deu velha.");
           }
           
//            System.exit(0);
            zerar = true;
        }
        if(zerar == true){
            
            A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png")));
            
            primeira_escolha = 0;
            this.total_de_movimentos = 0;
            opcao = 2;
            a1 = 0;
            a2 = 0;
            a3 = 0;
            b1 = 0;
            b2 = 0;
            b3 = 0;
            c1 = 0;
            c2 = 0;
            c3 = 0;
            
            this.ia1 = "";
            this.ia2 = "";
            this.ia3 = "";
            this.ib1 = "";
            this.ib2 = "";
            this.ib3 = "";
            this.ic1 = "";
            this.ic2 = "";
            this.ic3 = "";
            
            zerar = false;
            
            formWindowOpened(null);
            
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

        C1 = new javax.swing.JToggleButton();
        A1 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        vitoriasX = new javax.swing.JLabel();
        vitoriasO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        C1.setToolTipText("");
        C1.setContentAreaFilled(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        A1.setToolTipText("");
        A1.setContentAreaFilled(false);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        B1.setToolTipText("");
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        A2.setToolTipText("");
        A2.setContentAreaFilled(false);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        B2.setToolTipText("");
        B2.setContentAreaFilled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        C2.setToolTipText("");
        C2.setContentAreaFilled(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        A3.setToolTipText("");
        A3.setContentAreaFilled(false);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        B3.setToolTipText("");
        B3.setContentAreaFilled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/branco.png"))); // NOI18N
        C3.setToolTipText("");
        C3.setContentAreaFilled(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        vitoriasX.setText("X : ");

        vitoriasO.setText("O : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(A2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addGap(5, 5, 5)
                        .addComponent(C2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3)
                        .addGap(5, 5, 5)
                        .addComponent(C3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A1)
                            .addComponent(vitoriasX, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1)
                                .addGap(5, 5, 5)
                                .addComponent(C1))
                            .addComponent(vitoriasO, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitoriasX)
                    .addComponent(vitoriasO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C1)
                    .addComponent(A1)
                    .addComponent(B1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C2)
                    .addComponent(A2)
                    .addComponent(B2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C3)
                    .addComponent(A3)
                    .addComponent(B3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        
        a1++;
        if(a1==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ia1 = ""+A1.getIcon();
        if(ia1.contains("X")){
            ia1 = "X";
        }else{
            ia1 = "ball";
        }
        
        ganhador = ia1;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        
        b1++;
        if(b1==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ib1 = ""+B1.getIcon();
        if(ib1.contains("X")){
            ib1 = "X";
        }else{
            ib1 = "ball";
        }
        
        ganhador = ib1;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        
        c1++;
        if(c1==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ic1 = ""+C1.getIcon();
        if(ic1.contains("X")){
            ic1 = "X";
        }else{
            ic1 = "ball";
        }
        
        ganhador = ic1;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_C1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        
        a2++;
        if(a2==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ia2 = ""+A2.getIcon();
        if(ia2.contains("X")){
            ia2 = "X";
        }else{
            ia2 = "ball";
        }
        
        ganhador = ia2;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        
        b2++;
        if(b2==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ib2 = ""+B2.getIcon();
        if(ib2.contains("X")){
            ib2 = "X";
        }else{
            ib2 = "ball";
        }
        
        ganhador = ib2;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        
        c2++;
        if(c2==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ic2 = ""+C2.getIcon();
        if(ic2.contains("X")){
            ic2 = "X";
        }else{
            ic2 = "ball";
        }
        
        ganhador = ic2;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_C2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        
        a3++;
        if(a3==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ia3 = ""+A3.getIcon();
        if(ia3.contains("X")){
            ia3 = "X";
        }else{
            ia3 = "ball";
        }
        
        ganhador = ia3;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        
        b3++;
        if(b3==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ib3 = ""+B3.getIcon();
        if(ib3.contains("X")){
            ib3 = "X";
        }else{
            ib3 = "ball";
        }
        
        ganhador = ib3;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        
        c3++;
        if(c3==1){
            primeira_escolha++;
            total_de_movimentos++;
            if(primeira_escolha%2==0){
                C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/ball.png")));
            }else{
                C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/X.png")));
            }
            System.out.println(total_de_movimentos);
        }
        
        ic3 = ""+C3.getIcon();
        if(ic3.contains("X")){
            ic3 = "X";
        }else{
            ic3 = "ball";
        }
        
        ganhador = ic3;
        
        verificaJogada(ia1, ia2, ia3, ib1, ib2, ib3, ic1, ic2, ic3, total_de_movimentos);
        
    }//GEN-LAST:event_C3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        Object[] options = { "O", "X" };   
        opcao = JOptionPane.showOptionDialog(null,"Escolha com o que deseja iniciar :","Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);   
  
        if (opcao != 0){
        
        primeira_escolha = 0;
            
        }else{
              
        primeira_escolha = 1;
            
        }
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JLabel vitoriasO;
    private javax.swing.JLabel vitoriasX;
    // End of variables declaration//GEN-END:variables
}
