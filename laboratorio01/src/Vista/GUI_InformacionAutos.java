
package Vista;

import Controlador.Controlador_FRM_Ventana;

public class GUI_InformacionAutos extends javax.swing.JPanel {
Controlador_FRM_Ventana controlador;
    public GUI_InformacionAutos() {
        initComponents();
    }

    public String numero(){
        return this.jt_Numero.getText();
    }
    
    public String[] devolverInformacion(){
        String arreglo[];
        arreglo=new String[4];
        arreglo[0]=this.jt_Numero.getText();
        arreglo[1]=this.jt_Nombre.getText();
        arreglo[2]=this.jt_Cedula.getText();
        arreglo[3]=this.jt_Placa.getText();
        return arreglo;
    }
    
    public void mostrarInformacion(String arreglo[]){
        this.jt_Numero.setText(arreglo[0]);
        this.jt_Nombre.setText(arreglo[1]);
        this.jt_Cedula.setText(arreglo[2]);
        this.jt_Placa.setText(arreglo[3]);  
        }
    
    public void limpiarInterfaz(){
        this.jt_Nombre.setText("");
        this.jt_Numero.setText("");
        this.jt_Cedula.setText("");
        this.jt_Placa.setText("");
    }
       
    public void inicio(){
        this.jt_Cedula.setEnabled(false);
        this.jt_Nombre.setEnabled(false);
        this.jt_Placa.setEnabled(false);
        this.jt_Numero.setEnabled(true);
    }
public void habilitarEncontro(){
      this.jt_Cedula.setEnabled(true);
        this.jt_Nombre.setEnabled(true);
        this.jt_Placa.setEnabled(true);
        this.jt_Numero.setEnabled(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        jl_Numero = new javax.swing.JLabel();
        jt_Numero = new javax.swing.JTextField();
        jl_Nombre = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jl_Cedula = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jl_Placa = new javax.swing.JLabel();
        jt_Placa = new javax.swing.JTextField();

        jl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Titulo.setText("Departamento de Transportes UCR");

        jl_Numero.setText("Número de Registro");

        jt_Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NumeroActionPerformed(evt);
            }
        });

        jl_Nombre.setText("Nombre del Dueño");

        jl_Cedula.setText("Cédula del Dueño");

        jl_Placa.setText("Placa del Automóvil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Numero)
                            .addComponent(jl_Nombre)
                            .addComponent(jl_Cedula)
                            .addComponent(jl_Placa))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Cedula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jl_Titulo)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jl_Titulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Numero)
                    .addComponent(jt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cedula)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Placa))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NumeroActionPerformed
       if(evt.getKeyCode()==10){
            this.controlador.consultar();
        }
    }//GEN-LAST:event_jt_NumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Numero;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Numero;
    private javax.swing.JTextField jt_Placa;
    // End of variables declaration//GEN-END:variables
}
