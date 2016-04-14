
package Vista;

import Controlador.Controlador_FRM_Ventana;

public class GUI_Botones extends javax.swing.JPanel {
Controlador_FRM_Ventana controlador;
    public GUI_Botones() {
        initComponents();
        
    }
    public void agregarEventos(Controlador_FRM_Ventana controlador){
     this.controlador=controlador;
        this.jb_Agregar.addActionListener(controlador);
        this.jb_Buscar.addActionListener(controlador);
        this.jb_Eliminar.addActionListener(controlador);
        this.jb_Modificar.addActionListener(controlador);
    }
    //si no existe habilita agregar y buscar
    public void habilitarAgregar(){
        this.jb_Agregar.setEnabled(true);
        this.jb_Buscar.setEnabled(true);
        this.jb_Eliminar.setEnabled(false);
        this.jb_Modificar.setEnabled(false);   
    }
    
    public void inhabilitarAgregar(){
         this.jb_Agregar.setEnabled(false);
        this.jb_Buscar.setEnabled(true);
        this.jb_Eliminar.setEnabled(true);
        this.jb_Modificar.setEnabled(true); 
    }
        public void inicio(){
        this.jb_Agregar.setEnabled(false);
        this.jb_Buscar.setEnabled(true);
        this.jb_Eliminar.setEnabled(false);
        this.jb_Modificar.setEnabled(false); 
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Buscar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();

        jb_Buscar.setText("Buscar");

        jb_Agregar.setText("Agregar");

        jb_Modificar.setText("Modificar");

        jb_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jb_Buscar)
                .addGap(28, 28, 28)
                .addComponent(jb_Agregar)
                .addGap(18, 18, 18)
                .addComponent(jb_Modificar)
                .addGap(18, 18, 18)
                .addComponent(jb_Eliminar)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Agregar)
                    .addComponent(jb_Modificar)
                    .addComponent(jb_Eliminar))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    // End of variables declaration//GEN-END:variables
}
