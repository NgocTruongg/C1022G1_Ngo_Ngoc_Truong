package CaseStudy_Module2.Models.Person;

public class Booking {
    private int idBooking;
    private String startDay;
    private String endDate;
    private String idCustomer;
    private String serviceName;

    public Booking() {
    }

    public Booking(int idBooking, String startDay, String endDate, String idCustomer, String serviceName) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
