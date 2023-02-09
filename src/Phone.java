public class Phone {
    private  String brand;
    private String version;
    private int screen;
    private int memory;
    private int price;


    public Phone(int memory, int price){
        this.memory = memory;
        this.price = price;


    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getScreen() {
        return screen;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
