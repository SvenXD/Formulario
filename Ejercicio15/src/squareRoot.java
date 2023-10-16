import java.util.Scanner;
public class squareRoot {
    public static void main(String[] args) throws Exception {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Inserte un numero entero que tenga raiz");
    double num = teclado.nextDouble();
    double est;
    double squareRoot  = 0;
    String val = "0";
    double val2 = 0;
    int i = 0;
            System.out.println("Inserte un estimado");

    est = teclado.nextDouble();
if ((Math.sqrt(num)) % 1 == 0 || i != 10)
{while (i != 2){

    squareRoot  = (est +(num/est))/2;
    
System.out.println(squareRoot );
est = squareRoot;
val = Double.toString(est);

if (val.contains("000")){
    i++;
}
}
System.out.println("Raiz aproximada: "+squareRoot);
}
else
{
    System.out.println("Numero no es entero o no tiene raiz exacta");
}

    }
}
