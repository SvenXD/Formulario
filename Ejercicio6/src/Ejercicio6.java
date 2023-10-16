import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
System.out.println("Estoy pensando en un número entre 1 y 100.");
System.out.println("Puedes adivinar cual es? ;)");
System.out.println("Escribe un numero.");
Scanner num = new Scanner(System.in);
int num1 = num.nextInt();
Random rand = new Random();
int numra = rand.nextInt(100);
System.out.println("Tu prediccion fue: "+num1);
System.out.println("El número en el que estaba pensando es:"+numra );
int val = Math.abs(num1-numra);
System.out.println("Estabas fuera por: "+(val) );


        }
}
