
package com.mycompany.cafeandino.Clases;

import com.mycompany.cafeandino.Enumeraciones.TipoTalla;


public class ItemPedido {
    // atributos
    public int id;
    public String nombreBebida;
    public TipoTalla tipoTalla;
    public String extra[];
    public double precio;
    public double descuentoPromocion;
    
    // CONSTRUCTOR

    public ItemPedido(int id, String nombreBebida, TipoTalla tipoTalla) {
        this.id = id;
        this.nombreBebida = nombreBebida;
        this.tipoTalla = tipoTalla;
    }
    
    // metodos
    public boolean agregarItem(){
        return false;
    }
    
    public boolean EliminarItem (){
        return false;
    }
    public boolean modificarItem(){
        return false;
    }
}
