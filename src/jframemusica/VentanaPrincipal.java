package jframemusica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {
VentanaPrincipal.CustomPanel fondo = new VentanaPrincipal.CustomPanel();
    static String nra = "data/discos.csv";
    public static List<Model> discos_al = null;

    public VentanaPrincipal() {
        VentanaLogin vl = new VentanaLogin();
        vl.setVisible(true);
        this.setContentPane(fondo);
        initComponents();
        personalizar_JFrame();
        loadArrayList();
    }
  

    public void personalizar_JFrame() {
        // this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("nota.jpg")));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void loadArrayList() {
        discos_al = Controller.read(nra);
    }

    public void showAll() {
        if (discos_al.size() >= 0) {
            txaContenido.setText("");
            txtDisco.setText("");
            String cabecera = Model.cabecera();
            txaContenido.append(cabecera);
            for (Model model : discos_al) {
                String cuerpo = model.cuerpo();
                txaContenido.append(cuerpo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "NO HAY REGISTROS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtDisco = new javax.swing.JTextField();
        buttonShowall = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Discos Música");
        jLabel1.setOpaque(true);

        buttonShowall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/update (2).png"))); // NOI18N
        buttonShowall.setText("MOSTRAR TODO");
        buttonShowall.setActionCommand("  MOSTRAR TODO");
        buttonShowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowallActionPerformed(evt);
            }
        });

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/buscar.png"))); // NOI18N
        buttonSearch.setText("BUSCAR");
        buttonSearch.setActionCommand("  BUSCAR");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/añadir.png"))); // NOI18N
        buttonAdd.setText("  AÑADIR REGISTRO");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/editar.png"))); // NOI18N
        buttonEdit.setText("EDITAR REGISTRO");
        buttonEdit.setActionCommand("  EDITAR REGISTRO");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemusica/borrar.png"))); // NOI18N
        buttonDelete.setText("BORRAR REGISTRO");
        buttonDelete.setActionCommand("  BORRAR REGISTRO");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(buttonShowall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonShowall)
                    .addComponent(buttonEdit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSearch)
                            .addComponent(txtDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAdd)
                            .addComponent(buttonDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowallActionPerformed
        showAll();
    }//GEN-LAST:event_buttonShowallActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        txaContenido.setText("");
        String buscadisco = txtDisco.getText().trim();
        boolean existe = false;
        String cabecera = Model.cabecera();
        txaContenido.append(cabecera);
        for (Model m : discos_al) {
            if (String.valueOf(m.getId()).equalsIgnoreCase(buscadisco)
                    || m.getArtista().equalsIgnoreCase(buscadisco)
                    || m.getDisco().equalsIgnoreCase(buscadisco)
                    || String.valueOf(m.getAp()).equalsIgnoreCase(buscadisco)) {

                String cuerpo = m.cuerpo();
                txaContenido.append(cuerpo);
                existe = true;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(this, "ARTISTA,DISCO, ID O AÑO DE PUBLICACIÓN NO DISPONIBLE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        VentanaAdd v = new VentanaAdd();
        v.setVisible(true);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        VentanaEdit v = new VentanaEdit();
        v.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        VentanaDelete v = new VentanaDelete();
        v.setVisible(true);
        showAll();

        /*int opcion = (JOptionPane.showConfirmDialog(this,
                "SEGURO QUE DESEA BORRAR EL REGISTRO?", "BORRAR REGISTRO",
                JOptionPane.YES_NO_OPTION));
        if (opcion == 0 JOptionPane.YES_OPTION) {

           /* String id = txtDisco.getText();
            boolean exists = false;
            System.out.print(id);

            for (Model m : discos_al) {
                //txaContenido.getClientProperty(i);
                //Model m = discos_al.get(i);
                //int idDisco = Integer.parseInt(id);

                if (Integer.parseInt(id) == m.getId()) {
                    discos_al.remove(m);
                    exists = true;
                    JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    if (id.equalsIgnoreCase(m.getArtista())) {
                        discos_al.remove(m);
                        exists = true;
                        JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        if (id.equalsIgnoreCase(m.getDisco())) {
                            discos_al.remove(m);
                            exists = true;
                            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                            if (m.getAp() == Integer.parseInt(id)) {
                                discos_al.remove(m);
                                exists = true;
                                JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(this, "ap  NO EXISTEN", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "disco  NO EXISTEN", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "ARTISTA  NO EXISTEN", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "ID NO EXISTEN", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

                
                    //discos_al.remove(m);
                    exists = true;
                    //JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    showAll();
                    Controller.write(discos_al);
                    //break;
                /* else if (exists) {
                    JOptionPane.showMessageDialog(this, "ID NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
               else if (id.equalsIgnoreCase(m.getArtista())
                        || id.equalsIgnoreCase(m.getDisco())) {
                    discos_al.remove(i);
                    exists = true;
                    JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    showAll();
                    Controller.write(discos_al);

                }
}
            
            else if (opcion == 0 /*JOptionPane.NO_OPTION) {
            }
            
         */

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
    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShowall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaContenido;
    private javax.swing.JTextField txtDisco;
    // End of variables declaration//GEN-END:variables
}
