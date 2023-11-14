
package proyectofinal;


public class Direccion {
    
    private int cod_direccion;
    private String direccion;
    
    void SetDirecciones(int cod_direccion, String direccion){
        this.cod_direccion = cod_direccion;
        this.direccion = direccion;
    }
    
    
    String GetDirecciones(){
        return(Integer.toString(cod_direccion) + " " + direccion);
    }
    
    
}
