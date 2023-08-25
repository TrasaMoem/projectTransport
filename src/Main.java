import airTransport.Airplanes;

public class Main {

    public static void main(String[] args) {
        Airplanes airplane1 = new Airplanes();
        airplane1.setType("Rg-99");
        airplane1.setHaveService(true);
        airplane1.setFuelIn(airplane1.fueling());
        System.out.println(airplane1.getType() + "   " + airplane1.getFuelIn() + "   " + airplane1.isHaveService() + "   " +
                airplane1.isPassenger());
    }
}