package Adaptor_PlugPinAdaptor;

public class RoundToSquareAdaptor extends SquarePin{
    private RoundPin roundPin;

    public RoundToSquareAdaptor(RoundPin roundPin) {
        this.roundPin = roundPin;
    }

    @Override
    public double getWidth(){
        return roundPin.getRadius();
    }
}
