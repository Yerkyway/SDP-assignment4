public class RoadLogistic implements ILogistics{
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
