/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
/**
 *
 * @author Álvaro
 */
public class Tablero extends javax.swing.JFrame implements MouseListener {

    private final Celda[][] celdas;
    private final int ancho = 800;
    private final int alto = ancho;
    private final int numCeldas = 32;
    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        jPanel1.setSize(ancho,alto);
        jPanel1.setPreferredSize(new java.awt.Dimension(ancho, alto));
        this.setPreferredSize(new java.awt.Dimension(ancho + ancho / 4, alto + alto / 4));
        this.setSize(new java.awt.Dimension(ancho + ancho / 4, alto + alto / 6));
        boolean color = false;
        int x = 0;
        int y = 0;
        int sumador = ancho / numCeldas;
        this.celdas = new Celda[numCeldas][numCeldas];
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = new Celda(jPanel1, color,j,i,numCeldas);
                celdas[i][j].setLocation(x, y);
                celdas[i][j].addMouseListener(this);
                jPanel1.add(celdas[i][j]);
                x += sumador;
                color = !color;

            }
            color = !color;
            x = 0;
            y += sumador;
        }
        jPanel1.setBackground(Color.red);
        jPanel1.repaint();
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
        btnPeon = new javax.swing.JToggleButton();
        btnTorre = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnPeon.setText("Peon");
        btnPeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeonActionPerformed(evt);
            }
        });

        btnTorre.setText("Torre");
        btnTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTorre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnPeon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTorre)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreActionPerformed
        // TODO add your handling code here:
        btnPeon.setSelected(false);
    }//GEN-LAST:event_btnTorreActionPerformed

    private void btnPeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeonActionPerformed
        // TODO add your handling code here:
        btnTorre.setSelected(false);
    }//GEN-LAST:event_btnPeonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPeon;
    private javax.swing.JToggleButton btnTorre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Celda celda = (Celda) e.getSource();
        System.out.println(
                "¡Clic en celda: ["+celda.getIndiceY()+","+celda.getIndiceX()+"]!"
        );
        

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Celda celda = (Celda) e.getSource();
        System.out.println(
                "¡PULSADO: ["+celda.getIndiceY()+","+celda.getIndiceX()+"]!"
        );
        if(SwingUtilities.isLeftMouseButton(e)){
            if(btnPeon.isSelected())
                celda.setFigura("peon.png");
            else if(btnTorre.isSelected())
                celda.setFigura("torre.png");
            jPanel1.repaint();
        }
        else if(SwingUtilities.isRightMouseButton(e)){
            celda.quitaFigura();
            jPanel1.repaint();
        }
        else if(SwingUtilities.isMiddleMouseButton(e)){
            System.out.println(celda.isEmpty() ? "Esta vacia" : "Tiene figura");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Celda celda = (Celda) e.getSource();
        System.out.println(
                "¡SOLTADO: ["+celda.getIndiceY()+","+celda.getIndiceX()+"]!"
        );
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Celda celda = (Celda) e.getSource();
        celda.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        System.out.println(
                "¡El puntero entra en la celda: ["+celda.getIndiceY()+","+celda.getIndiceX()+"]!"
        );
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Celda celda = (Celda) e.getSource(); 
        celda.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
