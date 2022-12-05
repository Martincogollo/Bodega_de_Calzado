/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion9_practico;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Sesion9_practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.println("Digite el numero de productos: ");
        ///int n = teclado.nextInt();
        System.out.println("Digite la cantidad de calzados: ");
        int c = teclado.nextInt();
        System.out.println("Digite la cantidad de prendad dde vestir: ");
        int p = teclado.nextInt();
        ///Producto vector[]= new Producto[n];/// instancia del vector
        Calzado calzado[]= new Calzado[c];
        Prendas_De_Vestir prendas[]= new Prendas_De_Vestir[p];
        
        for (int i = 0; i <c; i++) {
            System.out.println("Digite el codigo del calzado "+(i+1)+": ");
            int codigoC=teclado.nextInt();
            System.out.println("digite la talla");
            int tallaC= teclado.nextInt();
            System.out.println("Digite la descripcion del producto "+(i+1)+": ");
            String descripcionC=teclado.next();
            System.out.println("Digite el precio de compra "+(i+1)+": ");
            Double precioCompraC=teclado.nextDouble();
            System.out.println("Digite el precio de venta "+(i+1)+": ");
            Double precioVentaC=teclado.nextDouble();
            System.out.println("Digite la cantidad en bodega "+(i+1)+": ");
            int cantBodegaC=teclado.nextInt();
            System.out.println("Digite la cantidad Minima en bodega "+(i+1)+": ");
            int cantMinBodegaC=teclado.nextInt();
            System.out.println("Digite la cantidad Maxima en bodega "+(i+1)+": ");
            int cantMaxBodegaC=teclado.nextInt();
            calzado[i]= new Calzado(tallaC,codigoC,cantBodegaC,cantMinBodegaC,cantMaxBodegaC,precioCompraC,precioVentaC,descripcionC);/// el orden del vector debe se igual al de constructor
        }
        for (int i = 0; i <p; i++) {
            System.out.println("Digite el codigo "+(i+1)+": ");
            int codigoP=teclado.nextInt();
            System.out.println("digite la talla");
            char tallaP= teclado.next().charAt(0);
            System.out.println("Desea planchado [si] o [no]");
            boolean PlanchadoP=teclado.nextBoolean();
            System.out.println("Digite la descripcion del producto "+(i+1)+": ");
            String descripcionP=teclado.next();
            System.out.println("Digite el precio de compra "+(i+1)+": ");
            Double precioCompraP=teclado.nextDouble();
            System.out.println("Digite el precio de venta "+(i+1)+": ");
            Double precioVentaP=teclado.nextDouble();
            System.out.println("Digite la cantidad en bodega "+(i+1)+": ");
            int cantBodegaP=teclado.nextInt();
            System.out.println("Digite la cantidad Minima en bodega "+(i+1)+": ");
            int cantMinBodegaP=teclado.nextInt();
            System.out.println("Digite la cantidad Maxima en bodega "+(i+1)+": ");
            int cantMaxBodegaP=teclado.nextInt();
            prendas[i]= new Prendas_De_Vestir(tallaP,PlanchadoP,codigoP,cantBodegaP,cantMinBodegaP,cantMaxBodegaP,precioCompraP,precioVentaP,descripcionP);/// el orden del vector debe se igual al de constructor
        }
        
        boolean salir=true;
        do{System.out.println("menu de opciones");
        System.out.println("[1]verificar productos a pedir");
        System.out.println("[2]calzado con mayor cantidad de unidades");
        System.out.println("[4]modificar cantidad minima requeridad en bodega");
        System.out.println("[7]Consultar producto");
        System.out.println("[8]prenda con mayor cantidad de unidades");
        System.out.println("[6]salir");
        int opc=teclado.nextInt();
        switch(opc){
            case 1:
                System.out.println("Digite [1]calzado o [2]prendas ");
                int tipo= teclado.nextInt();
                switch(tipo){
                    case 1:
                    for (int i = 0; i < c; i++) {
                        if (calzado[i].SolicitarPedido()){
                        System.out.println("Alerta generada para el calzado: "+calzado[i].getCodigo());
                    }           
                }
                    break;
                    case 2:
                         for (int i = 0; i < p; i++) {
                        if (prendas[i].SolicitarPedido()){
                        System.out.println("Alerta generada para las prendas: "+prendas[i].getCodigo());
                    }           
                }
                        break;
        }
                
                break;
            case 2:
                int mayor=-9999999;
                Producto posMayor=calzado[0];
                        for (int i = 0; i < c; i++) {
                            if (calzado[i].getCantBodega()>mayor){
                               mayor=calzado[i].getCantBodega();
                               posMayor=calzado[i];
                            }
                        }
                        System.out.println("el codigo del calzado con mayor cantidad de unidades es: "+posMayor.getCodigo());
                    
        
                break;
            /*case 3:
                System.out.println("Ingrese el codigo a pagar");
                int cProducto= teclado.nextInt();
                System.out.println("ingrese la cantidad de uniodades a pagar: ");
                int cantProductos=teclado.nextInt();
                for (int i = 0; i < n; i++) {
                    if (cProducto == vector[i].getCodigo()) {
                        System.out.println("el total a pagar del producto "+vector[i].getCodigo()+" es: "+vector[i].calcularTotal(cantProductos));                     
                        
                    }
                }
                break;*/
            case 4:
                System.out.println("Digite [1]calzado o [2]prendas ");
                tipo= teclado.nextInt();
                System.out.println("Ingrese el codigo del producto");
                int codigo = teclado.nextInt();
                System.out.println("Digite el nuevo valor min: ");
                int nuevomin= teclado.nextInt();
                switch(tipo){
                    case 1:
                        for (int i = 0; i < c; i++) {
                            if (nuevomin>0) {
                                if (codigo== calzado[i].getCodigo()) {
                                calzado[i].setCantMinBodega(nuevomin);
                        }
                            else{
                                calzado[i].setCantMinBodega(0);
                        }
                        System.out.println("la nueva cantidad minima de calzados " +calzado[i].getCodigo()+" es: "+calzado[i].getCantMinBodega());
                    }
                }
                    break;
                    case 2:
                        for (int i = 0; i < p; i++) {
                            if (nuevomin>0) {
                                if (codigo== prendas[i].getCodigo()) {
                                prendas[i].setCantMinBodega(nuevomin);
                        }
                            else{
                                prendas[i].setCantMinBodega(0);
                        }
                        System.out.println("la nueva cantidad minima de las prendas " +prendas[i].getCodigo()+" es: "+prendas[i].getCantMinBodega());
                    }
                }
                        break;
        }
                
                break;
            /*case 5:
                System.out.println("Ingrese el codigo del producto");
                codigo = teclado.nextInt();
                System.out.println("Ingrese las unidades a llevar");
                int unidades  = teclado.nextInt();     
                for (int i = 0; i < n; i++) {
                    if (codigo== vector[i].getCodigo()) {
                        if (unidades<=vector[i].getCantBodega()) {
                            System.out.print("El total a pagar es: ");
                            System.out.println(((vector[i].getPrecioCompra()*unidades)*(1-vector[i].getPorcDescuento())));
                        }
                    }
                    
                }
                break;*/
            case 6:
                System.out.println("usted ha salido");
                salir=false;
                break;
            case 7:
                System.out.println("Digite el codigo del producto: ");
                codigo= teclado.nextInt();
                System.out.println("Digite el tipo [1]calzado o [2]prenda : ");
                tipo = teclado.nextInt();
                for (int i = 0; i < c; i++) {
                    switch(tipo){
                        case 1:
                            if (codigo==calzado[i].getCodigo()) {
                                 System.out.println(calzado[i].Mostrar());
                            }
                            else {
                                System.out.println("Codigo no encontrado");
                            }
                            break;
                        case 2:
                            if (codigo==prendas[i].getCodigo()) {
                        System.out.println(prendas[i].getDescripcion());
                            }
                            else {
                                System.out.println("Codigo no encontrado");
                            }
                            break;
                    
                    }
                    
                }
                break;
                case 8:
                mayor=-9999999;
                Producto posMayor1=prendas[0];
                        for (int i = 0; i < p; i++) {
                            if (prendas[i].getCantBodega()>mayor){
                               mayor=prendas[i].getCantBodega();
                               posMayor1=prendas[i];
                            }
                        }
                        System.out.println("el codigo de la prenda con mayor cantidad de unidades es: "+posMayor1.getCodigo());
                break;
            default:System.out.println("opciones validas solo de 1 a 6");
        }
        
        }while(salir);
        System.out.println("Ejercio terminado");
    }
    
}
