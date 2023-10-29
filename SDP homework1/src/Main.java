import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Ship ship = new Ship();
        System.out.println("Characteristics of transports:s");
        truck.showTC();
        ship.showSC();
        System.out.println("Select delivery type. (T/S)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("T")) {
            ILogistics roadLogistic = new RoadLogistic();
            ITransport roadTransport = roadLogistic.createTransport();
            roadTransport.deliver();
        } else if(str.equalsIgnoreCase("S")){
        ILogistics seaLogistic = new SeaLogistic();
        ITransport seaTransport = seaLogistic.createTransport();
        seaTransport.deliver();
        }
    }
}
