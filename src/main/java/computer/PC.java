package computer;

public class PC {
    Case theCase;
     Motherboard motherboard;
     Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(int x, int y, String color){
        monitor.drawPixel(5,10, "blue");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of " +
                "the pc on sale today...");
        System.out.println(theCase);
        System.out.println(monitor);
        System.out.println(motherboard);
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo(5,15, "red");
        motherboard.loadProgram("java");
    }
}
