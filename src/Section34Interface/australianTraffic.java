package Section34Interface;

public class australianTraffic implements centralTraffic, continentalTraffic {
    public static void main(String[] args) {

        centralTraffic a = new australianTraffic();
        a.greenGo();
        a.redStop();
        a.flashYellow();

        australianTraffic at = new australianTraffic();
        at.walkOnSymbol();

        continentalTraffic ct = new australianTraffic();
        ct.trainSymbol();

    }

    @Override
    public void greenGo() {
        System.out.println("Implementation of greenGo..");
    }

    @Override
    public void redStop() {
        System.out.println("Implementation of redStop..");
    }

    @Override
    public void flashYellow() {
        System.out.println("Implementation of flashYellow..");
    }

    public void walkOnSymbol(){
        System.out.println("Walk on symbol..");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Continental traffic..");
    }
}
