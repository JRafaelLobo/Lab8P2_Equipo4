package lab8p2_equipo4;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_agregar = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jf_modificar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jf_eliminar = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jf_cargar = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jf_ucreate = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_universocrearnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jframe_umod = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_universomodificarnombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcb_universoamodificar = new javax.swing.JComboBox<>();
        jf_udelete = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jcb_borraru = new javax.swing.JComboBox<>();
        jf_sermodificar = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcb_servivomodificaruniverso = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tf_servivomodificarraza = new javax.swing.JTextField();
        tf_servivomodificarcodigo = new javax.swing.JTextField();
        tf_servivomodificarnombre = new javax.swing.JTextField();
        js_serviviomodificarpoder = new javax.swing.JSpinner();
        jButton14 = new javax.swing.JButton();
        js_servivomodificaranios = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jcb_servivomodificarseres = new javax.swing.JComboBox<>();
        jf_eliminarser = new javax.swing.JFrame();
        jLabel19 = new javax.swing.JLabel();
        jb_servivoeliminar = new javax.swing.JButton();
        jcb_servivoeliminar = new javax.swing.JComboBox<>();
        jFrame1 = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jf_servivocrear = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcb_servivocrearuniverso = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tf_servivocrearraza = new javax.swing.JTextField();
        tf_servivocrearcodigo = new javax.swing.JTextField();
        tf_servivocrearnombre = new javax.swing.JTextField();
        js_serviviocrearpoder = new javax.swing.JSpinner();
        jButton13 = new javax.swing.JButton();
        js_servivocrearanios = new javax.swing.JSpinner();
        B_MainAgregar = new javax.swing.JButton();
        B_MainModificar = new javax.swing.JButton();
        B_MainEliminar = new javax.swing.JButton();
        B_MainGuardar = new javax.swing.JButton();

        jf_agregar.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton5.setText("Universo");
        jPanel1.add(jButton5);
        jButton5.setBounds(80, 90, 310, 23);

        jButton6.setText("Ser vivo");
        jPanel1.add(jButton6);
        jButton6.setBounds(80, 190, 310, 23);

        jf_agregar.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 614, 318);

        jf_modificar.getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jButton7.setText("Universo");
        jPanel2.add(jButton7);
        jButton7.setBounds(0, 0, 0, 0);

        jButton8.setText("Ser vivo");
        jPanel2.add(jButton8);
        jButton8.setBounds(0, 0, 0, 0);

        jf_modificar.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jf_eliminar.getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jButton9.setText("Universo");
        jPanel3.add(jButton9);
        jButton9.setBounds(0, 0, 0, 0);

        jButton10.setText("Ser vivo");
        jPanel3.add(jButton10);
        jButton10.setBounds(0, 0, 0, 0);

        jf_eliminar.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jf_cargar.getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        jButton11.setText("Universo");
        jPanel4.add(jButton11);
        jButton11.setBounds(0, 0, 0, 0);

        jButton12.setText("Ser vivo");
        jPanel4.add(jButton12);
        jButton12.setBounds(0, 0, 0, 0);

        jf_cargar.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        jf_ucreate.getContentPane().setLayout(null);

        jPanel5.setLayout(null);

        jLabel1.setText("Nombre:");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);
        jPanel5.add(tf_universocrearnombre);
        tf_universocrearnombre.setBounds(0, 0, 0, 0);

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(0, 0, 0, 0);

        jf_ucreate.getContentPane().add(jPanel5);
        jPanel5.setBounds(-32768, -32768, 100, 100);

        jframe_umod.getContentPane().setLayout(null);

        jPanel6.setLayout(null);

        jLabel2.setText("Nombre:");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);
        jPanel6.add(tf_universomodificarnombre);
        tf_universomodificarnombre.setBounds(0, 0, 0, 0);

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(0, 0, 0, 0);

        jLabel3.setText("Universos: ");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(-32674, -32714, 37, 16);

        jcb_universoamodificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jcb_universoamodificar);
        jcb_universoamodificar.setBounds(-32582, -32717, 72, 22);

        jframe_umod.getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 0, 0);

        jf_udelete.getContentPane().setLayout(null);

        jPanel7.setLayout(null);

        jLabel4.setText("Nombre:");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 0);

        jButton3.setText("Agregar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel7.add(jButton3);
        jButton3.setBounds(0, 0, 0, 0);

        jcb_borraru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jcb_borraru);
        jcb_borraru.setBounds(-32575, -32671, 72, 22);

        jf_udelete.getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 0, 0);

        jf_sermodificar.getContentPane().setLayout(null);

        jPanel10.setLayout(null);

        jLabel12.setText("Codigo:");
        jPanel10.add(jLabel12);
        jLabel12.setBounds(80, 80, 90, 16);

        jLabel13.setText("Nombre:");
        jPanel10.add(jLabel13);
        jLabel13.setBounds(80, 140, 80, 16);

        jLabel14.setText("Poder:");
        jPanel10.add(jLabel14);
        jLabel14.setBounds(80, 200, 34, 16);

        jLabel15.setText("Años:");
        jPanel10.add(jLabel15);
        jLabel15.setBounds(80, 270, 30, 16);

        jLabel16.setText("Universo:");
        jPanel10.add(jLabel16);
        jLabel16.setBounds(80, 330, 60, 16);

        jcb_servivomodificaruniverso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(jcb_servivomodificaruniverso);
        jcb_servivomodificaruniverso.setBounds(180, 320, 460, 22);

        jLabel17.setText("Raza:");
        jPanel10.add(jLabel17);
        jLabel17.setBounds(80, 390, 50, 16);
        jPanel10.add(tf_servivomodificarraza);
        tf_servivomodificarraza.setBounds(170, 380, 470, 22);
        jPanel10.add(tf_servivomodificarcodigo);
        tf_servivomodificarcodigo.setBounds(170, 80, 470, 22);
        jPanel10.add(tf_servivomodificarnombre);
        tf_servivomodificarnombre.setBounds(170, 140, 470, 22);

        js_serviviomodificarpoder.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel10.add(js_serviviomodificarpoder);
        js_serviviomodificarpoder.setBounds(170, 200, 460, 22);

        jButton14.setText("Agegar");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel10.add(jButton14);
        jButton14.setBounds(612, 513, 200, 40);

        js_servivomodificaranios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel10.add(js_servivomodificaranios);
        js_servivomodificaranios.setBounds(170, 260, 450, 22);

        jLabel18.setText("Ser vivo:");
        jPanel10.add(jLabel18);
        jLabel18.setBounds(80, 40, 60, 16);

        jcb_servivomodificarseres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(jcb_servivomodificarseres);
        jcb_servivomodificarseres.setBounds(170, 30, 470, 22);

        jf_sermodificar.getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 0, 0, 0);

        jf_eliminarser.getContentPane().setLayout(null);

        jLabel19.setText("Ser vivo:");
        jf_eliminarser.getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 50, 44, 16);

        jb_servivoeliminar.setText("Eliminar");
        jb_servivoeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_servivoeliminarMouseClicked(evt);
            }
        });
        jf_eliminarser.getContentPane().add(jb_servivoeliminar);
        jb_servivoeliminar.setBounds(550, 200, 73, 23);

        jcb_servivoeliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jf_eliminarser.getContentPane().add(jcb_servivoeliminar);
        jcb_servivoeliminar.setBounds(130, 50, 530, 22);

        jFrame1.getContentPane().setLayout(null);

        jPanel8.setLayout(null);

        jLabel5.setText("Universo:");
        jPanel8.add(jLabel5);
        jLabel5.setBounds(0, 0, 0, 0);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(jComboBox3);
        jComboBox3.setBounds(0, 0, 0, 0);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Poder", "Años", "Raza"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 0, 0);

        jButton4.setText("Listar");
        jPanel8.add(jButton4);
        jButton4.setBounds(0, 0, 0, 0);

        jFrame1.getContentPane().add(jPanel8);
        jPanel8.setBounds(-32768, -32768, 100, 100);

        jf_servivocrear.getContentPane().setLayout(null);

        jPanel9.setLayout(null);

        jLabel6.setText("Codigo:");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(80, 80, 90, 16);

        jLabel7.setText("Nombre:");
        jPanel9.add(jLabel7);
        jLabel7.setBounds(80, 140, 80, 16);

        jLabel8.setText("Poder:");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(80, 200, 34, 16);

        jLabel9.setText("Años:");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(80, 270, 30, 16);

        jLabel10.setText("Universo:");
        jPanel9.add(jLabel10);
        jLabel10.setBounds(80, 330, 60, 16);

        jcb_servivocrearuniverso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jcb_servivocrearuniverso);
        jcb_servivocrearuniverso.setBounds(180, 320, 460, 22);

        jLabel11.setText("Raza:");
        jPanel9.add(jLabel11);
        jLabel11.setBounds(80, 390, 50, 16);
        jPanel9.add(tf_servivocrearraza);
        tf_servivocrearraza.setBounds(170, 380, 470, 22);
        jPanel9.add(tf_servivocrearcodigo);
        tf_servivocrearcodigo.setBounds(170, 80, 470, 22);
        jPanel9.add(tf_servivocrearnombre);
        tf_servivocrearnombre.setBounds(170, 140, 470, 22);

        js_serviviocrearpoder.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel9.add(js_serviviocrearpoder);
        js_serviviocrearpoder.setBounds(170, 200, 460, 22);

        jButton13.setText("Agegar");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel9.add(jButton13);
        jButton13.setBounds(740, 530, 72, 23);

        js_servivocrearanios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel9.add(js_servivocrearanios);
        js_servivocrearanios.setBounds(170, 260, 450, 22);

        jf_servivocrear.getContentPane().add(jPanel9);
        jPanel9.setBounds(-32768, -32768, 100, 100);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        B_MainAgregar.setText("Agregar");
        B_MainAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_MainAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(B_MainAgregar);
        B_MainAgregar.setBounds(46, 204, 73, 23);

        B_MainModificar.setText("Modificar");
        getContentPane().add(B_MainModificar);
        B_MainModificar.setBounds(151, 204, 81, 23);

        B_MainEliminar.setText("Eliminar");
        getContentPane().add(B_MainEliminar);
        B_MainEliminar.setBounds(302, 204, 73, 23);

        B_MainGuardar.setText("Guardar");
        getContentPane().add(B_MainGuardar);
        B_MainGuardar.setBounds(425, 204, 72, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        boolean entra = true;
        String n;
        n = tf_universocrearnombre.getText();
        for (Universo u : au.getListaUniverso()) {
            if (u.getNombre().equals(n)) {
                entra = false;
            }
        }
        if (entra) {
            try {
                db.conectar();
                db.query.execute("INSERT INTO Universo"
                        + " VALUES ('" + n + "', '" + 0 + "')");
                db.commit();
                db.desconectar();
                Universo u = new Universo(n, 0);
                au.getListaUniverso().add(u);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            tf_universocrearnombre.setText("");
            jf_ucreate.setVisible(false);
        } else {
            JOptionPane.showConfirmDialog(jf_ucreate, "Nombre no disponible");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void B_MainAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_MainAgregarMouseClicked
        jf_agregar.pack();
        jf_agregar.setLocationRelativeTo(this);
        this.setVisible(false);
        jf_agregar.setVisible(true);
    }//GEN-LAST:event_B_MainAgregarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        boolean entra = true;
        String n;
        n = tf_universomodificarnombre.getText();
        for (Universo u : au.getListaUniverso()) {
            if (u.getNombre().equals(n)) {
                entra = false;
            }
        }
        if (entra) {
            db.conectar();
            try {
                db.query.execute("update Universo set Nombre='" + n + "' where Nombre=" + jcb_universoamodificar.getSelectedItem().toString());
                db.commit();
                for (Universo u : au.getListaUniverso()) {
                    if (u.getNombre().equals(jcb_universoamodificar.getSelectedItem().toString())) {
                        u.setNombre(n);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
        } else {
            JOptionPane.showConfirmDialog(jframe_umod, "Nombre no disponible");
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        ArrayList<Universo> remove = au.getListaUniverso();
        ArrayList add = new ArrayList();
        db.conectar();

        try {
            for (Universo u : remove) {
                if (u.getNombre().equals(jcb_borraru.getSelectedItem().toString())) {
                    add.add(u);
                }
            }
            au.setListaPersonas(add);
            db.query.execute("delete from alumnos where Nombre=" + jcb_borraru.getSelectedItem().toString());
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        boolean entra = true;
        String codigo = tf_servivocrearcodigo.getText();
        String nombre = tf_servivocrearnombre.getText();
        int poder = Integer.parseInt(js_serviviocrearpoder.getValue().toString());
        int anios = Integer.parseInt(js_servivocrearanios.getValue().toString());
        String uni = jcb_servivocrearuniverso.getSelectedItem().toString();
        String raza = tf_servivocrearraza.getText();
        if (au.getListaUniverso().size() == 0) {
            entra = false;
        }
        for (Universo u : au.getListaUniverso()) {
            for (Servivo s : u.getSeres()) {
                if (s.getCodigo().equals(codigo) || s.getNombre().equals(nombre)) {
                    entra = false;
                }
            }
        }
        db.conectar();

        /*
            private String codigo;
    private String nombre;
    private int poder;
    private int anios;
    private String universo;
    private String raza; 
         */
        if (entra) {
            try {
                db.query.execute("INSERT INTO Servivo"
                        + " VALUES ('" + codigo + "', '" + nombre + "', '" + poder + "', '" + anios + "', '" + uni + "', '" + raza + "')");
                db.commit();
                for (Universo u : au.getListaUniverso()) {
                    if (u.getNombre().equals(uni)) {
                        Servivo sv = new Servivo(codigo, nombre, poder, anios, uni, raza);
                        u.getSeres().add(sv);
                        int cant = u.getCantidad();
                        cant += 1;
                        u.setCantidad(cant);
                        db.conectar();
                        try {
                            db.query.execute("update Universo set Cantidad='" + cant + "' where cuenta=" + u.getNombre());
                            db.commit();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        db.desconectar();
                    }
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
        } else {
            JOptionPane.showConfirmDialog(jf_servivocrear, "ID o nombre no valido, o no hay universos ");

        }


    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
 boolean entra = true;
        String codigo = tf_servivomodificarcodigo.getText();
        String nombre = tf_servivomodificarnombre.getText();
        int poder = Integer.parseInt(js_serviviomodificarpoder.getValue().toString());
        int anios = Integer.parseInt(js_servivomodificaranios.getValue().toString());
        String uni = jcb_servivomodificarseres.getSelectedItem().toString();
        String raza = tf_servivomodificarraza.getText();
        if (au.getListaUniverso().size() == 0) {
            entra = false;
        }
        for (Universo u : au.getListaUniverso()) {
            for (Servivo s : u.getSeres()) {
                if (s.getCodigo().equals(codigo) || s.getNombre().equals(nombre)) {
                    entra = false;
                }
            }
        }
        db.conectar();

        /*
            private String codigo;
    private String nombre;
    private int poder;
    private int anios;
    private String universo;
    private String raza; 
         */
        if (entra) {
            db.conectar();
            try {
                db.query.execute("update alumnos set codigo="+codigo+", set Nombre="+nombre+", set Poder="+poder+",set Anios="+anios+",set Universo="+uni+", set Raza="+raza+ " where Nombre="+jcb_servivomodificarseres.getSelectedItem().toString());
                db.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            for (Universo u : au.getListaUniverso()) {
                for (Servivo s: u.getSeres()) {
                    if (s.getNombre().equals(jcb_servivomodificarseres.getSelectedItem().toString())) {
                        s.setNombre(nombre);
                        s.setCodigo(codigo);
                        s.setAnios(anios);
                        s.setPoder(poder);
                        s.setRaza(raza);
                        s.setUniverso(uni);
                    }
                }
                
            }
            db.desconectar();
            jf_modificar.setVisible(false);
        } else {
            JOptionPane.showConfirmDialog(jf_sermodificar, "ID o nombre no valido, o no hay universos ");

        }


                          

    }//GEN-LAST:event_jButton14MouseClicked

    private void jb_servivoeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_servivoeliminarMouseClicked
      String nombre = jcb_servivoeliminar.getSelectedItem().toString();
       ArrayList<Universo> remove = au.getListaUniverso();
        ArrayList<Universo> add = new ArrayList();
        db.conectar();

        try {
            for (Universo : remove) {
                
            }
            au.setListaPersonas(add);
            db.query.execute("delete from Servivo where Nombre=" + nombre);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_jb_servivoeliminarMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_MainAgregar;
    private javax.swing.JButton B_MainEliminar;
    private javax.swing.JButton B_MainGuardar;
    private javax.swing.JButton B_MainModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_servivoeliminar;
    private javax.swing.JComboBox<String> jcb_borraru;
    private javax.swing.JComboBox<String> jcb_servivocrearuniverso;
    private javax.swing.JComboBox<String> jcb_servivoeliminar;
    private javax.swing.JComboBox<String> jcb_servivomodificarseres;
    private javax.swing.JComboBox<String> jcb_servivomodificaruniverso;
    private javax.swing.JComboBox<String> jcb_universoamodificar;
    private javax.swing.JFrame jf_agregar;
    private javax.swing.JFrame jf_cargar;
    private javax.swing.JFrame jf_eliminar;
    private javax.swing.JFrame jf_eliminarser;
    private javax.swing.JFrame jf_modificar;
    private javax.swing.JFrame jf_sermodificar;
    private javax.swing.JFrame jf_servivocrear;
    private javax.swing.JFrame jf_ucreate;
    private javax.swing.JFrame jf_udelete;
    private javax.swing.JFrame jframe_umod;
    private javax.swing.JSpinner js_serviviocrearpoder;
    private javax.swing.JSpinner js_serviviomodificarpoder;
    private javax.swing.JSpinner js_servivocrearanios;
    private javax.swing.JSpinner js_servivomodificaranios;
    private javax.swing.JTextField tf_servivocrearcodigo;
    private javax.swing.JTextField tf_servivocrearnombre;
    private javax.swing.JTextField tf_servivocrearraza;
    private javax.swing.JTextField tf_servivomodificarcodigo;
    private javax.swing.JTextField tf_servivomodificarnombre;
    private javax.swing.JTextField tf_servivomodificarraza;
    private javax.swing.JTextField tf_universocrearnombre;
    private javax.swing.JTextField tf_universomodificarnombre;
    // End of variables declaration//GEN-END:variables

    Dba db = new Dba("./Tabladeuniverso");
    AdminUniverso au = new AdminUniverso("./universosdelprograma.cbm");
}
