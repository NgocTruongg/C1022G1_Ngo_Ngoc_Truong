package CaseStudy_Module2.Models.Person;

public class Customer extends Person {
        private String customerType;
        private String address;

    public Customer() {

    }

    public Customer(String id, String name, String dateBirth, String sex, String cMND, String numberPhone,
                    String email, String customerType, String address) {
        super(id, name, dateBirth, sex, cMND, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
