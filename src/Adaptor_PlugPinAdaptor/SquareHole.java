package Adaptor_PlugPinAdaptor;

public class SquareHole {
    private double width;

    public SquareHole(double width) {
        this.width = width;
    }

    public boolean fits(SquarePin squarePin){
        if(squarePin.getWidth() <= this.width){
            return true;
        }
        return false;
    }
}
