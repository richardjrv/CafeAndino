
package com.mycompany.cafeandino.Clases;

import com.mycompany.cafeandino.Enumeraciones.EstadoPedido;


public class Pedido {
    //atributos
    public int id;
    public EstadoPedido estadoPedido;
    public ItemPedido[] itemPedido;
    
    //metodos
    public boolean añadirObservacion(){
        return true;
    
    }
    public boolean cambiarEstado(){
        return true;
    }
        
    public boolean cancelarPedido (String motivo){
        return true;
    }

    public double calcularDescuento(double porcentaje){
        return 0;
    }
    public double calcularTotal (){
        return 0;
    }
}
