/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj.aplicacion;

import java.util.Date;
import javax.swing.JOptionPane;
import reloj.Display;
import reloj.Metodos;

/**
 *
 * @author laudi
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setVisible(true);
        horaActual.setVisible(false);
        hora.setVisible(false);
        masHora.setVisible(false);
        menosHoras.setVisible(false);
        puntos.setVisible(false);
        minutos.setVisible(false);
        masMinutos.setVisible(false);
        menosMinutos.setVisible(false);
        crear.setVisible(false);
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
        mostrarHora = new javax.swing.JButton();
        horaActual = new javax.swing.JLabel();
        crearAlarma = new javax.swing.JButton();
        hora = new javax.swing.JTextField();
        minutos = new javax.swing.JTextField();
        puntos = new javax.swing.JLabel();
        menosHoras = new javax.swing.JLabel();
        masMinutos = new javax.swing.JLabel();
        masHora = new javax.swing.JLabel();
        menosMinutos = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        activarAlarma = new javax.swing.JButton();
        pararAlarma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reloj");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        mostrarHora.setBackground(new java.awt.Color(255, 255, 255));
        mostrarHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mostrarHora.setText("Mostrar Hora");
        mostrarHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarHoraMouseClicked(evt);
            }
        });

        horaActual.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        crearAlarma.setBackground(new java.awt.Color(255, 255, 255));
        crearAlarma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        crearAlarma.setText("Crear Alarma");
        crearAlarma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearAlarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearAlarmaMouseClicked(evt);
            }
        });

        hora.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        minutos.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        puntos.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        puntos.setText(":");

        menosHoras.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        menosHoras.setText("-");
        menosHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosHorasMouseClicked(evt);
            }
        });

        masMinutos.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        masMinutos.setText("+");
        masMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMinutosMouseClicked(evt);
            }
        });

        masHora.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        masHora.setText("+");
        masHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masHoraMouseClicked(evt);
            }
        });

        menosMinutos.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        menosMinutos.setText("-");
        menosMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosMinutosMouseClicked(evt);
            }
        });

        crear.setBackground(new java.awt.Color(255, 255, 255));
        crear.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        crear.setText("Crear");
        crear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });

        activarAlarma.setBackground(new java.awt.Color(255, 255, 255));
        activarAlarma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        activarAlarma.setText("Activar Alarma");
        activarAlarma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        activarAlarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activarAlarmaMouseClicked(evt);
            }
        });

        pararAlarma.setBackground(new java.awt.Color(255, 255, 255));
        pararAlarma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pararAlarma.setText("Parar Alarma");
        pararAlarma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pararAlarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pararAlarmaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(crearAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(activarAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(masHora)
                        .addGap(27, 27, 27)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menosHoras)
                        .addGap(23, 23, 23)
                        .addComponent(puntos)
                        .addGap(18, 18, 18)
                        .addComponent(masMinutos)
                        .addGap(18, 18, 18)
                        .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menosMinutos)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(pararAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(mostrarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activarAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pararAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntos)
                    .addComponent(menosHoras)
                    .addComponent(masMinutos)
                    .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menosMinutos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(masHora))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHoraMouseClicked
        // TODO add your handling code here:
        horaActual.setVisible(true);
        horaActual.setText(Display.mostrarReloj());
    }//GEN-LAST:event_mostrarHoraMouseClicked

    private void crearAlarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearAlarmaMouseClicked
        // TODO add your handling code here:
        Date fecha = new Date();
        hora.setVisible(true);
        masHora.setVisible(true);
        menosHoras.setVisible(true);
        puntos.setVisible(true);
        minutos.setVisible(true);
        masMinutos.setVisible(true);
        menosMinutos.setVisible(true);
        crear.setVisible(true);
        hora.setText(String.valueOf(fecha.getHours()));
        minutos.setText(String.valueOf(fecha.getMinutes()));
    }//GEN-LAST:event_crearAlarmaMouseClicked

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        // TODO add your handling code here:
        Metodos.crearAlarma(Integer.parseInt(hora.getText()), Integer.parseInt(minutos.getText()));
        hora.setVisible(false);
        masHora.setVisible(false);
        menosHoras.setVisible(false);
        puntos.setVisible(false);
        minutos.setVisible(false);
        masMinutos.setVisible(false);
        menosMinutos.setVisible(false);
        crear.setVisible(false);
    }//GEN-LAST:event_crearMouseClicked

    private void masHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masHoraMouseClicked
        // TODO add your handling code here:
        int horas = Integer.parseInt(hora.getText());
        if (horas==23){
            hora.setText("0");
        }else{
            horas = horas+1;
            hora.setText(String.valueOf(horas));
        } 
    }//GEN-LAST:event_masHoraMouseClicked

    private void menosHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosHorasMouseClicked
        // TODO add your handling code here:
        int horas = Integer.parseInt(hora.getText());
        if (horas==1){
            hora.setText("12");
        }else{
            horas = horas-1;
            hora.setText(String.valueOf(horas));
        } 
    }//GEN-LAST:event_menosHorasMouseClicked

    private void masMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMinutosMouseClicked
        // TODO add your handling code here:
        int min = Integer.parseInt(minutos.getText());
        if (min!=60){
            min = min+1;
            minutos.setText(String.valueOf(min));
        }else{
            minutos.setText("0");
        } 
    }//GEN-LAST:event_masMinutosMouseClicked

    private void menosMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosMinutosMouseClicked
        // TODO add your handling code here:
        int min = Integer.parseInt(minutos.getText());
        if (min!=0){
            min = min-1;
            minutos.setText(String.valueOf(min));
        }else{
            minutos.setText("1");
        } 
    }//GEN-LAST:event_menosMinutosMouseClicked

    private void activarAlarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activarAlarmaMouseClicked
        // TODO add your handling code here:
        Metodos ob = new Metodos();
        ob.activarAlarma();
    }//GEN-LAST:event_activarAlarmaMouseClicked

    private void pararAlarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pararAlarmaMouseClicked
        // TODO add your handling code here:
        Metodos.pararAlarma();
    }//GEN-LAST:event_pararAlarmaMouseClicked

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarAlarma;
    private javax.swing.JButton crear;
    private javax.swing.JButton crearAlarma;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel horaActual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel masHora;
    private javax.swing.JLabel masMinutos;
    private javax.swing.JLabel menosHoras;
    private javax.swing.JLabel menosMinutos;
    private javax.swing.JTextField minutos;
    private javax.swing.JButton mostrarHora;
    private javax.swing.JButton pararAlarma;
    private javax.swing.JLabel puntos;
    // End of variables declaration//GEN-END:variables
}