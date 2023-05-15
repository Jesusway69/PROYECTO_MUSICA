package jframemusica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static jframemusica.VentanaPrincipal.discos_al;
import static jframemusica.VentanaPrincipal.loadArrayList;

public class VentanaDelete extends javax.swing.JFrame {
     VentanaDelete.CustomPanel fondo = new VentanaDelete.CustomPanel();

    public VentanaDelete() {
        this.setContentPane(fondo);
        initComponents();
        personalizar_JFrame();
        loadArrayList();
    }

    public void personalizar_JFrame() {
        // this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("borrar.png")));
        this.setTitle("Borrar");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBorrar = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrar registro");

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escriba el id a borrar");

        txtBorrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonDelete.setBackground(new java.awt.Color(34, 47, 225));
        buttonDelete.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(102, 153, 255));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/borrar.png"))); // NOI18N
        buttonDelete.setText("Confirmar");
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

        int opcion = (JOptionPane.showConfirmDialog(this,
                "SEGURO QUE DESEA BORRAR EL REGISTRO?", "BORRAR REGISTRO",
                JOptionPane.YES_NO_OPTION));
        if (opcion == 0/*JOptionPane.YES_OPTION*/) {

            String id = txtBorrar.getText();
            for (int i = 0; i < discos_al.size(); i++) {
                Model m = discos_al.get(i);
                if (id.length() > 0) {
                    if (id.matches("[0-9]+")) {
                        if (Controller.exists(Integer.parseInt(id))) {

                            if (Integer.parseInt(id) == m.getId()) {
                                discos_al.remove(m);
                                Controller.write(discos_al);
                                VentanaPrincipal.loadArrayList();

                                JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                                txtBorrar.setText("");
                                this.setVisible(false);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "EL ID NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                            txtBorrar.setText("");
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "LA BÚSQUEDA SÓLO ADMITE NÚMEROS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        txtBorrar.setText("");
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "EL ÁREA DE BÚSQUEDA NO PUEDE ESTAR EN BLANCO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else if (opcion == 1 /*JOptionPane.NO_OPTION*/) {
        }

    }//GEN-LAST:event_buttonDeleteActionPerformed

    public class CustomPanel extends JPanel{    
    private URL url = getClass().getResource("cosmos.jpg");
    Image image = new ImageIcon(url).getImage();
    
    @Override
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
}
    }   
   /* public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDelete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDelete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDelete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDelete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDelete().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtBorrar;
    // End of variables declaration//GEN-END:variables
}
