package CaseStudy_Module2.Models.Facility;

import CaseStudy_Module2.Models.Facility.Facility;

public class Villa extends Facility {
    private String roomStandard; // Tiêu chuẩn phòng
    private double sPool; // diện tích hồ bơi
    private int numberFloors; // số tầng

    public Villa(String name, double s, double rentalCosts, int amountOfPeople, String rentalType, String roomStandard, double sPool, int numberFloors) {
        super(name, s, rentalCosts, amountOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.sPool = sPool;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getsPool() {
        return sPool;
    }

    public void setsPool(double sPool) {
        this.sPool = sPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", sPool=" + sPool +
                ", numberFloors=" + numberFloors +
                ", name='" + name + '\'' +
                ", s=" + s +
                ", rentalCosts=" + rentalCosts +
                ", amountOfPeople=" + amountOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
