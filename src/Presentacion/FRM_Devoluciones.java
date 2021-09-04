package Presentacion;

import Datos.ArchivoUsuarios;
import Datos.Libro;
import Datos.VectorLibros;
import Datos.VectorPrestamos;
import Datos.VectorUsuarios;
import Logico.ArchivoLibro;
import Logico.ArchivoPrestamos;
import Logico.Busquedas;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FRM_Devoluciones extends javax.swing.JFrame {

    FRM_Administrador form_administrador = new FRM_Administrador();
    ArchivoUsuarios archivo_usuarios = new ArchivoUsuarios();
    ArchivoPrestamos archivo_prestamo = new ArchivoPrestamos();
    ArchivoLibro archivo_libro = new ArchivoLibro();
    VectorPrestamos prestamos = new VectorPrestamos();
    VectorUsuarios usuarios = new VectorUsuarios();
    VectorLibros libros = new VectorLibros();
    int posicion_usuario;
    int posicion_libro;
    String codigo;
    String titulo = "";
    Libro lib = new Libro();

    public FRM_Devoluciones() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_cod_usuario = new javax.swing.JLabel();
        txt_cod_usuario = new javax.swing.JTextField();
        label_cod_libro = new javax.swing.JLabel();
        txt_cod_libro = new javax.swing.JTextField();
        label_titulo_libro = new javax.swing.JLabel();
        txt_titulo_libro = new javax.swing.JTextField();
        BtnDevolver = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("--------------------------------------------------------------------------");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Devoluciones");

        label_cod_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cod_usuario.setText("Codigo de Usuario");

        txt_cod_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cod_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod_usuarioKeyPressed(evt);
            }
        });

        label_cod_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cod_libro.setText("Codigo de libro a devolver");

        txt_cod_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cod_libro.setEnabled(false);
        txt_cod_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_libroActionPerformed(evt);
            }
        });
        txt_cod_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod_libroKeyPressed(evt);
            }
        });

        label_titulo_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_titulo_libro.setText("Libro");

        txt_titulo_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_titulo_libro.setEnabled(false);

        BtnDevolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnDevolver.setText("Devolver");
        BtnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevolverActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel2.setText("--------------------------------------------------------------------------");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_titulo_libro)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_cod_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cod_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label_cod_usuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_cod_usuario)))
                            .addComponent(jLabel2)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cod_usuario)
                    .addComponent(txt_cod_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cod_libro)
                    .addComponent(txt_cod_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titulo_libro)
                    .addComponent(txt_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biblioteca.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 51, 0)));
        Fondo.setPreferredSize(new java.awt.Dimension(1120, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cod_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            codigo = txt_cod_usuario.getText();
            if (codigo.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "ERROR: INGRESE UN CODIGO DE USUARIO");
            } else {
                usuarios = archivo_usuarios.CargarDatos();
                posicion_usuario = usuarios.busqueda_secuencial(codigo);
                if (posicion_usuario != -1) {
                    JOptionPane.showMessageDialog(null, "USUARIO ENCONTRADO");
                    txt_cod_libro.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR: Usuario Incorrecto");
                }
            }
        }
    }//GEN-LAST:event_txt_cod_usuarioKeyPressed

    private void txt_cod_libroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_libroKeyPressed
        Busquedas B = new Busquedas();
        ArchivoLibro A = new ArchivoLibro();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_titulo_libro.setText("");
            int codigo_libro = Integer.parseInt(txt_cod_libro.getText());
            libros = A.CargarDatos();
            libros = archivo_libro.CargarDatos();
            posicion_libro = libros.busqueda_secuencial(Integer.parseInt(txt_cod_libro.getText()));
            if (txt_cod_libro.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "ERROR: INGRESE UN CODIGO");
            } else {
                if (B.B_Secuancial_Desordenado(libros.L, codigo_libro) == -1) {
                    JOptionPane.showMessageDialog(null, "El Codigo no es de un Libro de la Biblioteca");
                    txt_cod_libro.setText("");
                } else {  //Quiere decir que el codiogo si es de un libro
                    usuarios = archivo_usuarios.CargarDatos();
                    System.out.println("Mensaje");
                    for (int i = 0; i < 4; i++) {
                        if (usuarios.U[posicion_usuario].L[i].getCodigo() == codigo_libro) {
                            titulo = usuarios.U[posicion_usuario].L[i].getTitulo();
                        }
                    }
                    if (titulo.equals("")) {
                        JOptionPane.showMessageDialog(null, "EL codio es de un libro,pero de uno NO AQUIRIDO por el usuario");
                    } else {
                        JOptionPane.showMessageDialog(null, "Libro encontrado...");
                        txt_titulo_libro.setText(titulo);
                    }
                }
            }
        }
    }//GEN-LAST:event_txt_cod_libroKeyPressed

    private void BtnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevolverActionPerformed
         try{
           if (usuarios.U[posicion_usuario].devolverlibroprestado(txt_cod_libro.getText())) {
            archivo_usuarios.GuardarDatos(usuarios);
            prestamos = archivo_prestamo.CargarDatos();
            prestamos.eliminar_prestamo(codigo, titulo);
            JOptionPane.showMessageDialog(null, "Devolucion realizada correctamente");
            libros.L[posicion_libro].setStock((libros.L[posicion_libro].getStock()) + 1);
            archivo_libro.GuardarDatos(libros);
            archivo_prestamo.GuardarDatos(prestamos);
            FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
           }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,"POR FAVOR COMPLETE LOS DATOS");}
    }//GEN-LAST:event_BtnDevolverActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        form_administrador.toFront();
        form_administrador.setVisible(true);
        form_administrador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_cod_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_libroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDevolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_cod_libro;
    private javax.swing.JLabel label_cod_usuario;
    private javax.swing.JLabel label_titulo_libro;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_cod_libro;
    private javax.swing.JTextField txt_cod_usuario;
    private javax.swing.JTextField txt_titulo_libro;
    // End of variables declaration//GEN-END:variables
}
