package airTransport;

public abstract class Air {
    private String type;
    private String name;
    private int length;
    private int width;
    private int speed;
    private int fuelIn;
    private boolean passenger;

    {
        this.type = "No Type";
        this.name = "No Name";
        this.length = 1;
        this.width = 1;
        this.speed = 1;
        this.fuelIn = 0;
        this.passenger = false;
    }

    public Air(String type, String name, int length, int width, int speed, int fuelIn, boolean passenger) {
        this.type=type;
        this.name=name;
        this.length=length;
        this.width=width;
        this.speed=speed;
        this.fuelIn=fuelIn;
        this.passenger=passenger;
    }
    public Air() {}

    void startFly(){}
    void startLanding(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelIn() {
        return fuelIn;
    }

    public void setFuelIn(int fuelIn) {
        this.fuelIn = fuelIn;
    }

    public boolean isPassenger() {
        return passenger;
    }

    public void setPassenger(boolean passenger) {
        this.passenger = passenger;
    }
}
