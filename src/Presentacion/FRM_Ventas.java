package Presentacion;

import Datos.Libro;
import Datos.VectorLibros;
import Logico.ArchivoLibro;
import Logico.ArregloCantidad;
import Logico.Busquedas;
import Logico.Cambio;
import Logico.GestorArreglo;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FRM_Ventas extends javax.swing.JFrame {

    FRM_Administrador form1 = new FRM_Administrador();

    public FRM_Ventas() {
        initComponents();
        this.setTitle("Gestion de Ventas");
    }

    Cambio C = new Cambio();
    GestorArreglo DatosArchivo = new GestorArreglo();
    public int s[] = {0, 0, 0, 0, 0, 0, 0, 0};
    private double v[] = {100, 50, 20, 10, 5, 2, 1, 0.5};
    private int NumMonedas[] = new int[12];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDineroRecibido = new javax.swing.JTextField();
        txtMontoCobrar = new javax.swing.JTextField();
        BtnDarCambio = new javax.swing.JButton();
        txtVuelto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnDarCambio1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BtnAdministrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dinero Recibido ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Monto a Cobrar");

        txtMontoCobrar.setEnabled(false);
        txtMontoCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoCobrarActionPerformed(evt);
            }
        });

        BtnDarCambio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnDarCambio.setText("Dar Cambio");
        BtnDarCambio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDarCambioActionPerformed(evt);
            }
        });

        txtVuelto.setBackground(new java.awt.Color(255, 255, 102));
        txtVuelto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Vuelto");

        BtnDarCambio1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnDarCambio1.setText("Confirmar");
        BtnDarCambio1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDarCambio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDarCambio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDineroRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMontoCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BtnDarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDarCambio1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDineroRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDarCambio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 290, 220));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Codigo");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecio.setText("Precio");

        txtPrecio.setEnabled(false);

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Titulo");

        txtTitulo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(lblPrecio)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 300, 160));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("GESTION DE VENTAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 410, 50));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        BtnAdministrar.setBackground(new java.awt.Color(255, 255, 102));
        BtnAdministrar.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnAdministrar.setText("ADMINISTRAR");
        BtnAdministrar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        BtnAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 120, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biblioteca.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 51, 0)));
        Fondo.setPreferredSize(new java.awt.Dimension(1120, 700));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 1120, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CargarVectorCantidad() {
        ArregloCantidad A = new ArregloCantidad();
        A = DatosArchivo.CargarDatos();
        for (int i = 0; i < 8; i++) {
            NumMonedas[i] = A.getElemento(i);
        }
    }

    public void MostrarVectorMonedas() {
        System.out.println("Cantidad de Monedas");
        for (int i = 0; i < 12; i++) {
            System.out.println("V[" + i + "]: " + NumMonedas[i]);
        }
        System.out.println("========================");
    }

    private void BtnDarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDarCambioActionPerformed
        try {
            double moneda = Double.parseDouble(txtDineroRecibido.getText());
            double cobrar = Double.parseDouble(txtMontoCobrar.getText());
            System.out.println("Cobrar :" + cobrar);
            double vuelto = moneda - cobrar;
            vuelto = Math.rint(vuelto * 100) / 100;
            System.out.println("vuelto:" + vuelto);
            String pp = String.valueOf(vuelto);
            txtVuelto.setText(pp);
            CargarVectorCantidad();
            if (vuelto >= 0) {
                if (vuelto == 0) {
                    JOptionPane.showMessageDialog(null, "No Hay Vuelto, Cantidad Exacta");
                } else {
                    C.Voraz(s, v, NumMonedas, vuelto);
                    if (C.Solucion(s, v, vuelto)) {
                        String cadena = "Dar Cambio de: \n";
                        for (int i = 0; i < s.length; i++) {
                            if (s[i] > 0) {
                                if (i > 3) {
                                    cadena = cadena + s[i] + " Moneda(s) de " + v[i] + " soles\n";
                                    System.out.printf("%d Moneda(s) de %.2f soles\n", s[i], v[i]);
                                } else {
                                    cadena = cadena + s[i] + " Billete(s) de " + v[i] + " soles\n";
                                    System.out.printf("%d Billete(s) de %.2f soles\n", s[i], v[i]);
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null, cadena);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay solucion\n Revisar Caja");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El monto a Cobrar es mayor que el Dinero Recibido\n Ingrese Mas Dinero ");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Complete bien las Casillas");
        }
        MostrarVectorMonedas();
    }//GEN-LAST:event_BtnDarCambioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        ArchivoLibro AL = new ArchivoLibro();
        Busquedas B = new Busquedas();
        VectorLibros VL = new VectorLibros();
        VL = AL.CargarDatos();
        int posEncontrada = B.B_Secuancial_Desordenado(VL.L, codigo);
        System.out.println("codiencontradoes: " + posEncontrada);
        if (posEncontrada != -1) {
            Libro libro = new Libro();
            libro = VL.L[posEncontrada];
            if (libro.getStock() != 0) {
                txtTitulo.setText(libro.getTitulo());
                txtPrecio.setText(Double.toString(libro.getValor()));
                txtMontoCobrar.setText(Double.toString(libro.getValor()));
                jPanel1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "El libro no se encuentra disponible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el codigo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministrarActionPerformed
        logincambiodemoneda ventanaLogin = new logincambiodemoneda();
        ventanaLogin.setLocationRelativeTo(null);
        ventanaLogin.setVisible(true);
        ventanaLogin.setTitle("Administrador");
        setVisible(false);
    }//GEN-LAST:event_BtnAdministrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        form1.toFront();
        form1.setVisible(true);
        form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMontoCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoCobrarActionPerformed

    private void BtnDarCambio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDarCambio1ActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        ArchivoLibro AL = new ArchivoLibro();
        Busquedas B = new Busquedas();
        VectorLibros VL = new VectorLibros();
        VL = AL.CargarDatos();
        int posEncontrada = B.B_Secuancial_Desordenado(VL.L, codigo);
        Libro libro = new Libro();
        libro = VL.L[posEncontrada];
        libro.setCantidad(libro.getCantidad() - 1);
        libro.setStock(libro.getStock() - 1);
        VL.L[posEncontrada] = libro;
        AL.GuardarDatos(VL);
        JOptionPane.showMessageDialog(null, "Se genero con exito su compra");
        FRM_SistemaBiblioteca.getOrg().Limpiesa(jPanel1);
        FRM_SistemaBiblioteca.getOrg().Limpiesa(jPanel2);
    }//GEN-LAST:event_BtnDarCambio1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnAdministrar;
    public static javax.swing.JButton BtnDarCambio;
    public static javax.swing.JButton BtnDarCambio1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtDineroRecibido;
    public static javax.swing.JTextField txtMontoCobrar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    public static javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
}
