package airTransport;

public interface Refueling {
    default int fueling() {
        System.out.println("Your <transport> was fueled from: " + "<fuel>" + " to " + 35 + ".000 .");
        return 35000;
    }
}
