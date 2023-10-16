import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

//String hey2 = test(lol);
String lol = "^";
        double valores[] = {0,0,0,0};
        System.out.println("Inserte los valrores: a, b, c y n");
 Scanner teclado = new Scanner(System.in);
 valores[0]= teclado.nextDouble();
 valores[1]= teclado.nextDouble();
  valores[2]= teclado.nextDouble();
   valores[3]= teclado.nextDouble();
 
System.out.println( valores[0]+lol+ valores[3]+"+"+valores[1]+lol+valores[3]+"="+valores[2]+lol+valores[3]);
if (valores[3] <2){
    System.out.println("Santos bacalaos! Fermat estaba equivocado!");
}
else{
    System.out.println("Nop, esto no está funcionando.");
}
 }

 //public static String test(String lol){

//    return "^";
 //}
} 
