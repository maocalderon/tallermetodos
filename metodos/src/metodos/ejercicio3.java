
package metodos;

public class ejercicio3 {
    
    public static double dolaresAEuros(double dolares) {
        double tasaCambio = 1.33250;
        double euros = dolares / tasaCambio;
        return euros;
    }

    public static void main(String[] args) {
        double dolares = 100;
        double euros = dolaresAEuros(dolares);
        System.out.println("Cantidad de euros: " + euros);
    }
}

