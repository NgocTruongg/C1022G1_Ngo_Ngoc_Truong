package CaseStudy_Module2.Models.Facility;


public class Villa extends Facility {
    private String roomStandard; // Tiêu chuẩn phòng
    private String sPool; // diện tích hồ bơi
    private String numberFloors; // số tầng

    public Villa() {
    }

    public Villa(String idService, String name, String s, String rentalCosts, String amountOfPeople, String rentalType, String roomStandard, String sPool, String numberFloors) {
        super(idService, name, s, rentalCosts, amountOfPeople, rentalType);
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

    public String getsPool() {
        return sPool;
    }

    public void setsPool(String sPool) {
        this.sPool = sPool;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    public String covertLine() {
        String COMMA = ",";
        return super.convertLine() + COMMA + this.roomStandard + COMMA + this.sPool + COMMA + this.numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", sPool='" + sPool + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
