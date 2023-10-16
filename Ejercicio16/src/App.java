import java.util.Scanner;
public class App {

double x;
double n;
public static double myexp;
public static double val;
  public static  Scanner teclado = new Scanner(System.in);
   public static     App e = new App(teclado.nextDouble(), 0);
public App(double x, double n){
    this.x= x;
    this.n=n;
}

    public static void main(String[] args) throws Exception {


 myexp =1+e.x;
 val =2 ;
int fact =1;
int val2 = 1;

while( Math.exp(e.x) > myexp){
    val2++;
    fact++;
    fact = val2*(fact-1);
if (fact == 0)
{
    fact = 1;
}

myexp = (Math.pow(e.x,val)/fact+myexp);
val++;
}
System.out.println("Valores antes del bucle:");
e.checks();

 System.out.println("Valores despues de bucles");

 //separador
  myexp =1+e.x;
val2 = 1;
fact = 1;
e.x = 1;
val = 2;
for (int i = 0; i<3; i++){
    if (e.x == 2)
    {
          myexp =1+e.x;
val2 = 1;
fact = 1;
e.x = 10;
val = 2;
    }
    else  if (e.x == 11)
    {
          myexp =1+e.x;
val2 = 1;
fact = 1;
e.x = 100;
val = 2;
    }

    
    while( Math.exp(e.x) > myexp){
    val2++;
    fact++;
    fact = val2*(fact-1);
if (fact == 0)
{
    fact = 1;
}

myexp = (Math.pow(e.x,val)/fact+myexp);

val++;

}
e.checks();
e.x++;

}

    }
     public static void checks (){
      System.out.println(e.x);
      System.out.println(myexp);
      System.out.println(Math.exp(e.x));
}
}
