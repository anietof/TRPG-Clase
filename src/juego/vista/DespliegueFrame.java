/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.vista;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import juego.controlador.BD;
import juego.controlador.ControladorPartida;
import juego.modelo.Unidad;

/**
 *
 * @author Adrian
 */
public class DespliegueFrame extends javax.swing.JFrame {

    private final ControladorPartida controladorPartida;
    private String faccion;
    private Unidad unidadSelec;
    

    /**
     * Creates new form DespliegueFrame
     */
    public DespliegueFrame(ControladorPartida controladorPartida) {
        initComponents();
        this.setLocation(5, 5); 
        this.controladorPartida = controladorPartida;
        this.controladorPartida.setDespliegueFrame(this);
        cargaUnidades();
    }

    private void cargaUnidades() {
        cBoxUnidades.removeAllItems();
        faccion = controladorPartida.getPartida().getJugadorActual().getFaccion();
        for(Unidad unidad : BD.getUnidades(faccion)){
            cBoxUnidades.addItem(unidad);
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

        labelImagen = new javax.swing.JLabel();
        txtJuActual = new javax.swing.JLabel();
        cBoxUnidades = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHeridas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFuerza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDefensa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCombate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMovimientos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCoste = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        btnFin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPuntosDespues = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtJuActual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtJuActual.setText("JUGADOR 1");
        txtJuActual.setToolTipText("");

        cBoxUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxUnidadesActionPerformed(evt);
            }
        });
        cBoxUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cBoxUnidadesKeyPressed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Heridas");

        txtHeridas.setEditable(false);
        txtHeridas.setFocusable(false);

        jLabel3.setText("Fuerza");

        txtFuerza.setEditable(false);
        txtFuerza.setFocusable(false);

        jLabel4.setText("Defensa");
        jLabel4.setToolTipText("");

        txtDefensa.setEditable(false);
        txtDefensa.setFocusable(false);

        jLabel5.setText("Combate");

        txtCombate.setEditable(false);
        txtCombate.setFocusable(false);

        jLabel6.setText("Movimientos");

        txtMovimientos.setEditable(false);
        txtMovimientos.setFocusable(false);

        jLabel7.setText("Coste");
        jLabel7.setToolTipText("");

        txtCoste.setEditable(false);
        txtCoste.setFocusable(false);

        jLabel8.setText("Puntos");
        jLabel8.setToolTipText("");

        txtPuntos.setEditable(false);
        txtPuntos.setFocusable(false);

        btnFin.setText("Terminar desplegado");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Despliega tus unidades");

        jLabel10.setText("Puntos - Coste");

        txtPuntosDespues.setEditable(false);
        txtPuntosDespues.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)))
                                .addGap(36, 36, 36)
                                .addComponent(cBoxUnidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJuActual)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPuntosDespues, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel3))
                                                .addGap(47, 47, 47))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(62, 62, 62)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnFin)))
                .addGap(20, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtJuActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHeridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCombate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtPuntosDespues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnFin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxUnidadesActionPerformed
        actualizaDatos();
    }//GEN-LAST:event_cBoxUnidadesActionPerformed

    public void actualizaDatos() {
        unidadSelec = (Unidad) cBoxUnidades.getSelectedItem();
        if(unidadSelec != null){
            txtHeridas.setText(String.valueOf(unidadSelec.getHeridas()));
            txtFuerza.setText(String.valueOf(unidadSelec.getFuerza()));
            txtCombate.setText(String.valueOf(unidadSelec.getCombate()));
            txtMovimientos.setText(String.valueOf(unidadSelec.getMovimientos()));
            txtCoste.setText(String.valueOf(unidadSelec.getCoste()));
            txtDefensa.setText(String.valueOf(unidadSelec.getDefensa()));
            labelImagen.setIcon(new ImageIcon(unidadSelec.getImagen().getImage().getScaledInstance(labelImagen.getWidth(), labelImagen.getHeight(), Image.SCALE_DEFAULT)));
            
            txtPuntos.setText(String.valueOf(controladorPartida.getPartida().getJugadorActual().getPuntos()));
            txtPuntosDespues.setText(String.valueOf(
                controladorPartida.getPartida().getJugadorActual().getPuntos() - unidadSelec.getCoste())
            );
            if(Integer.parseInt(txtPuntosDespues.getText()) <= 0){
                txtPuntosDespues.setBackground(Color.red);
            } else
                txtPuntosDespues.setBackground(null);
        }
    }
    

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        // TODO add your handling code here:
        if(controladorPartida.getPartida().getJugadorActual().getNumero() == 1){
            controladorPartida.getPartida().nuevoTurno();
            txtJuActual.setText("JUGADOR 2");
            cargaUnidades();
        }
        else{
            controladorPartida.getPartida().resetTurnos();
            controladorPartida.getControladorJuego().startPartida();
            this.dispose();
        }
        
    }//GEN-LAST:event_btnFinActionPerformed

    private void cBoxUnidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBoxUnidadesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btnFin.doClick();
    }//GEN-LAST:event_cBoxUnidadesKeyPressed

    public Unidad getUnidadSelec() {
        return unidadSelec;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFin;
    public javax.swing.JComboBox cBoxUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JTextField txtCombate;
    private javax.swing.JTextField txtCoste;
    private javax.swing.JTextField txtDefensa;
    private javax.swing.JTextField txtFuerza;
    private javax.swing.JTextField txtHeridas;
    private javax.swing.JLabel txtJuActual;
    private javax.swing.JTextField txtMovimientos;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtPuntosDespues;
    // End of variables declaration//GEN-END:variables
}


