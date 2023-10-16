import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    int [] areFactors = new int [5];
    System.out.println("Coloque 5 numeros y se calculara si los 4 ultimos son factores del primero");
   
       int val = 0;
for ( int i = 0; i<5; i++)
    {
        areFactors[i] = teclado.nextInt();

if(areFactors[0]%areFactors[i] == 0)
{
val++;
}

    }
 boolean a = val>=5;

System.out.println(a);

    }



  
}