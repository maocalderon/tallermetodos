
package ejercicio1;


public class ejercicio4 {
    
    public static double medir (double radio, String tipo) {
        double pi = 3.1416;
        if (tipo.equals("perimetro")) {
            double perimetro = 2 * pi * radio;
            return perimetro;
        } else if (tipo.equals("area")) {
            double area = pi * Math.pow(radio, 2);
            return area;
        } else if (tipo.equals("volumen")) {
            double volumen = (4 * pi * Math.pow(radio, 3)) / 3;
            return volumen;
        } else {
            System.out.println("Tipo de cálculo no válido");
            return -1;
        }
    }

    public static void main(String[] args) {
        double radio = 5;
        String tipoCalculo = "perimetro";
        double resultado = medir(radio, tipoCalculo);
        System.out.println("Resultado: " + resultado);
    }
}

