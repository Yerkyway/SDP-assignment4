public class Ship implements ITransport{

    private String shipCapacity = "3000 TEUs";
    private String shipDeliveryTime = "1 month ";

    public void showSC() {
        System.out.println("Ship's capacity: "+shipCapacity +"\nShip's delivery time: "+shipDeliveryTime);
    }
    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }
}
