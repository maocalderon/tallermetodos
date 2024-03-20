
package metodos;


public class ejercicio2 {
    
    public static double calcularDescuento(double precio, double porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100);
        double precioConDescuento = precio - descuento;
        return precioConDescuento;
    }

    public static void main(String[] args) {
        double precio = 300;
        double porcentajeDescuento = 20;
        
        double precioConDescuento = calcularDescuento(precio, porcentajeDescuento);
        System.out.println("Precio con descuento: " + precioConDescuento);
    }

}




    

