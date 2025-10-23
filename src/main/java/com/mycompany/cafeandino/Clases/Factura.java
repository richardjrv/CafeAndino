
package com.mycompany.cafeandino.Clases;

import com.mycompany.cafeandino.Enumeraciones.TipoPago;

public class Factura {
    // ATRIBUTOS
    public int id;
    public TipoPago tipoPago;
    public double monto;
    public String RUC;
    public int idPedido;
    
    // CONSTRUCTOR

    public Factura(int id, TipoPago tipoPago) {
        this.id = id;
        this.tipoPago = tipoPago;
    }
    
    // METODO
    public boolean generarFactura (Pedido pedido, Cliente cliente){
       return true;
    }
}
