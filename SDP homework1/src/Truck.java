public class Truck implements ITransport{
    private String truckCapacity = "20 tones";
    private String truckDeliveryTime = "2 weeks ";

    public void showTC() {
        System.out.println("Truck's capacity: "+truckCapacity +"\nTruck's delivery time: "+truckDeliveryTime);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }
}
