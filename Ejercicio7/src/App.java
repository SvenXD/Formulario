public class App {
    public static void main(String[] args) throws Exception {
    
        printAmerican s = new printAmerican();
                printEuropean e = new printEuropean();

        s.nwwMes("Octubre");
        s.nwwAño(2023);
        s.nwwDiase("Miercoles");
        s.nwwDian(12);
            s.nspace(" ");

                    e.nwwMes("Octubre");
        e.nwwAño(2023);
        e.nwwDiase("Miercoles");
        e.nwwDian(12);
            e.nspace(" ");

        System.out.println("Americano:"+ s.diase +s.space+ s.mes +s.space+ s.dian +s.space+ s.año);
        System.out.println("Europeo: " + e.diase +e.space+ e.dian +e.space+ e.mes +e.space+ e.año);

    }
}