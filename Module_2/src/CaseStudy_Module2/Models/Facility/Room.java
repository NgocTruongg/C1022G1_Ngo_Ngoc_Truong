package CaseStudy_Module2.Models.Facility;

import CaseStudy_Module2.Models.Facility.Facility;

public class Room extends Facility {

    private String freeService; //dịch vụ miễn phí

    public Room(String name, String s, String rentalCosts, String amountOfPeople, String rentalType, String freeService) {
        super(name, s, rentalCosts, amountOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    public String convertLine(){
        String COMMA = ",";
        return this.freeService + COMMA + super.convertLine();
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", name='" + name + '\'' +
                ", s=" + s +
                ", rentalCosts=" + rentalCosts +
                ", amountOfPeople=" + amountOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
