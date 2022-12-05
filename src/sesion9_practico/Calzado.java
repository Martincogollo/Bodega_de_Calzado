/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion9_practico;

/**
 *
 * @author Martin
 */
public class Calzado extends Producto {
    private int talla;

    public Calzado(int talla, int codigo, int cantBodega, int cantMinBodega, int cantMaxBodega, Double precioCompra, Double precioVenta, String Descripcion) {
        super(codigo, cantBodega, cantMinBodega, cantMaxBodega, precioCompra, precioVenta, Descripcion);
        this.talla = talla;
    }

    

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}
