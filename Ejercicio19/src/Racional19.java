import java.util.Scanner;
public class Racional19 {
  public static  int num;
   public static int deno;
   public static int nnum;
   public static int ddeno;
     public static int nnnum;
   public static int dddeno;
   public static int nega;
   public static double doublenum;
   public static double doubledeno;
   public static int keep;
   public static int mxd;
   public static Scanner teclado = new Scanner(System.in);
   public static         Racional19 a = new Racional19(0,1);

    public static void main(String[] args) throws Exception {
    
    
System.out.println("Coloque el numerador y denominador");
a.setNewnum(val2());
a.setNewden(val2());
a.negar(nnum);
a.invertir(a.getDdeno(),a.getNnum());
a.toDouble(Double.valueOf(a.getNnum()), Double.valueOf(a.getDdeno()));
a.reducir(a.getNnum(), a.getDdeno());


System.out.println("Constructor con 0 y 1");
a.toString();
a.printRational();
System.out.println("Constructor que toma dos argumentos");
System.out.println(a.getNnum()+"/"+a.getDdeno());
System.out.println("Metodo que invierte");
System.out.println(a.nnnum+"/"+a.dddeno);
System.out.println("Metodo con signo contrario");
System.out.println(a.nega+"/"+a.getDdeno());
System.out.println("Numero a double");
System.out.println(a.doublenum +"/"+a.doubledeno );
System.out.println("Maximo comun divizor");

System.out.println(a.mxd);


    }

    Racional19(int newnum, int newdeno){

num = newnum;
deno = newdeno;
    } 
//ints creo lol
    public void printRational(){
System.out.println(num+"/"+deno);
    } 
public void  negar(int neg){
this.nega = neg*-1;
}
public void  invertir(int inum, int ideno){
    this.nnnum = inum;
    this.dddeno = ideno;
}

    public void setNewnum(int Newnum) {
 this.nnum = Newnum;
    }

       public void setNewden(int Newden) {
this.ddeno = Newden;


    }

public void toDouble(double dnum, double deno){
this.doublenum =  dnum;
this.doubledeno =  deno;
}
public void reducir(int numerador, int denominador){

    while (denominador != 0){
this.keep = denominador;
    denominador = numerador%denominador;
    numerador = keep;

}
this.mxd = numerador;
}

    //no inst
    public static int getNnum() {
        return nnum;
    }

    public static int getDdeno() {
        return ddeno;
    }
public String toString()
{
    return num +"/"+deno;
}
public static int val2()
{
    return teclado.nextInt();
}
}