
package com.mycompany.cafeandino.Clases;

import com.mycompany.cafeandino.Enumeraciones.TipoTalla;


public class Promocion {
    // ATRIBUTOS
    public int id;
    public String descripcion;
    public String nombreBebida;
    public TipoTalla tipotalla;
    public boolean soloUnCliente;
    public double descuento;
    public String fecha;
    
    // CONSTRUCTOR

    public Promocion(int id, String descripcion, String nombreBebida, TipoTalla tipotalla, boolean soloUnCliente, double descuento, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
        this.tipotalla = tipotalla;
        this.soloUnCliente = soloUnCliente;
        this.descuento = descuento;
        this.fecha = fecha;
    }
    
    
    
}
