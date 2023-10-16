public class time {
    public static void main(String[] args) throws Exception {
int hora = 0;
int hora2 = hora*3600;
int minutos = 8;
int minutos2 = minutos*60;
int segundos = 33;
int tiempomedia = 0;
tiempomedia = hora2+segundos+minutos2;

double diat = 0.001157407407*tiempomedia;

//23m   54s 1434

System.out.println("Tiempo desde medianoche: "+tiempomedia+ " segundos");
System.out.println("Tiempo para que se acabe el dia: "+(86400-tiempomedia));
System.out.println("Porcentaje que ha pasado del dia: "+diat+"%");
System.out.println("Tiempo desde que empeze a trabajar: "+(1434-tiempomedia)+ " segundos");

//Cambie los valores de hora, minuto y segundo para reflejar la hora actual. 
//Luego escriba un código para calcular el tiempo transcurrido desde que comenzó a trabajar en este ejercicio.


    
        }
}
