package CaseStudy_Module2.Models.Facility;

import CaseStudy_Module2.Models.Facility.Facility;

public class Room extends Facility {

    private String freeService; //dịch vụ miễn phí

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String name, String s, String rentalCosts,
                String amountOfPeople, String rentalType, String freeService) {
        super(idService, name, s, rentalCosts, amountOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String convertLine() {
        String COMMA = ",";
        return super.convertLine() + COMMA + this.freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
