
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
    
    // METODOS
    public boolean agregarExtra(String nombreBebida){
        return false;
    }
    public boolean cambiarTipoTalla(TipoTalla tipoTalla){
        return false;
    }
    
    public boolean EliminarExtra (){
        return false;
    }
    public double aplicarPromocion(Promocion promocion){
        return 0;
    }
}
