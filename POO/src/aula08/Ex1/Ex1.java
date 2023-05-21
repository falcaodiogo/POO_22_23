package aula08.Ex1;

public class Ex1 {

    public static void main(String[] args) {
        
        Ligeiro carro1 = new Ligeiro("AA-34-22", "BYD", "Y", 900, 40, 500);
        Taxi carro2 = new Taxi("BB-22-33", "Toyota", "Prius", 120, 4);
        PesadoMercadorias carro3 = new PesadoMercadorias("BB-Y2-66", "DAFF", "all", 2330, 123, 20000, 2349309);

        System.out.println(carro1);

        carro1.trajeto(100);
        carro1.trajeto(200);
        carro1.ultimoTrajeto();
        carro1.distanciaTotal();
        System.out.println(carro1);

        System.out.println(carro2);
        System.out.println(carro3);

        // Carro elétrico
        LigeiroEletrico carro4 = new LigeiroEletrico("AA-BB-22", "Rivian", "Camp", 800);
        System.out.println(carro4);
        carro4.autonomia();
        carro4.autonomia();
        System.out.println(carro4);
        carro4.autonomia();
        System.out.println(carro4);
        carro4.carregar(90);
        System.out.println(carro4);
        carro4.carregar(10);
        System.out.println(carro4);
    }
    
}
