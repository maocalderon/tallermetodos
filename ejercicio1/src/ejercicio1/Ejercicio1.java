
package ejercicio1;


public class Ejercicio1 {

  public static double calcularDescuento(double precio, double porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100);
        double Descuento = precio - descuento;
        return Descuento;
    
}
}