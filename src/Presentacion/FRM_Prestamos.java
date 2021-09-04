package Presentacion;

import Datos.ArchivoUsuarios;
import Datos.Libro;
import Datos.Prestamo;
import Datos.VectorLibros;
import Datos.VectorPrestamos;
import Datos.VectorUsuarios;
import Logico.ArchivoLibro;
import Logico.ArchivoPrestamos;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FRM_Prestamos extends javax.swing.JFrame {

    FRM_Administrador form_administrador = new FRM_Administrador();
    ArchivoUsuarios archivo_usuarios = new ArchivoUsuarios();
    ArchivoLibro archivo_libro = new ArchivoLibro();
    ArchivoPrestamos archivo_prestamo = new ArchivoPrestamos();
    VectorLibros libros = new VectorLibros();
    VectorUsuarios usuarios = new VectorUsuarios();
    VectorPrestamos prestamos = new VectorPrestamos();
    int posicion_libro;
    int posicion_usuario;

    public FRM_Prestamos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo_libro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnPrestamo = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFentrega = new javax.swing.JTextField();
        txtFdevolucion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Prestamo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo de usuario");

        txt_codigo_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_usuarioActionPerformed(evt);
            }
        });
        txt_codigo_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigo_usuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigo_usuarioKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo del Libro");

        txt_codigo_libro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigo_libro.setEnabled(false);
        txt_codigo_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_libroActionPerformed(evt);
            }
        });
        txt_codigo_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigo_libroKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Datos del Libro");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        BtnPrestamo.setText("Generar Prestamo");
        BtnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrestamoActionPerformed(evt);
            }
        });

        BtnSalir.setText("Cancelar");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Entrega: ");

        jLabel6.setText("Fecha Devolución:");

        jLabel7.setText("-------------------------------------------------------------------------------------");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_codigo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_codigo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtFdevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtFentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_codigo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_codigo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(txtFentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFdevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biblioteca.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 51, 0)));
        Fondo.setPreferredSize(new java.awt.Dimension(1120, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_usuarioActionPerformed

    private void txt_codigo_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txt_codigo_usuario.getText();
            if (codigo.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "ERROR: INGRESE UN CODIGO DE USUARIO");
            } else {
                usuarios = archivo_usuarios.CargarDatos();
                posicion_usuario = usuarios.busqueda_secuencial(codigo);
                if (posicion_usuario != -1) {
                    JOptionPane.showMessageDialog(null, "USUARIO VALIDO");
                    txt_codigo_libro.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR: Usuario Incorrecto");
                }
            }
        }
    }//GEN-LAST:event_txt_codigo_usuarioKeyPressed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
        form_administrador.toFront();
        form_administrador.setVisible(true);
        form_administrador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void txt_codigo_libroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_libroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextArea1.setEnabled(true);
            jTextArea1.setText("");
            String codigo_libro = txt_codigo_libro.getText();
            if (codigo_libro.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "ERROR: INGRESE UN CODIGO DE LIBRO");
            } else {
                libros = archivo_libro.CargarDatos();
                posicion_libro = libros.busqueda_secuencial(Integer.parseInt(codigo_libro));
                System.out.println("*************Posicion: " + posicion_libro);
                if (posicion_libro != -1) {
                    jTextArea1.append("Titulo: " + libros.L[posicion_libro].getTitulo());
                    jTextArea1.append("\n");
                    jTextArea1.append("Autor: " + libros.L[posicion_libro].getAutor());
                    jTextArea1.append("\n");
                    jTextArea1.append("Editorial: " + libros.L[posicion_libro].getEditorial());
                    jTextArea1.append("\n");
                    jTextArea1.append("Stock: " + Integer.toString(libros.L[posicion_libro].getStock()));
                    jTextArea1.append("\n");
                    jTextArea1.append("Año: " + Integer.toString(libros.L[posicion_libro].getAnio()));
                    jTextArea1.append("\n");

                    jTextArea1.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "LIBRO NO ENCONTRADO");
                }
            }
        }
    }//GEN-LAST:event_txt_codigo_libroKeyPressed


    private void BtnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrestamoActionPerformed
        System.out.println("%%%%%%% poslib" + posicion_libro);
        if (!txtFentrega.getText().equals("") && !txtFdevolucion.getText().equals("")) {
            String codigo = usuarios.getCodigoDelUsuario(posicion_usuario);
            String usuario = usuarios.getNombreDelUsuario(posicion_usuario);
            String Ttulolibro = libros.getTituloDelLibro(posicion_libro);
            int cod_l = libros.getCodigoDelLibro(posicion_libro);
            String fecha_prestamo = txtFentrega.getText();
            String fecha_devolucion = txtFdevolucion.getText();
            Prestamo prestamo = new Prestamo(cod_l, Ttulolibro, codigo, usuario, fecha_prestamo, fecha_devolucion);
            Libro lib = libros.getL(posicion_libro);
            lib.setFecha_entrega(fecha_prestamo);
            lib.setFecha_devolucion(fecha_devolucion);
            System.out.println("LA Pos el usuario que estas trabajando: " + posicion_usuario);
            if (usuarios.U[posicion_usuario].agregarlibroprestado(lib)) {
                archivo_usuarios.GuardarDatos(usuarios);
                prestamos = archivo_prestamo.CargarDatos();
                prestamos.insertarPrestamo(prestamo);
                archivo_prestamo.GuardarDatos(prestamos);
                JOptionPane.showMessageDialog(null, "Prestamo generado correctamente");
                libros.L[posicion_libro].setStock((libros.L[posicion_libro].getStock()) - 1);
                archivo_libro.GuardarDatos(libros);
                FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
                jTextArea1.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS ESPACIOS DE FECHA DE ENTREGA Y DEVOLUCIÓN");
        }
    }//GEN-LAST:event_BtnPrestamoActionPerformed

    private void txt_codigo_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_usuarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_usuarioKeyReleased

    private void txt_codigo_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_libroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPrestamo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtFdevolucion;
    private javax.swing.JTextField txtFentrega;
    private javax.swing.JTextField txt_codigo_libro;
    private javax.swing.JTextField txt_codigo_usuario;
    // End of variables declaration//GEN-END:variables
}
