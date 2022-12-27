package CaseStudy_Module2.Models.Facility;

public abstract class Facility {
    protected String name;
    protected double s; //diện tích sử dụng
    protected double rentalCosts; //chi phí thuê
    protected int amountOfPeople; // sô lượng người
    protected String rentalType; // Loại cho thuê

    public Facility() {
    }

    public Facility(String name, double s, double rentalCosts, int amountOfPeople, String rentalType) {
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

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", s=" + s +
                ", rentalCosts=" + rentalCosts +
                ", amountOfPeople=" + amountOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
