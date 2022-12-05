/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion9_practico;

/**
 *
 * @author Martin
 */
public class Producto {
    /// atributos
    private int codigo,cantBodega,cantMinBodega,cantMaxBodega;
    private Double precioCompra,precioVenta,porcDescuento;
    private String Descripcion;
    /// construstor

    public Producto(int codigo, int cantBodega, int cantMinBodega, int cantMaxBodega, Double precioCompra, Double precioVenta, String Descripcion) {
        this.codigo = codigo;
        this.cantBodega = cantBodega;
        this.cantMinBodega = cantMinBodega;
        this.cantMaxBodega = cantMaxBodega;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.porcDescuento = 0.01;
        this.Descripcion = Descripcion;
    }
    
    /// getter and setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public int getCantMinBodega() {
        return cantMinBodega;
    }

    public void setCantMinBodega(int cantMinBodega) {
        this.cantMinBodega = cantMinBodega;
    }

    public int getCantMaxBodega() {
        return cantMaxBodega;
    }

    public void setCantMaxBodega(int cantMaxBodega) {
        this.cantMaxBodega = cantMaxBodega;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(Double porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    /// metodos
    public boolean SolicitarPedido() {
        if (cantBodega<=cantMinBodega) {
            return true;
        }
        else {
            return false;
        }
    }
    public int calcularTotal(int unidades){
        return (int)(precioCompra*unidades); // aqui se hizo un cast
    }
    /*public  void  Mostrar(){
        System.out.print(codigo);
        System.out.print("-");
        System.out.print(Descripcion);
        System.out.print("-");
        System.out.print(precioCompra);
        System.out.print("-");
        System.out.print(precioVenta);
        System.out.print("-");
        System.out.print(cantBodega);
        System.out.print("-");
        System.out.print(cantMinBodega);
        System.out.print("-");
        System.out.print(cantMaxBodega);
        System.out.print("-");
        System.out.print(porcDescuento);
    }*/
    public String Mostrar(){
        return codigo+"-"+Descripcion+"-"+precioCompra+"-"+precioVenta+"-"+cantBodega+"-"+cantMinBodega+"-"+cantMaxBodega+"-"+porcDescuento;
        
    
    }
}