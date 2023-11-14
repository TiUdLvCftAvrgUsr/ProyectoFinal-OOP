
package proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.*;

public class ProyectoFinal {

    
    public static void main(String[] args) {
        
       ArrayList<Cliente> listcliente = new ArrayList();
       ArrayList<Articulo> inventario = new ArrayList();
       ArrayList<Pedido> pedidos = new ArrayList();
       /*
       Cliente c1 = new Cliente();
       Cliente c2 = new Cliente();
       
       Articulo a2 = new Articulo();
       Articulo a3 = new Articulo();
       
       Pedido p1 = new Pedido();
       Pedido p2 = new Pedido();
       
       c1.SetCliente(1, 2400, 3500, "pepito", 2);
       c2.SetCliente(2, 2400, 3500, "carlitos", 2);
       listcliente.add(c1);
       listcliente.add(c2);
       
       a3.SetArticulo(1, "pelota", "ketti", 55);
       a3.addprovedor();
       a2.SetArticulo(2, "balon", "que mira bobo", 65);
       a2.addprovedor();
       inventario.add(a3);
       inventario.add(a2);
       int [] idartest = new int[2];
       int [] amartest = new int[2];
       idartest[0] = 2;
       idartest[1] = 1;
       amartest[0]=23;
       amartest[1]=2;
       
       p1.SetPedido(1, 1, "hoy", idartest, amartest);
       
       idartest[0] = 1;
       idartest[1] = 2;
       amartest[0]=2;
       amartest[1]=23;
       
       p2.SetPedido(2, 2, "ayer", idartest, amartest);
       
       pedidos.add(p1);
       pedidos.add(p2);
       */
       int y, u ,cn, c=0, a=0, ip=0;
       boolean pv;
       
       // y=control del switch pricipal, u= control de los switches secundarios , cn = control de los do/while, c= codigo cliente, a= codigo articulo, ip= id pedido, pv=si se hace pedido
       do{
       y = Integer.parseInt(JOptionPane.showInputDialog("que desea hacer: \n1-cliente \n2-articulo \n3-pedidos \n0-salir"));
       
       if(y>-1 && y<4){
       switch(y){
           case 1:  
   
               u = Integer.parseInt(JOptionPane.showInputDialog("1-añadir cliente \n2-ver cliente \n3-añadir direccion \n4-ver direcciones \n0-salir"));
               switch(u){
                   case 1: 
                              cn = 1;
                              do{ 
                                  c++;
                                  int codigo = c;/*Integer.parseInt(JOptionPane.showInputDialog("añadir codigo de cliente "));*/
                                  String nombre = JOptionPane.showInputDialog("añadir nombre cliente ");
                                  int saldo = Integer.parseInt(JOptionPane.showInputDialog("añadir saldo de cliente "));
                                  int credito = Integer.parseInt(JOptionPane.showInputDialog("añadir limite de credito de cliente "));
                                  float descuento = Float.parseFloat(JOptionPane.showInputDialog("añadir descuento de cliente "));
                                  Cliente cliente = new Cliente();
                                  cliente.SetCliente(codigo, saldo, credito, nombre, descuento);
                                  cliente.adddir(1);
                                  listcliente.add(cliente);
                                  cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otro 0(no)/cualquier otro numero(si) "));
                              }while(cn!=0);
                               /*finañadecliente*/
                   break;
                   case 2: 
                         //vercliente
                         String string="";
                         for(int i=0;i<listcliente.size();i++){
                            string+="Clientes:"+(i+1)+"\n";
                            string+=""+listcliente.get(i).GetCliente()+"\n";
                         }
                        JOptionPane.showMessageDialog(null, string);
                        //finvercliente
                   break;
                   case 3: 
                        //añadir direccion
                         String stringd="";
                         stringd+="escoja al cliente que va a añadir una direccion:\n";
                         cn=1;
                         int cd;
                         for(int i=0;i<listcliente.size();i++){
                         stringd+=""+listcliente.get(i).GetCliente()+"\n";
                         }
                         do{
                         int p = Integer.parseInt(JOptionPane.showInputDialog(stringd));
                         cd = (listcliente.get(p-1).listDireccion.size()+1);
                         listcliente.get(p-1).adddir(cd);
                         cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otra direccion 0(no)/cualquier otro numero(si) "));
                         }while(cn!=0);
                    break;
                    case 4: 
                        //ver provedor
                        String stringdv="";
                        stringdv+="escoja al cliente que va a ver sus direcciones:\n";
                         for(int i=0;i<listcliente.size();i++){
                         stringdv+=""+listcliente.get(i).GetCliente()+"\n";
                         }
                         int v = Integer.parseInt(JOptionPane.showInputDialog(stringdv));
                         listcliente.get(v-1).getdir();
                    break;
                   case 0: break;
                   default: break;
                   
               }
            break;
           
            case 2:  
               u = Integer.parseInt(JOptionPane.showInputDialog("1-añadir articulo \n2-ver articulos \n3-añadir provedor \n4-ver provedores \n0-salir"));
               switch(u){
                   case 1:  
                   //añadirarticulo
                       cn = 1;
                      do{ 
                        a++;
                        int codigo = a;/*Integer.parseInt(JOptionPane.showInputDialog("añadir codigo del articulo "));*/
                        String nombre = JOptionPane.showInputDialog("añadir nombre del articulo ");
                        int precio = Integer.parseInt(JOptionPane.showInputDialog("añadir precio de articulo "));
                        String descripcion = JOptionPane.showInputDialog("añadir descripcion del articulo ");
                        Articulo a1 = new Articulo();
                        a1.SetArticulo(codigo, nombre, descripcion, precio);
                        a1.addprovedor();
                        inventario.add(a1);
                        cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otro 0(no)/cualquier otro numero(si) "));
                       }while(cn!=0);
                      //finañadirarticulo
                    break;
                    case 2: 
                          //verarticulos
                         String stringa="";
                         for(int i=0;i<inventario.size();i++){
                            stringa+="Articulos:"+(i+1)+"\n";
                            stringa+=""+inventario.get(i).GetArticulo()+"\n";
                         }
                         JOptionPane.showMessageDialog(null, stringa);
                         //finverarticulos
                     break;
                    case 3: 
                        //añadir provedor
                         String stringp="";
                         stringp+="escoja el articulo al que le va a añadir un provedor:\n";
                         cn=1;
                         do{
                         for(int i=0;i<inventario.size();i++){
                         stringp+=""+inventario.get(i).GetArticulo()+"\n";
                         }
                         int p = Integer.parseInt(JOptionPane.showInputDialog(stringp));
                         inventario.get(p-1).addprovedor();
                         cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otro 0(no)/cualquier otro numero(si) "));
                         }while(cn!=0);

                     break;
                    case 4: 
                        //ver provedor
                        String stringpv="";
                        stringpv+="escoja el articulo al que le va a ver los provedores:\n";
                         for(int i=0;i<inventario.size();i++){
                         stringpv+=""+inventario.get(i).GetArticulo()+"\n";
                         }
                         int v = Integer.parseInt(JOptionPane.showInputDialog(stringpv));
                         inventario.get(v-1).getprovedores();
                     break;
                            case 0: break;
                            default: break;
                        }
           break;
      
           case 3: 
               //hacer pedidos
               u = Integer.parseInt(JOptionPane.showInputDialog("1-añadir pedido \n2-ver pedido \n0-salir"));
               
               switch(u){
                   case 1: 
                       //hacerpedido
                         double vtotal=0, vatotal;
                         ip++;
                         String string="";
                         string+="escoja al cliente:\n";
                         for(int i=0;i<listcliente.size();i++){
                            string+=""+listcliente.get(i).GetCliente()+"\n";
                         }
                         int v = Integer.parseInt(JOptionPane.showInputDialog(string))-1;
                         String stringd="";
                         stringd+="escoja la direccion de envio:\n";
                         for(int i=0;i<listcliente.size();i++){
                            stringd+=""+listcliente.get(i).getdir(-1)+"\n";
                         }
                         int d = Integer.parseInt(JOptionPane.showInputDialog(stringd))-1;
                         
                         cn = 1;
                         String stringa="";
                         ArrayList<Integer> aidar = new ArrayList();
                         ArrayList<Integer> aamar = new ArrayList();
                         stringa+="escoja el articulo:\n";
                         for(int i=0;i<inventario.size();i++){
                         stringa+=""+inventario.get(i).GetArticulo()+"\n";
                         }
                         do{
                         int ar = Integer.parseInt(JOptionPane.showInputDialog(stringa))-1;
                         int cnt = Integer.parseInt(JOptionPane.showInputDialog("que cantidad va a comprar"));
                        
                         if(cnt <= Integer.parseInt(inventario.get(ar).cexist())){
                               inventario.get(ar).upcexist(cnt);
                               aidar.add(ar);
                               aamar.add(cnt);
                               vatotal=(inventario.get(ar).price()*cnt);
                               vtotal+=vatotal;
                               cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otro articulo 0(no)/cualquier otro numero(si) "));
                               pv=true;
                         }else if(cnt <= (Integer.parseInt(inventario.get(ar).cexist())+Integer.parseInt(inventario.get(ar).stockex()))){
                             
                             int cv = Integer.parseInt(JOptionPane.showInputDialog("no hay cantidad en existencia suficiente pero hay stock, desea continuar? 0(no)/cualquier otro num(si) "));
                             if(cv!=0){
                               inventario.get(ar).upstockex(cnt-Integer.parseInt(inventario.get(ar).cexist()));
                               inventario.get(ar).upcexist(Integer.parseInt(inventario.get(ar).cexist()));
                               aidar.add(ar);
                               aamar.add(cnt);
                               vatotal=(inventario.get(ar).price()*cnt);
                               vtotal+=vatotal;
                               cn = Integer.parseInt(JOptionPane.showInputDialog("añadir otro articulo 0(no)/cualquier otro numero(si) "));
                               pv=true;
                             }else{
                                 JOptionPane.showMessageDialog(null, "cantidad en existencia insuficiente, intente nuevamente");
                                 cn=0; pv=false;
                             }
                             
                         }else{
                             JOptionPane.showMessageDialog(null, "no hay suficiente cantidad en existencia, intente de nuevo con otra cantidad");
                             cn=0; pv=false;
                         }
                         }while(cn!=0);
                         if(vtotal<listcliente.get(v).saldo() && pv==true){
                             int k = aidar.size();
                             int [] idar = new int[k];
                             int [] amar = new int[k];
                             for(int i=0; i<k; i++){
                                 idar[i] = aidar.get(i);
                                 amar[i] = aamar.get(i);
                             }
                             vtotal-=(vtotal*(listcliente.get(v).discount()/100));
                             listcliente.get(v).updatesaldo(vtotal);
                             Pedido pedido = new Pedido();
                             pedido.SetPedido(ip, v,d, String.valueOf(LocalDate.now()), idar, amar);
                             pedidos.add(pedido);
                             JOptionPane.showMessageDialog(null, "pedido exitoso");
                         }else if(vtotal>listcliente.get(v).saldo() && vtotal<(listcliente.get(v).saldo()+listcliente.get(v).credit()) && pv==true){
                             int k = aidar.size();
                             int [] idar = new int[k];
                             int [] amar = new int[k];
                             for(int i=0; i<k; i++){
                                 idar[i] = aidar.get(i);
                                 amar[i] = aamar.get(i);
                             }
                             vtotal-=(vtotal*(listcliente.get(v).discount()/100));
                             cn = Integer.parseInt(JOptionPane.showInputDialog("debera usar su credito para continuar, desea hacerlo? 0(no)/cualquier otro num(si) "));
                             if(cn!=0){
                                    listcliente.get(v).updatecredit(vtotal-listcliente.get(v).saldo());
                                    listcliente.get(v).updatesaldo(listcliente.get(v).saldo());
                                    Pedido pedido = new Pedido();
                                    pedido.SetPedido(ip, v,d, String.valueOf(LocalDate.now()), idar, amar);
                                    pedidos.add(pedido);
                                    JOptionPane.showMessageDialog(null, "pedido exitoso");
                             }else{
                                 JOptionPane.showMessageDialog(null, "saldo insuficiente, intente nuevamente");
                             }
                         }else if(pv == true){
                             JOptionPane.showMessageDialog(null, "saldo y credito insuficiente, intente nuevamente");
                         }
                         
                   break;
                   case 2: 
                         vtotal=0; vatotal=0;
                         String stringpv="";
                         stringpv+="escoja el pedido que quiera ver en detalle:\n";
                         for(int i=0;i<pedidos.size();i++){
                         stringpv+=""+(i+1)+") realizado por: "+listcliente.get(pedidos.get(i).getclp()).name()+" que contiene:"+pedidos.get(i).getnar()+" articulos\n";
                         }
                         v = Integer.parseInt(JOptionPane.showInputDialog(stringpv));
                         String stringvp = "";
                         stringvp+=pedidos.get(v-1).Info_Pedido()+"\npara el cliente: "+listcliente.get(pedidos.get(v-1).getclp()).name()+" en su direccion:"+listcliente.get(pedidos.get(v-1).getclp()).getdir(pedidos.get(v-1).getdircl())+"\n";
                         stringvp+="contiene los siguientes articulos con sus cantidades:";
                         for(int i = 0;i<pedidos.get(v-1).getnar(); i++){
                         stringvp+="\n"+(i+1)+") "+inventario.get(pedidos.get(v-1).GetPedido(i, 0)).name();
                         stringvp+=" X "+pedidos.get(v-1).GetPedido(i, 1)+" unidades, valor = ";
                         vatotal=(inventario.get(pedidos.get(v-1).GetPedido(i, 0)).price()*pedidos.get(v-1).GetPedido(i, 1));
                         stringvp+=vatotal;
                         vtotal+=vatotal;
                         }
                         vtotal-=(vtotal*(listcliente.get(pedidos.get(v-1).getclp()).discount()/100));
                         stringvp+="\npara un total con descuento de:"+vtotal;
                         JOptionPane.showMessageDialog(null, stringvp);
                         
                   break;
                   case 0: break;
                   default: break;
               }
               
           break;

           case 0: break;
           default: break;
       }//switch
       }else{JOptionPane.showInputDialog("escoja una opcion correcta");}
       }while(y!=0);
       
    }
    
    
}
