
package proyectofinal;


public class Provedor {
    
    private String name_provedor;
    private int cod_provedor, cantidad_existencia, stock_min;
    
    void SetProvedor(String name_provedor, int cod_provedor, int cantidad_existencia, int stock_min){
        this.name_provedor = name_provedor;
        this.cod_provedor = cod_provedor;
        this.cantidad_existencia = cantidad_existencia;
        this.stock_min = stock_min;
    }
    
    
    String GetProvedor(){
    return(name_provedor + " " + cod_provedor + " "+ cantidad_existencia + " "+ stock_min);
    }
    
    int getcanex (){
        return(cantidad_existencia);
    }
    int getstockmin (){
        return(stock_min);
    }
    void updatecanex (int can){
        cantidad_existencia -= can;
    }
    void updatestockmin (int cans){
        stock_min -= cans;
    }
}
