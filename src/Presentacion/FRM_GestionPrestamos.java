package Presentacion;

import Datos.ArchivoUsuarios;
import Datos.Prestamo;
import Datos.VectorPrestamos;
import Datos.VectorUsuarios;
import Logico.ArchivoPrestamos;
import Logico.Busquedas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class FRM_GestionPrestamos extends javax.swing.JFrame {

    FRM_Administrador form1 = new FRM_Administrador();

    public FRM_GestionPrestamos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionando Prestamos");
        LLenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        txtBuscarCodigo = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        PanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        txtFechaDevolución = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 700));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Libro", "Titulo", "Codigo Usuario", "Usuario", "Fecha Entrega", "Fecha Devoucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Buscar Por Codigo del Libro ");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BtnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        PanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código Libro :");

        txtCodigoLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoLibro.setEnabled(false);

        jLabel2.setText("Título del Libro :");

        txtTituloLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTituloLibro.setEnabled(false);

        jLabel9.setText("Código Usuario:");

        txtCodigoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoUsuario.setEnabled(false);

        jLabel3.setText("Usuario :");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuario.setEnabled(false);

        jLabel5.setText("Fecha Entrega :");

        jLabel6.setText("Fecha Devolución:");

        txtFechaEntrega.setEnabled(false);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaDevolución, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelDatosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtCodigoUsuario)))))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFechaEntrega))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaDevolución, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVolver, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
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
                .addGap(147, 147, 147)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int selec = tabla.rowAtPoint(evt.getPoint());
        txtCodigoLibro.setText(String.valueOf(tabla.getValueAt(selec, 0)));
        txtTituloLibro.setText(String.valueOf(tabla.getValueAt(selec, 1)));
        txtCodigoUsuario.setText(String.valueOf(tabla.getValueAt(selec, 2)));
        txtUsuario.setText(String.valueOf(tabla.getValueAt(selec, 3)));
        txtFechaEntrega.setText(String.valueOf(tabla.getValueAt(selec, 4)));
        txtFechaDevolución.setText(String.valueOf(tabla.getValueAt(selec, 5)));
    }//GEN-LAST:event_tablaMouseClicked

    public void LLenarTabla() {
        ArchivoPrestamos P = new ArchivoPrestamos();
        VectorPrestamos VP = P.CargarDatos();
        int numFilas = VP.getNumP();
        System.out.println("numFilasTabla :" + numFilas);
        int cont = 0;
        Prestamo[] VdePrestamos = new Prestamo[numFilas];
        for (int i = 0; i < VP.getTAM_VECTOR_PREST(); i++) {
            if (!(VP.P[i].getUsuario().equals(""))) {
                VdePrestamos[cont] = VP.P[i];
                cont++;
            }
        }
        String Matriz[][] = new String[numFilas][6];
        for (int i = 0; i < numFilas; i++) {
            Matriz[i][0] = String.valueOf(VdePrestamos[i].getCodigoLibro());
            Matriz[i][1] = String.valueOf(VdePrestamos[i].getLibro());
            Matriz[i][2] = String.valueOf(VdePrestamos[i].getCodigo());
            Matriz[i][3] = String.valueOf(VdePrestamos[i].getUsuario());
            Matriz[i][4] = String.valueOf(VdePrestamos[i].getFecha_prestamo());
            Matriz[i][5] = String.valueOf(VdePrestamos[i].getFecha_devolucion());

        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Codigo Libro", "Título", "Codigo Usuario", "Usuario", "Fecha Entrega", "Fecha Devolución"
                }
        ));
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        form1.toFront();
        form1.setVisible(true);
        form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        ArchivoPrestamos archivo_prestamo = new ArchivoPrestamos();
        VectorPrestamos VP = archivo_prestamo.CargarDatos();
        System.out.println("**** Vecttor de prestamos****");
        if (!txtBuscarCodigo.getText().equals("")) {
            int cod = Integer.parseInt(txtBuscarCodigo.getText());
            int pos = VP.busqueda_secuencial_PorCodigoLibro(cod);
            if (pos != -1) {
                LLenarTablaParaFiltrado(cod);
                txtBuscarCodigo.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Codigo no encontrado\n Reintente con otro codigo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO VALIDO; Ingrese un codigo");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    public void LLenarTablaParaFiltrado(int codigoLibro) {
        VectorPrestamos VP = new VectorPrestamos();
        ArchivoPrestamos A = new ArchivoPrestamos();
        VP = A.CargarDatos();
        int contadorR = 0;
        // Esto me ayuda a saber cuantos prestamos con ese libro se hicieron
        // Asi puedo saber el tamaño de mi nueva tabla que voy a mostrar
        for (int i = 0; i < VP.getTAM_VECTOR_PREST(); i++) {
            if (VP.P[i].getCodigoLibro() == codigoLibro) {
                contadorR++;
            }
        }
        System.out.println("contdorR::: " + contadorR);
        // Ese vector tendra solo los que tienen el mismo codigo que estamos buscando
        Prestamo[] Presta = new Prestamo[contadorR];
        int k = 0;
        for (int i = 0; i < VP.getTAM_VECTOR_PREST(); i++) {
            if (VP.P[i].getCodigoLibro() == codigoLibro) {
                Presta[k] = VP.getP(i);
                k++;
            }
        }
        // Cambiando la Tabla
        String Matriz[][] = new String[contadorR][6];
        for (int i = 0; i < contadorR; i++) {
            Matriz[i][0] = String.valueOf(Presta[i].getCodigoLibro());
            Matriz[i][1] = String.valueOf(Presta[i].getLibro());
            Matriz[i][2] = String.valueOf(Presta[i].getCodigo());
            Matriz[i][3] = String.valueOf(Presta[i].getUsuario());
            Matriz[i][4] = String.valueOf(Presta[i].getFecha_prestamo());
            Matriz[i][5] = String.valueOf(Presta[i].getFecha_devolucion());

        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Codigo Libro", "Título", "Codigo Usuario", "Usuario", "Fecha Entrega", "Fecha Devolución"
                }
        ));

    }


    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        FRM_SistemaBiblioteca.getOrg().Limpiesa(PanelDatos);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
         ArchivoPrestamos A = new ArchivoPrestamos();
        VectorPrestamos VP = A.CargarDatos();
        Busquedas B = new Busquedas();
        String cod = txtCodigoLibro.getText();
        String fDevolucion = txtFechaDevolución.getText();
        ArchivoUsuarios AU= new ArchivoUsuarios();
        VectorUsuarios VU=AU.CargarDatos();
        
        
        if (!fDevolucion.equals("")) {
            int codigo = Integer.parseInt(cod);
            int pos = VP.busqueda_secuencial_PorCodigoLibro(codigo);
            if (pos != -1) {
                int resp = JOptionPane.showConfirmDialog(null, "Codigo ya existente...\n¿Desea modificarlo?", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) 
                {
                    
                    int posEnUsuario= VU.Buscar(txtCodigoUsuario.getText());
                    System.out.println("pos para Usario:---- "+posEnUsuario);
                    System.out.println("ES: "+ VU.U[posEnUsuario].getNombre());
                    System.out.println("La nueva feca es:."+fDevolucion);
                    for (int i = 0; i <4; i++) 
                    { if(VU.U[posEnUsuario].L[i].getCodigo()== codigo)
                       {
                          VU.U[posEnUsuario].L[i].setFecha_devolucion(fDevolucion);
                       
                       }
                    }
                    VP.setfechadevolucionPrest(fDevolucion, pos);
                    JOptionPane.showMessageDialog(null, "Fecha de Devolucion Modificada...");
                    A.GuardarDatos(VP);
                    AU.GuardarDatos(VU);
                    
                    FRM_SistemaBiblioteca.getOrg().Limpiesa(PanelDatos);
                    LLenarTabla();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA NUEVA FECHA DE DEVOLUCION \n PARA REALIZAR LOS CAMBIOS");
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JButton btnVolver;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla;
    public static javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtFechaDevolución;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtTituloLibro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
