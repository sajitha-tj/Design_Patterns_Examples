package Adaptor_PlugPinAdaptor;

public class Main {
    public static void main(String[] args) {
        SquareHole squareHole = new SquareHole(5);
        SquarePin squarePin = new SquarePin(5);
        RoundPin roundPin = new RoundPin(5);

        System.out.println("square pin fits square hole: " + squareHole.fits(squarePin));
        // System.out.println("round pin fits square hole: " + squareHole.fits(roundPin));  //-- This gives an error since SquareHole does not support SquarePin

        RoundToSquareAdaptor roundToSquareAdaptor = new RoundToSquareAdaptor(roundPin);
        System.out.println("round pin fits square hole (with adaptor): " + squareHole.fits(roundToSquareAdaptor)); // -- This works since RoundToSquareAdaptor supports SquarePin


    }
}
