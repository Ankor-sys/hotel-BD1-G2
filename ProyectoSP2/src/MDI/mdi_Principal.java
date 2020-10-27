/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kievk
 */
public class mdi_Principal extends javax.swing.JFrame {

    public static String BD = "jdbc:mysql://localhost/hotel";
    public static String Usuario = "root";
    public static String Contraseña = "compromete";

    public static Connection getConeccion() {
        Connection cn = null;
        try {
            Class.forName(BD);
            cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
        return cn;

    }
    public mdi_Principal() {
        initComponents();
                  setLocationRelativeTo(null);
        this.setExtendedState(mdi_Principal.MAXIMIZED_BOTH);
        this.setTitle("Hotel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuCotDetClientes = new javax.swing.JMenuItem();
        jMenuCotDetProv = new javax.swing.JMenuItem();
        jMenuCotEncProveedores = new javax.swing.JMenuItem();
        jMenuCotEncClientes = new javax.swing.JMenuItem();
        jMenuMarcas = new javax.swing.JMenuItem();
        jMenuLineas = new javax.swing.JMenuItem();
        jMenuParametros = new javax.swing.JMenuItem();
        jMenuTipoInven = new javax.swing.JMenuItem();
        jMenuInventarios = new javax.swing.JMenuItem();
        jMenuVehiculos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Mantenimientos");

        jMenuCotDetClientes.setText("Cotizacion Det. Clientes");
        jMenuCotDetClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCotDetClientesActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuCotDetClientes);

        jMenuCotDetProv.setText("Cotizacion Det. Proveedores");
        jMenuCotDetProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCotDetProvActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuCotDetProv);

        jMenuCotEncProveedores.setText("Contizacion Enc. Proveedores");
        jMenuCotEncProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCotEncProveedoresActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuCotEncProveedores);

