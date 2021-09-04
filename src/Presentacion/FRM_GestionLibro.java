package Presentacion;

import Logico.ArchivoLibro;
import Datos.Libro;
import Datos.VectorLibros;
import Datos.VectorPrestamos;
import Logico.ArchivoPrestamos;
import Logico.Busquedas;
import Logico.Ordenamientos;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

public final class FRM_GestionLibro extends javax.swing.JFrame {

    TableRowSorter tr;

    public FRM_GestionLibro() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionando Libros");
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        etqCodigo = new javax.swing.JTextField();
        etqAutor = new javax.swing.JTextField();
        etqEditorial = new javax.swing.JTextField();
        etqTitulo = new javax.swing.JTextField();
        etqCantidad = new javax.swing.JTextField();
        etqAnio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etqValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodiBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 700));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Editorial", "Año", "Stock", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo:");

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Editorial:");

        jLabel5.setText("Año:");

        jLabel11.setText("Cantidad:");

        jLabel7.setText("Precio:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etqCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(29, 29, 29)
                            .addComponent(etqAnio))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etqCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(etqAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(etqEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etqCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etqAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etqEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(etqAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(etqCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Filtrar por codigo:");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtCodiBuscar)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodiBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biblioteca.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 51, 0)));
        Fondo.setPreferredSize(new java.awt.Dimension(1120, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      public void llenarTabla() {
        ArchivoLibro A = new ArchivoLibro();
        VectorLibros VL = A.CargarDatos();
        int numFilas = VL.getTAM_VECTOR();
        Libro[] VdeLibros = new Libro[numFilas];
        for (int i = 0; i < VL.getTAM_VECTOR(); i++) {
            VdeLibros[i] = VL.getL(i);
        }
        int k = 0;
        String Matriz[][] = new String[numFilas][8];
        for (int i = 0; i < numFilas; i++) {
            if (VdeLibros[i].getCodigo() != 0) {
                Matriz[k][0] = String.valueOf(VdeLibros[i].getCodigo());
                Matriz[k][1] = String.valueOf(VdeLibros[i].getTitulo());
                Matriz[k][2] = String.valueOf(VdeLibros[i].getAutor());
                Matriz[k][3] = String.valueOf(VdeLibros[i].getEditorial());
                Matriz[k][4] = String.valueOf(VdeLibros[i].getAnio());
                Matriz[k][5] = String.valueOf(VdeLibros[i].getStock());
                Matriz[k][6] = String.valueOf(VdeLibros[i].getValor());
                Matriz[k][7] = String.valueOf(VdeLibros[i].getCantidad());
                k++;
            }
        }
        for (int i = k + 1; i < numFilas; i++) {
            Matriz[i][0] = "";
            Matriz[i][1] = "";
            Matriz[i][2] = "";
            Matriz[i][3] = "";
            Matriz[i][4] = "";
            Matriz[i][5] = "";
            Matriz[i][6] = "";
            Matriz[i][7] = "";
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Codigo", "Titulo", "Autor", "Editorial", "Año", "Stock", "Precio", "Cantidad"
                }
        ));
    }


    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int selec = tabla.rowAtPoint(evt.getPoint());
        etqCodigo.setText(String.valueOf(tabla.getValueAt(selec, 0)));
        etqTitulo.setText(String.valueOf(tabla.getValueAt(selec, 1)));
        etqAutor.setText(String.valueOf(tabla.getValueAt(selec, 2)));
        etqEditorial.setText(String.valueOf(tabla.getValueAt(selec, 3)));
        etqAnio.setText(String.valueOf(tabla.getValueAt(selec, 4)));
        etqValor.setText(String.valueOf(tabla.getValueAt(selec, 6)));
        etqCantidad.setText(String.valueOf(tabla.getValueAt(selec, 7)));
    }//GEN-LAST:event_tablaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ArchivoLibro A = new ArchivoLibro();
        VectorLibros VL;
        VL = A.CargarDatos();
        ArchivoPrestamos AP = new ArchivoPrestamos();
        VectorPrestamos VP = AP.CargarDatos();
        Busquedas B = new Busquedas();
        Ordenamientos O = new Ordenamientos();
        O.SeleccionDirecta(VL.L);
        int codigo = 0, anio = 0, cantidad = 0, stock;
        double valor = 0;
        String titulo = etqTitulo.getText();
        String autor = etqAutor.getText();
        String editorial = etqEditorial.getText();
        try {
            codigo = Integer.parseInt(etqCodigo.getText());
            System.out.println("codigo:" + codigo);
            anio = Integer.parseInt(etqAnio.getText());
            cantidad = Integer.parseInt(etqCantidad.getText());
            valor = Double.parseDouble(etqValor.getText());
            int pos = B.B_Binaria_Iterativa(VL.L, codigo);
            System.out.println("el pos es:" + pos);
            if (pos != -1) {
                int resp = JOptionPane.showConfirmDialog(null, "Codigo ya existente...\n¿Desea modificarlo?", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    stock = VL.L[pos].getStock();
                    int cantidadAnterior = VL.L[pos].getCantidad();
                    VL.L[pos].setCodigo(codigo);
                    VL.L[pos].setTitulo(titulo);
                    VL.L[pos].setAutor(autor);
                    VL.L[pos].setEditorial(editorial);
                    VL.L[pos].setAnio(anio);
                    if (cantidadAnterior < cantidad) {
                        int librosIncorporados = cantidad - cantidadAnterior;
                        VL.L[pos].setStock((stock) + librosIncorporados);
                        VL.L[pos].setCantidad(cantidad);
                        JOptionPane.showMessageDialog(null, "Libro modificado...");
                    } else {
                        if (cantidadAnterior == cantidad) {
                            VL.L[pos].setStock(stock);
                            VL.L[pos].setCantidad(cantidad);
                            JOptionPane.showMessageDialog(null, "Libro modificado...");
                        }
                        if (cantidadAnterior > cantidad) {
                            JOptionPane.showMessageDialog(null, "PARA DISMINUIR EL NUMERO DE LIBROS DEBE DE REALIZAR UNA VENTA");
                        }
                    }
                    for (int i = 0; i < VP.getTAM_VECTOR_PREST(); i++) {
                        if (VP.P[i].getCodigoLibro() == codigo) {
                            VP.P[i].setLibro(titulo);
                        }
                    }
                    AP.GuardarDatos(VP);
                    A.GuardarDatos(VL);
                    FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
                    llenarTabla();
                }
            } else {
                pos = VL.getNumL();
                Libro libro = new Libro(codigo, titulo, autor, editorial, anio, cantidad, cantidad, valor);
                VL.setL(libro, pos);
                VL.setNumL(pos + 1);
                O.InsercionDirecta(VL.L);
                A.GuardarDatos(VL);
                llenarTabla();
                JOptionPane.showMessageDialog(null, "Libro añadido...");
                FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos invalidos...");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int codigo = 0, pos;
        ArchivoLibro A = new ArchivoLibro();
        Busquedas B = new Busquedas();
        VectorLibros VL = A.CargarDatos();
        Libro[] Temporal = new Libro[VL.getTAM_VECTOR()];
        Ordenamientos O = new Ordenamientos();
        try {
            codigo = Integer.parseInt(etqCodigo.getText());
            pos = B.B_Binaria_Recursiva(VL.L, codigo);
            if (pos != -1) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    for (int i = 0; i < VL.getTAM_VECTOR(); i++) {
                        Temporal[i] = VL.L[i];
                        if (i == pos) {
                            Temporal[i] = new Libro(0, "", "", "", 0, 0, 0, 0);
                        }
                    }
                    O.SeleccionDirecta(Temporal);
                    VL.L = Temporal;
                    A.GuardarDatos(VL);
                    FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
                    llenarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Codigo no existente...");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos invalidos...");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        FRM_SistemaBiblioteca.getOrg().Limpiesa(panel);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FRM_Administrador form1 = new FRM_Administrador();
        this.dispose();
        form1.toFront();
        form1.setVisible(true);
        form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        ArchivoLibro A = new ArchivoLibro();
        Busquedas B = new Busquedas();
        VectorLibros VL = A.CargarDatos();
        Libro[] L = new Libro[VL.getTAM_VECTOR()];
        System.arraycopy(VL.L, 0, L, 0, VL.getTAM_VECTOR());
        if (!txtCodiBuscar.getText().equals("")) {
            int cod = Integer.parseInt(txtCodiBuscar.getText());
            int posEncontrada = B.B_Secuancial_Desordenado(L, cod);
            System.out.println("codiencontradoes: " + posEncontrada);
            if (posEncontrada != -1) {
                JOptionPane.showMessageDialog(null, "Codigo Encontrado");
                etqCodigo.setText(String.valueOf(L[posEncontrada].getCodigo()));
                etqTitulo.setText(String.valueOf(L[posEncontrada].getTitulo()));
                etqAutor.setText(String.valueOf(L[posEncontrada].getAutor()));
                etqEditorial.setText(String.valueOf(L[posEncontrada].getEditorial()));
                etqAnio.setText(String.valueOf(L[posEncontrada].getAnio()));
                etqValor.setText(String.valueOf(L[posEncontrada].getValor()));
                etqCantidad.setText(String.valueOf(L[posEncontrada].getCantidad()));
            } else {
                JOptionPane.showMessageDialog(null, "Codigo no encontrado\n Reintente con otro codigo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO VALIDO; Ingrese un codigo");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnBuscar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField etqAnio;
    private javax.swing.JTextField etqAutor;
    private javax.swing.JTextField etqCantidad;
    private javax.swing.JTextField etqCodigo;
    private javax.swing.JTextField etqEditorial;
    private javax.swing.JTextField etqTitulo;
    public static javax.swing.JTextField etqValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    public javax.swing.JTextField txtCodiBuscar;
    // End of variables declaration//GEN-END:variables
}
