import java.util.Scanner;
public class isTriangle {
    public static void main(String[] args) throws Exception {

Scanner teclado = new Scanner(System.in);
int  isTriangle[]  = {0, 0, 0, 0}; 
 isTriangle[1]  = teclado.nextInt();
 isTriangle[2] = teclado.nextInt();
 isTriangle[3] = teclado.nextInt();


 if(isTeet(isTriangle) == true){

 System.out.println("Se puede hacer un triangulo");
}
else
{
    System.out.println("No se puede hacer un triangulo :(");
}
 }  
 public static boolean isTeet(int isTriangle[] ) {
    if (isTriangle[1]+isTriangle[2] < isTriangle[3] || isTriangle[1]+isTriangle[3] < isTriangle[2] || isTriangle[2]+isTriangle[3] <isTriangle[1])  
    {
return false;
    }
    else
    {
        return true;
    }
}




 }   
 