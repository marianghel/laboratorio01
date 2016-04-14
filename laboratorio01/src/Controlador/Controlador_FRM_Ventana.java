/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutos;
import Vista.FRM_Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Marianghel
 */
public class Controlador_FRM_Ventana implements ActionListener{
    FRM_Ventana ventana;
    public MetodosAutos metodos;

    public Controlador_FRM_Ventana(FRM_Ventana ventana) {
        this.ventana = ventana;
        metodos= new MetodosAutos();
        this.ventana.estadoInicial();
    }
    
   public void actionPerformed(ActionEvent e){
       
         if(e.getActionCommand().equals("Buscar")){
             consultar();
         }
        
        if(e.getActionCommand().equals("Agregar")){
        this.metodos.agregar(ventana.devolverInformacion());
        this.ventana.limpiarPantalla();
        this.ventana.mensaje("Informacion agregada");
        this.ventana.estadoInicial();
        }
              
        
        if(e.getActionCommand().equals("Modificar")){
         this.metodos.modificar(ventana.devolverInformacion());
         this.ventana.mensaje("Se modifico la informacion");
        }/*else{
            JOptionPane.showMessageDialog(null,"No se pudo modificar información");

        }*/
         if(e.getActionCommand().equals("Eliminar")){
         this.metodos.eliminar(ventana.devolverInformacion());
             this.ventana.estadoInicial();
         this.ventana.limpiarPantalla();
         JOptionPane.showMessageDialog(null,"Los datos fuero eliminados correctamente");
        }/*else{
             JOptionPane.showMessageDialog(null,"Los datos no se eliminaron, vuelva a intentar");
         }*/
   }
        public void consultar(){
         
        if(this.metodos.buscar(ventana.devolverNumero())){
        this.ventana.mostrarInformacion(metodos.getArregloInformacion());
        this.ventana.Existe();
      
         this.ventana.mensaje("Se encontro informacion");
         }else{
            this.ventana.Inexistente();
           
          JOptionPane.showMessageDialog(null,"No se encontro datos");
        }
        }
    
        
         /*public void numeroConsecutivo(){
             this.metodos.numeroConsecutivo();
         }*/
   }
  
  
                                
