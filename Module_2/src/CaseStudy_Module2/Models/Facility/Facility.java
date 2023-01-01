package CaseStudy_Module2.Models.Facility;

public abstract class Facility {
    private String idService;
    private String name;
    private String s; //diện tích sử dụng
    private String rentalCosts; //chi phí thuê
    private String amountOfPeople; // sô lượng người
    private String rentalType; // Loại cho thuê

    public Facility() {
    }

    public Facility(String idService, String name, String s, String rentalCosts, String amountOfPeople,
                    String rentalType) {
        this.idService = idService;
        this.name = name;
        this.s = s;
        this.rentalCosts = rentalCosts;
        this.amountOfPeople = amountOfPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(String amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String convertLine() {
        String COMMA = ",";
        return this.idService + COMMA + this.name + COMMA + this.s + COMMA + this.rentalCosts + COMMA + this.amountOfPeople + COMMA + this.rentalCosts;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", name='" + name + '\'' +
                ", s='" + s + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", amountOfPeople='" + amountOfPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