        jMenuCotEncClientes.setText("Cotizacion Enc. Clientes");
        jMenuCotEncClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCotEncClientesActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuCotEncClientes);

        jMenuMarcas.setText("Mantenimiento Marcas");
        jMenuMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarcasActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuMarcas);

        jMenuLineas.setText("Mantenimiento Lineas");
        jMenuLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLineasActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuLineas);

        jMenuParametros.setText("Mantenimiento Parametros");
        jMenuParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuParametrosActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuParametros);

        jMenuTipoInven.setText("Mantenimiento Tipo De Inventarios");
        jMenuTipoInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTipoInvenActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuTipoInven);

        jMenuInventarios.setText("Mantenimiento Inventarios");
        jMenuInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInventariosActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuInventarios);

        jMenuVehiculos.setText("Mantenimiento Vehiculos");
        jMenuVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVehiculosActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuVehiculos);

        jMenuItem1.setText("Mantenimiento Tipo Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Mantenimiento Cliente");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Mantenimiento Tipo Precio");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Mantenimiento Lista Precios");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Mantenimiento Descuentos");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        exitMenuItem1.setMnemonic('x');
        exitMenuItem1.setText("Mantenimiento Servicios");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem1);

        jMenuItem2.setText("Mantenimiento Bodega");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        jMenuItem3.setText("Mantenimiento Impuesto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jMenuItem4.setText("Mantenimiento Vendedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem4);

        jMenuItem5.setText("Mantenimiento Piloto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem5);

        jMenuItem6.setText("Mantenimiento Cobrador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem6);

        jMenuItem7.setText("Mantenimiento Proveedor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem7);

        jMenuItem8.setText("Mantenimiento Caja");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem8);

        jMenuItem9.setText("Mantenimiento Prenda");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem9);

        jMenuItem10.setText("Mantenimiento Serie");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem10);

        jMenuItem11.setText("Mantenimiento Sucursal");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem11);

        jMenuItem12.setText("Mantenimiento Lavanderia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem12);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Exit");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
 inf_Mantenimiento_Descuento ventana1 = new inf_Mantenimiento_Descuento();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
       
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        inf_Mantenimiento_Tipo_Cliente ventana1 = new inf_Mantenimiento_Tipo_Cliente();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
 inf_Mantenimiento_Servicio ventana1 = new inf_Mantenimiento_Servicio();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
 inf_Mantenimiento_Cliente1 ventana1 = new inf_Mantenimiento_Cliente1();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
 inf_Mantenimiento_Tipo_Precio ventana1 = new inf_Mantenimiento_Tipo_Precio();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
 inf_Mantenimiento_Lista_Precio ventana1 = new inf_Mantenimiento_Lista_Precio();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_helpMenuMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        inf_Mantenimiento_Bodega ventana1 = new inf_Mantenimiento_Bodega();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Impuesto ventana1 = new inf_Mantenimiento_Impuesto();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Vendedor ventana1 = new inf_Mantenimiento_Vendedor();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Piloto ventana1 = new inf_Mantenimiento_Piloto();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Cobrador ventana1 = new inf_Mantenimiento_Cobrador();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Proveedor ventana1 = new inf_Mantenimiento_Proveedor();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Caja ventana1 = new inf_Mantenimiento_Caja();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Prenda ventana1 = new inf_Mantenimiento_Prenda();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Serie ventana1 = new inf_Mantenimiento_Serie();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Sucursal ventana1 = new inf_Mantenimiento_Sucursal();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        inf_Mantenimiento_Lavanderia ventana1 = new inf_Mantenimiento_Lavanderia();
        desktopPane.add(ventana1);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarcasActionPerformed
        Mantenimiento_Marca ventana = new Mantenimiento_Marca();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuMarcasActionPerformed

    private void jMenuLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLineasActionPerformed
        Matenimiento_Linea ventana = new Matenimiento_Linea();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuLineasActionPerformed

    private void jMenuParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuParametrosActionPerformed
        Mantenimiento_Parametros ventana = new Mantenimiento_Parametros();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuParametrosActionPerformed

    private void jMenuTipoInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTipoInvenActionPerformed
        Mantenimiento_TipoInvetario ventana = new Mantenimiento_TipoInvetario();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuTipoInvenActionPerformed

    private void jMenuInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInventariosActionPerformed
        Matenimiento_Inventario ventana = new Matenimiento_Inventario();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuInventariosActionPerformed

    private void jMenuVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVehiculosActionPerformed
        Mantenimiento_Vehiculo ventana = new Mantenimiento_Vehiculo();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuVehiculosActionPerformed

    private void jMenuCotEncClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCotEncClientesActionPerformed
        cot_enc_cliente ventana = new cot_enc_cliente();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuCotEncClientesActionPerformed

    private void jMenuCotDetClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCotDetClientesActionPerformed
        Cot_Det_Cliente ventana = new Cot_Det_Cliente();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuCotDetClientesActionPerformed

    private void jMenuCotEncProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCotEncProveedoresActionPerformed
        Cot_Enc_Proveedor ventana = new Cot_Enc_Proveedor();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuCotEncProveedoresActionPerformed

    private void jMenuCotDetProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCotDetProvActionPerformed
       Cot_Det_Proveedor ventana = new Cot_Det_Proveedor();
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_jMenuCotDetProvActionPerformed

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
            java.util.logging.Logger.getLogger(mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdi_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuCotDetClientes;
    private javax.swing.JMenuItem jMenuCotDetProv;
    private javax.swing.JMenuItem jMenuCotEncClientes;
    private javax.swing.JMenuItem jMenuCotEncProveedores;
    private javax.swing.JMenuItem jMenuInventarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuLineas;
    private javax.swing.JMenuItem jMenuMarcas;
    private javax.swing.JMenuItem jMenuParametros;
    private javax.swing.JMenuItem jMenuTipoInven;
    private javax.swing.JMenuItem jMenuVehiculos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
