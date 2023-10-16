import java.util.Scanner;
public class Multadd {
    public static void main(String[] args) throws Exception {

double multadd [] = new double[11];
Scanner teclado = new Scanner(System.in);

for (int i = 0; i < 3; i++)
{
    multadd[i] = teclado.nextDouble();
}

multadd[3] = multadd[0]*multadd[1]+multadd[2];
System.out.println("multisuma 1: "+multadd[3]);
multadd[4] = Math.sin(Math.PI/4) + (Math.cos(Math.PI/4))/2;
System.out.println("Multisuma 2: "+multadd[4]);

double expSum = multadd [0]*Math.pow(multadd[1], -multadd[0])+Math.sqrt(1-Math.pow(multadd[1],-multadd[0]));
System.out.println("multisuma 3: "+expSum);

    }
}
