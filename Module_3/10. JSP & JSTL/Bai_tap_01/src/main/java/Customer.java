public class Customer {
    private String name;
    private String dateOfBirthday;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(String name, String dateOfBirthday, String address, String img) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
