package airTransport;

public class Airplanes extends Air implements Refueling {
    private int numOfSeats;
    private boolean haveService;

    {
        this.numOfSeats = 1;
        this.haveService = false;
        super.setPassenger(true);
    }

    public Airplanes(String type, String name, int length, int width, int speed, int fuelIn, boolean passenger, int numOfSeats, boolean haveService) {
        super(type, name, length, width, speed, fuelIn, passenger);
        this.numOfSeats=numOfSeats;
        this.haveService=haveService;
    }

    public Airplanes(){}

    @Override
    public int fueling() {
        System.out.println("Your airplane was fueled from: " + getFuelIn() + " to " + 35 + ".000 .");
        return 35000;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isHaveService() {
        return haveService;
    }

    public void setHaveService(boolean haveService) {
        this.haveService = haveService;
    }
}
