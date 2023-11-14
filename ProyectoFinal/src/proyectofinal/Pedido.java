
package proyectofinal;


public class Pedido {
    
    private int id_pedidos, n_articulos, codcliente, dircliente;
    private String fecha_pedido; // se utilizara java.time
    int [][] datopedido = new int[999][2];
    
    void SetPedido(int id_pedido, int codcliente, int dircliente, String fecha_pedido, int cod_ar[], int amount_ar[]){
        this.id_pedidos = id_pedido;
        this.codcliente = codcliente;
        this.fecha_pedido = fecha_pedido;
        this.dircliente = dircliente;
        n_articulos=cod_ar.length;
        for(int i = 0 ; i<n_articulos; i++){
            datopedido[i][0]=cod_ar[i];
            datopedido[i][1]=amount_ar[i];
        }
        
    
    }
    
    
    int GetPedido(int a, int b){
        return(datopedido[a][b]);
    }
    
    
    String Info_Pedido(){
            return("el pedido: " + id_pedidos + "tiene " + n_articulos + " articulos y fue realizado el: " + fecha_pedido);
    }
    
    int getclp(){
        return(codcliente);
    }
    
    int getnar(){
        return(n_articulos);
    }
    
    int getdircl(){
        return(dircliente);
    }
}
