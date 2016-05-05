
package Modelo;

import java.util.ArrayList;

public class MetodosAutos {
    ArrayList <Autos> arrayAutos;
    String arreglo[];

    public MetodosAutos() {
      arrayAutos= new ArrayList <Autos>();
      arreglo= new String [5];
    }
    
    public boolean buscar(String numero){
        boolean encontro=false;
        for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(numero)){
                System.out.println("el numero de registro es correcto, se procede a gurdar informacion del array al arreglo");
               arreglo[0]=""+arrayAutos.get(contador).getCodigo();
                arreglo[1]=arrayAutos.get(contador).getNumero();
               arreglo[2]=arrayAutos.get(contador).getNombre();
               arreglo[3]=arrayAutos.get(contador).getCedula();
               arreglo[4]=arrayAutos.get(contador).getPlaca();
                encontro=true;
            }
        }
        return encontro;
    }
    
    public String[] getArregloInformacion(){
       return arreglo;
   }   

    public void agregar(String Informacion[]){
        Autos temporal;
        temporal= new Autos(Integer.parseInt(Informacion[0]),Informacion[1],Informacion[2],Informacion[3],Informacion[4]);
        arrayAutos.add(temporal);
        }
   
    public void comprobarAgrega(){
     Autos temporal;
     temporal= arrayAutos.get(0);
     System.out.println(temporal.getInformacion());
    }
    
 
    public void modificar(String arreglo[]){
        for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(arreglo[1])){
                arrayAutos.get(contador).setNombre(arreglo[2]);
                arrayAutos.get(contador).setCedula(arreglo[3]);
                arrayAutos.get(contador).setPlaca(arreglo[4]);
            }
        }
    }
    
public void eliminar(String arreglo[]) {
     for(int contador=0; contador<arrayAutos.size();contador++){
            if(arrayAutos.get(contador).getNumero().equals(arreglo[1])){
               arrayAutos.remove(contador);
            }
      }
}

   public int numeroConsecutivo(){
       //String numero="";
       int numero=0;
       if(arrayAutos.size()==0){
      numero=1;
  }else{   
         
        numero=arrayAutos.get(arrayAutos.size()-1).getCodigo(); 
         
        numero++;
       }
       return numero;
   }
  
   
   
            
}
