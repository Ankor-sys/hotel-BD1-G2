/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import static MDI.mdi_Principal.labelusuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEBAS
 */
public class inf_Transaccion_Compras extends javax.swing.JInternalFrame {

     
     DefaultTableModel model = new DefaultTableModel();
    String subtotal;
    
 public void tablas() {
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from compra_encabezado");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Compra");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Subtotal");
            
            tabla.setModel(modelo);
            String[] dato = new String[6];
            while (rss4.next()) {
                dato[0] = rss4.getString(1);
                dato[1] = rss4.getString(2);
                dato[2] = rss4.getString(3);
                dato[3] = rss4.getString(4);
                

                modelo.addRow(dato);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void iniciar_combo() {
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement psttt = cn.prepareStatement("select * from proveedor");
            ResultSet rss = psttt.executeQuery();

            cbox_proveedor.addItem("Seleccione una opción");
            while (rss.next()) {
                cbox_proveedor.addItem(rss.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tablas();
    }
        
 public void iniciar_combo2() {
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement psttt = cn.prepareStatement("select * from moneda");
            ResultSet rss = psttt.executeQuery();

            cbox_moneda.addItem("Seleccione una opción");
            while (rss.next()) {
                cbox_moneda.addItem(rss.getString("nombre_moneda"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tablas();
    }
 
  public void iniciar_combo3() {
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement psttt = cn.prepareStatement("select * from inventario");
            ResultSet rss = psttt.executeQuery();

            cbox_inventario.addItem("Seleccione una opción");
            while (rss.next()) {
                cbox_inventario.addItem(rss.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tablas();
    }

    public void iniciar_combo4() {
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement psttt = cn.prepareStatement("select * from sucursal");
            ResultSet rss = psttt.executeQuery();

            cbox_sucursal.addItem("Seleccione una opción");
            while (rss.next()) {
                cbox_sucursal.addItem(rss.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        tablas();
    }
    
    public void get_fecha(){
        //Obtenemos la fecha
        Calendar c1 = Calendar.getInstance();
                fecha.setCalendar(c1);
    }
    
    public void get_usuario(){
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from usuario_hoteleria where nombre_usuario = ?");
            pst.setString(1, labelusuario.getText().trim()); 

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lbusu.setText(rs.getString("id_usuario"));
                


        }
        }catch (Exception e) {

        
        }
    }
    
    public void bitacora_compra(){
        String prov=txt_IdCompra.getText();
        String descrip="Registró la compra "+prov;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    
    public void bitacora_detallec(){
        String prov=txt_IdCompra.getText();
        String descrip="Registró un articulo en la compra "+prov;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    
    public void bitacora_finalizar(){
        String prov=txt_IdCompra.getText();
        String descrip="Finalizó la compra "+prov;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

    /**
     * Creates new form inf_Transaccion_Compras
     */
    public inf_Transaccion_Compras() {

        initComponents();
        tablas();
        iniciar_combo();
        iniciar_combo2();
        iniciar_combo3();
        iniciar_combo4();
        get_usuario();
        get_fecha();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha = new com.toedter.calendar.JDateChooser();
        lbusu = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        btnFinCompra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btn_confirmar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbox_proveedor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_IdCompra = new javax.swing.JTextField();
        cbox_sucursal = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbox_moneda = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lbM = new javax.swing.JLabel();
        cbox_inventario = new javax.swing.JComboBox<>();
        lbI = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jLabel9.setText("PRECIO UNIDAD");

        btnAgregarProducto.setText("Agregar al Carrito");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnFinCompra.setText("Finalizar Compra");
        btnFinCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinCompraActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdCompra", "IdProducto", "Cantidad", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel5.setText("ID_INVENTARIO");

        btn_confirmar.setText("Confirmar");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        jLabel7.setText("CANTIDAD");

        jLabel6.setText("FECHA");

        jLabel2.setText("ID_SUCURSAL");

        jLabel3.setText("ID_PROVEEDOR");

        cbox_proveedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_proveedorActionPerformed(evt);
            }
        });

        jLabel1.setText("ID_COMPRA");

        txt_IdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdCompraActionPerformed(evt);
            }
        });

        cbox_sucursal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sucursalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_IdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_IdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbox_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbox_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyReleased(evt);
            }
        });

        jLabel8.setText("TOTAL");

        cbox_moneda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_monedaActionPerformed(evt);
            }
        });

