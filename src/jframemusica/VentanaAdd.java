 package jframemusica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static jframemusica.VentanaPrincipal.discos_al;
import static jframemusica.VentanaPrincipal.nra;

public class VentanaAdd extends javax.swing.JFrame {
    VentanaAdd.CustomPanel fondo = new VentanaAdd.CustomPanel();

    public VentanaAdd() {
        this.setContentPane(fondo);
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("añadir.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("AÑADIR");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNuevoArtista = new javax.swing.JTextField();
        txtNuevoDisco = new javax.swing.JTextField();
        txtNuevoAnioPublicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonAddConfirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNuevoArtista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNuevoArtista.setToolTipText(getName());

        txtNuevoDisco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNuevoAnioPublicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir nuevo registro");

        buttonAddConfirm.setBackground(new java.awt.Color(26, 82, 239));
        buttonAddConfirm.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        buttonAddConfirm.setForeground(new java.awt.Color(153, 204, 255));
        buttonAddConfirm.setText("CONFIRMAR NUEVO REGISTRO");
        buttonAddConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddConfirm.setOpaque(true);
        buttonAddConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddConfirmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARTISTA");

        jLabel4.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DISCO");

        jLabel5.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AÑO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoArtista)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDisco)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoAnioPublicacion)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(buttonAddConfirm)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNuevoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuevoAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtNuevoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59)
                .addComponent(buttonAddConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddConfirmActionPerformed
     
        Model msize = discos_al.get(discos_al.size()-1);
        
       String id = String.valueOf(msize.getId()+1);
    

        //String id = txtNuevoId.getText().trim();
        String artista = txtNuevoArtista.getText().trim();
        String disco = txtNuevoDisco.getText().trim();
        String ap = txtNuevoAnioPublicacion.getText().trim();
        VentanaPrincipal.loadArrayList();

        //Model m = new Model(Integer.parseInt(id));
        //if (!Controller.exists(Integer.parseInt(id)) || Controller.isBlank(id)) {
        //if (Controller.isBlank(id)) {
            if (ap.matches("[0-9]+")) {
                if (!Controller.exists(Integer.parseInt(id))) {
                    if (Controller.isBlank(id)
                            && Controller.isBlank(artista)
                            && Controller.isBlank(disco)
                            && Controller.isBlank(ap)) {

                        Model m = new Model(Integer.parseInt(id), artista, disco, Integer.parseInt(ap));

                        VentanaPrincipal.discos_al.add(m);
                        Controller.write(discos_al);
                        JOptionPane.showMessageDialog(this, "AÑADIDO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        
                        txtNuevoArtista.setText("");
                        txtNuevoDisco.setText("");
                        txtNuevoAnioPublicacion.setText("");
                       

                    } else {
                        JOptionPane.showMessageDialog(this, "NO DEBE HABER CAMPOS VACÍOS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "EL ID YA EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "EL CAMPO AÑO DEBE SER NUMÉRICO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }

        /*} else {
            JOptionPane.showMessageDialog(this, "EL ID NO PUEDE ESTAR VACÍO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }*/


    }//GEN-LAST:event_buttonAddConfirmActionPerformed

    
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaAdd().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNuevoAnioPublicacion;
    private javax.swing.JTextField txtNuevoArtista;
    private javax.swing.JTextField txtNuevoDisco;
    // End of variables declaration//GEN-END:variables
}
