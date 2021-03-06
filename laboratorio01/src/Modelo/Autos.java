
package Modelo;

public class Autos {
   private String numero;
   private String nombre;
   private String cedula;
   private String placa;
   private int codigo;

    public Autos(int codigo,String numero, String nombre, String cedula, String placa ) {
         this.codigo = codigo;
        this.numero = numero;
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
       
    }
   
public int getCodigo(){
    return codigo;
}
public void setCodigo(int codigo){
    this.codigo=codigo;
}
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

   public String getInformacion(){
       return "codigo: "+getCodigo()+"   Numero registro: "+getNumero()+"  Nombre del dueño: "+getNombre()+"  Cedula del dueño:  "+getCedula()+"  placa del auto: "+getPlaca();
   }
   
   
}
