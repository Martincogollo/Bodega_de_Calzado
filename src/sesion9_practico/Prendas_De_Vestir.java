/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion9_practico;

/**
 *
 * @author Martin
 */
public class Prendas_De_Vestir extends Producto {
    private char talla;
    private boolean Permite_planchado;

    public Prendas_De_Vestir(char talla, boolean Permite_planchado, int codigo, int cantBodega, int cantMinBodega, int cantMaxBodega, Double precioCompra, Double precioVenta, String Descripcion) {
        super(codigo, cantBodega, cantMinBodega, cantMaxBodega, precioCompra, precioVenta, Descripcion);
        this.talla = talla;
        this.Permite_planchado = Permite_planchado;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public boolean isPermite_planchado() {
        return Permite_planchado;
    }

    public void setPermite_planchado(boolean Permite_planchado) {
        this.Permite_planchado = Permite_planchado;
    }
    
    
}
