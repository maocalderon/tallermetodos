
package ejercicio1;


public class ejercicio5 {
     
     public static int conversionASegundos(int dias, int horas, int minutos) {
        int segundosPorDia = dias * 24 * 60 * 60;
        int segundosPorHoras = horas * 60 * 60;
        int segundosPorMinutos = minutos * 60;
        
        int totalSegundos = segundosPorDia + segundosPorHoras + segundosPorMinutos;
        
        return totalSegundos;
    }
    public static void main(String[] args) {
        int dias = 2;
        int horas = 12;
        int minutos = 30;
        
        int totalSegundos = conversionASegundos(dias, horas, minutos);
        
        System.out.println("Total de segundos: " + totalSegundos);
    }
}
    

