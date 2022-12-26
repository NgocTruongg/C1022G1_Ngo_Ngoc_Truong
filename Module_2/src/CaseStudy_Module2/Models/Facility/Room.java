package CaseStudy_Module2.Models;

public class Room extends Facility {

    private String freeService; //dịch vụ miễn phí

    public Room(String name, double s, double rentalCosts, int amountOfPeople, String rentalType, String freeService) {
        super(name, s, rentalCosts, amountOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
