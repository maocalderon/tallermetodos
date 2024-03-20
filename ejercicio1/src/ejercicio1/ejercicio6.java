
package ejercicio1;


public class ejercicio6 {
    public static double conversion(double segundos, String tipo) {
        if (tipo.equals("dias")) {
            return segundos / (24 * 60 * 60);
        } else if (tipo.equals("horas")) {
            return segundos / (60 * 60);
        } else if (tipo.equals("minutos")) {
            return segundos / 60;
        } else {
            System.out.println("Tipo de conversión no válido");
            return -1;
        }
    }

    public static void main(String[] args) {
        double segundos = 100000;
        String tipoConversion = "dias";

        double resultado = conversion(segundos, tipoConversion);

        if (resultado != -1) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
    

