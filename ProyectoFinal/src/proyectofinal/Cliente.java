
package proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente {
    private int codigo_cl, saldo, credit_limit;
    private String nombre;
    private float descuento;
    ArrayList<Direccion> listDireccion = new ArrayList();
   
   
   public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
   
   
   public void adddir(int c){
     String dir = Input("añadir nueva direccion ");
     Direccion direccion = new Direccion();
     direccion.SetDirecciones(c, dir);
     listDireccion.add(direccion);
   }
   
   
   public void getdir(){
      String string="";
      for(int i=0;i<listDireccion.size();i++){
         string+="direccion"+(i+1)+"\n";
         string+=""+listDireccion.get(i).GetDirecciones()+"\n";
      }
      
      JOptionPane.showMessageDialog(null, string);
   }
   
   public String getdir(int a){
      if(a==-1){
      String string="";
      for(int i=0;i<listDireccion.size();i++){
         string+="direccion"+(i+1)+"\n";
         string+=""+listDireccion.get(i).GetDirecciones()+"\n";
      }
      return(string);
      }else{
         String string =""+listDireccion.get(a).GetDirecciones()+"\n";
          return(string);
      }
      
      
   }
   
    
    void SetCliente(int codigo_cl, int saldo, int credit_limit, String nombre, float descuento){
        this.codigo_cl = codigo_cl;
        this.saldo = saldo;
        this.credit_limit = credit_limit;
        this.nombre = nombre;
        this.descuento = descuento;
    }
    
    
    String GetCliente(){
        return (Integer.toString(codigo_cl) + " " + Integer.toString(saldo) + " " + Integer.toString(credit_limit) + " " + nombre + " " + Float.toString(descuento));
    }
    
    String name(){
        return(nombre);
    }
    int saldo(){
        return(saldo);
    }
    int credit(){
        return(credit_limit);
    }
    void updatesaldo (double sl){
        saldo -= sl;
    }
    void updatecredit (double cr){
        credit_limit -= cr;
    }
    float discount(){
        return(descuento);
    }
}