package computer;

public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("case","HP","battery");
        Motherboard motherboard = new Motherboard("x","y", 16, 8,"idk");
        Monitor monitor = new Monitor(1080,"X", "alienware");

        PC juansPc = new PC(theCase, motherboard, monitor);
        juansPc.powerUp();
        juansPc.description();
    }
}
