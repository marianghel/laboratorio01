
package Vista;

import Controlador.Controlador_FRM_Ventana;
import javax.swing.JOptionPane;

public class FRM_Ventana extends javax.swing.JFrame {
 public Controlador_FRM_Ventana controlador;
    public FRM_Ventana() {
        initComponents();
       controlador= new Controlador_FRM_Ventana(this);
       this.gUI_Botones2.agregarEventos(controlador);
    }

    public String devolverNumero(){
        return this.gUI_InformacionAutos1.numero();
    }
    
    public void mostrarInformacion(String arreglo[]){
       this.gUI_InformacionAutos1.mostrarInformacion(arreglo);
       }
    public void mensaje(String mensaje){
         JOptionPane.showMessageDialog(null,mensaje);
    }
    public String[] devolverInformacion(){
     return   this.gUI_InformacionAutos1.devolverInformacion();
    }
    
    public void limpiarPantalla(){
        this.gUI_InformacionAutos1.limpiarInterfaz();
    }
  public void Existe(){
      this.gUI_InformacionAutos1.habilitarEncontro();
      this.gUI_Botones2.inhabilitarAgregar();
  }
  public void Inexistente(){
      this.gUI_InformacionAutos1.limpiarInterfaz();
      this.gUI_Botones2.habilitarAgregar();
      this.gUI_InformacionAutos1. habilitarEncontro();
  }
  public void estadoInicial(){
      this.gUI_Botones2.inicio();
      this.gUI_InformacionAutos1.limpiarInterfaz();
      this.gUI_InformacionAutos1.inicio();
  }
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones2 = new Vista.GUI_Botones();
        gUI_InformacionAutos1 = new Vista.GUI_InformacionAutos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_Botones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        getContentPane().add(gUI_InformacionAutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones2;
    private Vista.GUI_InformacionAutos gUI_InformacionAutos1;
    // End of variables declaration//GEN-END:variables
}
