
package Vista;

import Controlador.LoginControlador;
import Controlador.clienteControlador;
import Controlador.productoControlador;
import Controlador.proveedorControlador;
import Controlador.tiendaControlador;
import Controlador.usuarioControlador;
import Controlador.ventaControlador;
import Controlador.ventasGeneradasControlador;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Tienda;
import Modelo.Usuario;
import Modelo.Venta;
import ModeloDAO.ClienteDAO;
import ModeloDAO.LoginDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.ProveedorDAO;
import ModeloDAO.ServicioCantidad;
import ModeloDAO.TiendaDAO;
import ModeloDAO.UsuarioDAO;
import ModeloDAO.VentaDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Menu extends javax.swing.JFrame implements Runnable{
String hora,minutos,segundos;
Thread hilo;

    public Usuario u = new Usuario();   
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    public void hora(){
        Calendar calendario =new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    public void run(){
        Thread current=Thread.currentThread();
        
        while(current==hilo){
            hora();
            lblHora.setText(hora+":"+minutos+":"+segundos);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblCantUsuarios = new javax.swing.JLabel();
        lblCantClientes = new javax.swing.JLabel();
        lblCantProducto = new javax.swing.JLabel();
        lblCantVentas = new javax.swing.JLabel();
        lblCantProveedor = new javax.swing.JLabel();
        btn_Usuarios = new javax.swing.JButton();
        btn_NVenta = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_Proveedor = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
        btn_Ventas = new javax.swing.JButton();
        btn_Config = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblNombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCargoUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCerrarSesion = new javax.swing.JMenu();
        jMenuCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCantUsuarios.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        lblCantUsuarios.setText("20");
        lblCantUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCantUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCantUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 90, 30));

        lblCantClientes.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        lblCantClientes.setText("20");
        lblCantClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCantClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 70, 30));

        lblCantProducto.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        lblCantProducto.setText("20");
        lblCantProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCantProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCantProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 30));

        lblCantVentas.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        lblCantVentas.setText("20");
        lblCantVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCantVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCantVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 30));

        lblCantProveedor.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        lblCantProveedor.setText("20");
        lblCantProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCantProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCantProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 80, 30));

        btn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios.png"))); // NOI18N
        btn_Usuarios.setText("USUARIOS");
        btn_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Usuarios.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuariosActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 160, 86));

        btn_NVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        btn_NVenta.setText("NEW VENTA");
        btn_NVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_NVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_NVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 162, 86));

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        btn_Clientes.setText("CLIENTES");
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Clientes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClientesActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 160, 86));

        btn_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        btn_Proveedor.setText("PROVEEDOR");
        btn_Proveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Proveedor.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 90));

        btn_Productos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        btn_Productos.setText("PRODUCTOS");
        btn_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Productos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Productos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 86));

        btn_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        btn_Ventas.setText("VENTAS");
        btn_Ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ventas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Ventas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentasActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 86));

        btn_Config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        btn_Config.setText("CONFIG");
        btn_Config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Config.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Config.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Config, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 80));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 200, 50));

        lblNombreUsuario.setText("Edwar");
        jPanel3.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 85, -1));

        jLabel2.setText("Bienvenido:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        jLabel4.setText("Cargo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        lblCargoUsuario.setText("Administrador");
        jPanel3.add(lblCargoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 129, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));
        jPanel3.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 77, 32));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        jPanel3.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, 260));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE VENTAS MJ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1000, 550));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 1080, 10));

        menuCerrarSesion.setText("Cerrar Sesion");

        jMenuCerrarSesion.setText("Cerrar");
        jMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarSesionActionPerformed(evt);
            }
        });
        menuCerrarSesion.add(jMenuCerrarSesion);

        jMenuBar1.add(menuCerrarSesion);

        jMenu2.setText("Abaut");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NVentaActionPerformed
        vistaVender vista=new vistaVender();
        Venta modelo= new Venta();
        VentaDAO dao = new VentaDAO();
        ventaControlador control = new ventaControlador(vista, modelo, dao);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.u=u;
        vista.txtNombreEmpleado.setText(u.getNombre());
    }//GEN-LAST:event_btn_NVentaActionPerformed

    private void btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClientesActionPerformed
        Cliente cliente=new Cliente();
        ClienteDAO cdao=new ClienteDAO();
        vistaClientes vista=new Vista.vistaClientes();
        clienteControlador control=new clienteControlador(vista,cliente, cdao);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ClientesActionPerformed

    private void btn_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProveedorActionPerformed
        Proveedor proveedor = new Proveedor();
        ProveedorDAO dao = new ProveedorDAO();
        vistaProveedores vista = new vistaProveedores();
        proveedorControlador control= new proveedorControlador(proveedor, dao, vista,u.getCargo().getNombre());
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ProveedorActionPerformed

    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        vistaProductos vista=new vistaProductos();
        Producto modelo = new Producto();
        ProductoDAO dao = new  ProductoDAO();
        productoControlador control = new productoControlador(vista, modelo, dao);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentasActionPerformed
        vistaVentasReportes vista=new vistaVentasReportes();
        VentaDAO dao = new VentaDAO();
        Venta modelo = new Venta();
        ventasGeneradasControlador control = new ventasGeneradasControlador(vista, dao, modelo);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }//GEN-LAST:event_btn_VentasActionPerformed

    private void btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuariosActionPerformed
        vistaUsuarios vista=new vistaUsuarios();
        Usuario modelo= new Usuario();
        UsuarioDAO dao=new UsuarioDAO();
        usuarioControlador control=new usuarioControlador(vista, modelo, dao,u.getCargo().getNombre());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }//GEN-LAST:event_btn_UsuariosActionPerformed

    private void btn_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigActionPerformed
        vistaConfig vista=new vistaConfig();
        Tienda modelo=new Tienda();
        TiendaDAO dao=new TiendaDAO();
        tiendaControlador control= new tiendaControlador(vista, modelo, dao,u.getCargo().getNombre());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }//GEN-LAST:event_btn_ConfigActionPerformed

    private void jMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarSesionActionPerformed
        Login vista=new Login();
        Usuario u=new Usuario();
        LoginDAO dao=new LoginDAO();
        LoginControlador control=new LoginControlador(vista, u, dao);
        this.dispose();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuCerrarSesionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ServicioCantidad serv = new ServicioCantidad();
        int cantClientes = serv.getCantClientes();
        int cantProveedor = serv.getCantProveedores();
        int cantProductos = serv.getCantProductos();
        int cantUsuarios = serv.getCantUsuarios();
        int cantVentas = serv.getCantVentas();

       lblNombreUsuario.setText(u.getNombre().toUpperCase());
        lblCargoUsuario.setText(u.getCargo().getNombre());

        lblCantClientes.setText(String.valueOf(cantClientes));
        lblCantProveedor.setText(String.valueOf(cantProveedor));
        lblCantProducto.setText(String.valueOf(cantProductos));
        lblCantUsuarios.setText(String.valueOf(cantUsuarios));
        lblCantVentas.setText(String.valueOf(cantVentas));
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btn_Clientes;
    public javax.swing.JButton btn_Config;
    public javax.swing.JButton btn_NVenta;
    public javax.swing.JButton btn_Productos;
    public javax.swing.JButton btn_Proveedor;
    public javax.swing.JButton btn_Usuarios;
    public javax.swing.JButton btn_Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCerrarSesion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JLabel lblCantClientes;
    public javax.swing.JLabel lblCantProducto;
    public javax.swing.JLabel lblCantProveedor;
    public javax.swing.JLabel lblCantUsuarios;
    public javax.swing.JLabel lblCantVentas;
    public javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblHora;
    public javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel logo;
    public javax.swing.JMenu menuCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
