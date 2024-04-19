package computer;

public class Monitor {
    private int resolution;
    private String model;
    private String manufacturer;

    public Monitor(int resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + ", " + " " + " in color " + color);
    }

}
