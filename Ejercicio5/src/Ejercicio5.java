import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) throws Exception {
        double  celcius = 0;
        Scanner test = new Scanner(System.in);
        System.out.println("Escriba la temperatura en centigrados: ");
        celcius = test.nextDouble();

       double F = (celcius*(1.8))+32;
       System.out.println("Temperatura en Farenheit : "+F);
    }
}
