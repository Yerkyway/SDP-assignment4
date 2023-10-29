public class SeaLogistic implements ILogistics{
    @Override
    public ITransport createTransport() {
        return new Ship();
    }
}