        jLabel10.setText("MONEDA");

        cbox_inventario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_inventarioActionPerformed(evt);
            }
        });

        lbI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbIKeyReleased(evt);
            }
        });

        jLabel11.setText("SUBTOTAL");

        lbSucursal.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btn_confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbox_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbox_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbI, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btn_confirmar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnFinCompra)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lbM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnAgregarProducto))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:

        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            //Guardando en el detalle de la compra
            PreparedStatement pst1 = cn.prepareStatement("insert into compra_detalle values(?,?,?,?)");

            //
            pst1.setString(1, lbI.getText().trim());
            pst1.setString(2, txt_IdCompra.getText().trim());
            pst1.setString(3, lbM.getText().trim());
            pst1.setString(4, txt_cantidad.getText().trim());
            

            pst1.executeUpdate();

            //Llenando la tabla

            this.tabla.setModel(model);
            String titulo[] = {"Id_Compra", "Id_Producto", "Cantidad", "Precio"};
            model.setColumnIdentifiers(titulo);

            String registros[] = new String[4];

            registros[0] = lb.getText();
            registros[1] = lbI.getText();
            registros[2] = txt_cantidad.getText();
            registros[3] = txt_precio.getText();
            model.addRow(registros);

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            bitacora_detallec();
            
            lbI.setText("");
            txt_cantidad.setText("");
            txt_precio.setText("");
            txt_subtotal.setText("");
            cbox_moneda.setSelectedIndex(0);
            cbox_inventario.setSelectedIndex(0);
            sumaColumnaPrecio();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnFinCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinCompraActionPerformed
        // TODO add your handling code here:
        try{
            String id = txt_IdCompra.getText();
            //Guardando en el encabezado de la compra
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update compra_encabezado set id_compraE = ?, id_sucursal = ?, id_proveedor = ?, total = ? where id_compraE = " + id);

            pst.setString(1, txt_IdCompra.getText());
            pst.setString(2, lbSucursal.getText());
            pst.setString(3, lb.getText());
            pst.setString(4, txt_total.getText());
            //pst.setString(6, txt_fecha.getCalendar().toString());

            pst.executeUpdate();

            bitacora_finalizar();
            
            JOptionPane.showMessageDialog(this, "¡COMPRA FINALIZADA CON ÉXITO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            lb.setText("");
            lbI.setText("");
            txt_cantidad.setText("");
            txt_IdCompra.setText("");
            lbSucursal.setText("");
            //txt_idMoneda.setText("");
            txt_fecha.setCalendar(null);
            //txt_FechaVenta.setDate("");
            txt_total.setText("");
            txt_cantidad.setText("");
            txt_precio.setText("");

            txt_subtotal.setText("");
            cbox_moneda.setSelectedIndex(0);
            cbox_inventario.setSelectedIndex(0);
            model.setRowCount(0);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ya existe ése registro", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);}
    }//GEN-LAST:event_btnFinCompraActionPerformed

       public void sumaColumnaPrecio(){
        double total = 0;
        double fila =0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            fila = Double.parseDouble(tabla.getValueAt(i,3).toString());
            total += fila;
        }
    
        txt_total.setText(total + "");
    }
    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        // TODO add your handling code here:
        try{
            //Guardando en el encabezado de la compra
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("insert into compra_encabezado values(?,?,?,?,?)");

            int mes, dia, año;
            dia = txt_fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            mes = txt_fecha.getCalendar().get(Calendar.MONTH);
            año = txt_fecha.getCalendar().get(Calendar.YEAR);
            String fecha;
            fecha = año + "/"+mes+"/"+dia;

            pst.setString(1, txt_IdCompra.getText());
            pst.setString(2, lbSucursal.getText());
            pst.setString(3, lb.getText());
            pst.setString(4, null);
            pst.setString(5,fecha);

            pst.executeUpdate();
            
            bitacora_compra();

            JOptionPane.showMessageDialog(this, "¡PRIMER REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            panel1.setEnabled(false);
            btn_confirmar.setEnabled(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void txt_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyReleased
        // TODO add your handling code here:
        String id = lbI.getText();
        try{
                   
        Connection cn1 = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
        PreparedStatement  pst1 = cn1.prepareStatement("select precio from inventario where id_inventario = ?");
        pst1.setString(1, id);
        
        ResultSet rs = pst1.executeQuery();
            if (rs.next()) {
                subtotal= rs.getString("precio").trim();
                txt_precio.setText(rs.getString("precio").trim());
            }
            else{
                 JOptionPane.showMessageDialog(this, "No se encontro el prodcuto.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            
            double intPrecio=0, intCant, intSubtotal;
            intCant = Double.parseDouble(txt_cantidad.getText());
            intSubtotal = Double.parseDouble(txt_precio.getText());
            intPrecio = (intSubtotal * intCant);

            txt_subtotal.setText(intPrecio + "");
        }
        catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error en operacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_cantidadKeyReleased

    private void cbox_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_proveedorActionPerformed
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select id_proveedor from proveedor where proveedor.nombre=?");
            pst2.setString(1, cbox_proveedor.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lb.setText(rs2.getString("id_proveedor"));

            } else {
                if (cbox_proveedor.getSelectedItem().toString().contains("Seleccione una opción")) {
                    
                 
                    
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_proveedorActionPerformed

    private void txt_IdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdCompraActionPerformed

    private void cbox_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_monedaActionPerformed
        // TODO add your handling code here:
                try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select id_moneda from moneda where moneda.nombre_moneda=?");
            pst2.setString(1, cbox_moneda.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lbM.setText(rs2.getString("id_moneda"));

            } else {
                if (cbox_moneda.getSelectedItem().toString().contains("Seleccione una opción")) {
                    
                    
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbox_monedaActionPerformed

    private void cbox_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_inventarioActionPerformed
        // TODO add your handling code here:
       
                        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select id_inventario, precio from inventario where inventario.nombre=?");
            pst2.setString(1, cbox_inventario.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            
            if (rs2.next()) {
                lbI.setText(rs2.getString("id_inventario"));

            } else {
                if (cbox_inventario.getSelectedItem().toString().contains("Seleccione una opción")) {
                    
                    
                    
                }
            }

            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_cbox_inventarioActionPerformed

    private void lbIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbIKeyReleased
        // TODO add your handling code here:
        try{
        

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_lbIKeyReleased

    private void cbox_sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sucursalActionPerformed
        // TODO add your handling code here:
               
          try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select * from sucursal where sucursal.nombre=?");
            pst2.setString(1, cbox_sucursal.getSelectedItem().toString());
            ResultSet rss2 = pst2.executeQuery();

            
            if (rss2.next()) {
                lbSucursal.setText(rss2.getString("id_sucursal"));

            } else {
                if (cbox_sucursal.getSelectedItem().toString().contains("Seleccione una opción")) {
     
                }
            }

            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_cbox_sucursalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnFinCompra;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JComboBox<String> cbox_inventario;
    private javax.swing.JComboBox<String> cbox_moneda;
    private javax.swing.JComboBox<String> cbox_proveedor;
    private javax.swing.JComboBox<String> cbox_sucursal;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbI;
    private javax.swing.JLabel lbM;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JLabel lbusu;
    private java.awt.Panel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_IdCompra;
    private javax.swing.JTextField txt_cantidad;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
