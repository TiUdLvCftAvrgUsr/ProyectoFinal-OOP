
package proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Articulo {
    
    
    ArrayList<Provedor> provedores = new ArrayList();
    public int codigo_ar;
    public String nombre, descripcion;
    public double Precio;
    
    void SetArticulo(int codigo_ar, String nombre, String descripcion, double Precio){
        this.codigo_ar = codigo_ar; 
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Precio = Precio;
    }    
    
    String GetArticulo(){
        return(Integer.toString(codigo_ar) + " ; nombre:" + nombre + " ; descripcion:" + descripcion + " ; precio:" + Double.toString(Precio) + " ; cantidad existencia : "+ cexist());
    }

    public void addprovedor(){
     String nombre = Input("ingrese el nombre del provedor: ");
     int codigo = 0;
     int cmin = Integer.parseInt(Input("ingrese la cantidad de existencia minima"));
     int stock = Integer.parseInt(Input("ingrese la cantidad de stock"));
     Provedor provedor = new Provedor();
     provedor.SetProvedor(nombre, codigo, cmin, stock);
     provedores.add(provedor);
   }
   
   String cexist(){
       int cex = 0;
       for(int i=0;i<provedores.size();i++){
         cex+=provedores.get(i).getcanex();
      }
       return(String.valueOf(cex));
   }
   
   void upcexist(int cnt){
       int i=-1;
       do{
         i++;
         int cex=0;
         cex=provedores.get(i).getcanex();

         
         if(cnt>cex){
             cnt-=cex;
             provedores.get(i).updatecanex(cex);
             
             
         }else if(cnt==cex){
             cnt=0;
             provedores.get(i).updatecanex(cex);
             
             
         }else if(cex>cnt){
             provedores.get(i).updatecanex(cnt);
             cnt=0;
             
             
         }
         
       }while(cnt!=0);
   }
   
  String stockex(){
       int stockex = 0;
       for(int i=0;i<provedores.size();i++){
         stockex+=provedores.get(i).getstockmin();
      }
       return(String.valueOf(stockex));
   }
   
   void upstockex(int cnt){
       int i=-1;
       do{
         i++;
         int stockex=0;
         stockex=provedores.get(i).getstockmin();

         if(cnt>stockex){
             cnt-=stockex;
             provedores.get(i).updatestockmin(stockex);
             
         }else if(cnt==stockex){
             cnt=0;
             provedores.get(i).updatestockmin(stockex);
             
         }else if(stockex>cnt){
             provedores.get(i).updatestockmin(cnt);
             cnt=0;
             
         }
         
       }while(cnt!=0);
   }
   
   public void getprovedores(){
      String string="";
      for(int i=0;i<provedores.size();i++){
         string+="provedores:"+(i+1)+"\n";
         string+=""+provedores.get(i).GetProvedor()+"\n";
      }
      
      JOptionPane.showMessageDialog(null, string);
   }
    
   public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
   
   String name(){
   return(nombre);
   }

   double price(){
       return(Precio);
   }
   
}
