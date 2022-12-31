package CaseStudy_Module2.Models.Facility;

public abstract class Facility {
    protected String name;
    protected String s; //diện tích sử dụng
    protected String rentalCosts; //chi phí thuê
    protected String amountOfPeople; // sô lượng người
    protected String rentalType; // Loại cho thuê

    public Facility() {
    }

    public Facility(String name, String s, String rentalCosts, String amountOfPeople, String rentalType) {
        this.name = name;
        this.s = s;
        this.rentalCosts = rentalCosts;
        this.amountOfPeople = amountOfPeople;
        this.rentalType = rentalType;
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
        return this.name + COMMA + this.s + COMMA + this.rentalCosts + COMMA + this.amountOfPeople +COMMA +this.rentalCosts;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", s='" + s + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", amountOfPeople=" + amountOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

}
