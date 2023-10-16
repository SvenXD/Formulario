import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

int i = 0;
int val;

 Random rand = new Random();
 int numra = rand.nextInt(100);
 while ( i == 0){
       System.out.println("Estoy pensando en un número entre 1 y 100.");
 System.out.println("Puedes adivinar cual es? ;)");
 System.out.println("Escribe un numero.");
 Scanner num = new Scanner(System.in);
 int num1 = num.nextInt();
 System.out.println("Tu prediccion fue: "+num1);
  if ( num1 < numra)
  {
System.out.println("Muy bajo");
  }
  else if (num1 > numra)
{
    System.out.println("Muy alto");
}
else if (num1 == numra )
{
    System.out.println("Atinaste ;DDD");
    i++;
}




        }
        }
}
