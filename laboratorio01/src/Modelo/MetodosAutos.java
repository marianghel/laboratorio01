
package Modelo;

import java.util.ArrayList;

public class MetodosAutos {
    ArrayList <Autos> arrayAutos;
    String arreglo[];

    public MetodosAutos() {
        arrayAutos= new ArrayList <Autos>();
      arreglo= new String [4];
    }
    
    public boolean buscar(String numero){
        boolean encontro=false;
        for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(numero)){
                
                arreglo[1]=arrayAutos.get(contador).getNombre();
               arreglo[2]=arrayAutos.get(contador).getCedula();
               arreglo[3]=arrayAutos.get(contador).getPlaca();
                encontro=true;
            }else{
                encontro=false;
            }
        }
        return encontro;
    }
    
    public String[] getArregloInformacion(){
       return arreglo;
   }   

    public void agregar(String Informacion[]){
        Autos temporal;
        temporal= new Autos(Informacion[0],Informacion[1],Informacion[2],Informacion[3]);
        arrayAutos.add(temporal);
        arreglo=new String [2];
    }
   
    
 
    public void modificar(String arreglo[]){
        for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(arreglo[0])){
                arrayAutos.get(contador).setNombre(arreglo[1]);
                arrayAutos.get(contador).setCedula(arreglo[2]);
                arrayAutos.get(contador).setPlaca(arreglo[3]);
            }
        }
    }
    
public void eliminar(String arreglo[]) {
     for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(arreglo[0])){
               arrayAutos.remove(contador);
            }
      }
}

  /* public String numeroConsecutivo(String numero){
  int numero=0;
    for(int contador=0; contador<arrayAutos.size();contador++){ 
        numero=contador;
    }
    numero=+1;
    return ""+numero;
   }*/
            
}