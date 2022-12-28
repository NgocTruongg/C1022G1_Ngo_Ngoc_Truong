package CaseStudy_Module2.Repository.CustomerManagement;

import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Services.IService.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    public static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("KH-1", "Dao", "10/11/2004", "Nam", "192983728",
                "0397234711", "Dao@gmail.com", "Diamond", "Da Nang"));
        customerList.add(new Customer("KH-2", "Quynh", "1/2/1995", "Nu", "192983728",
                "0987234711", "Quynh@gmail.com", "Platinium", "Daklak"));
        customerList.add(new Customer("KH-3", "Khai", "10/11/2004", "Nam", "192983728",
                "0377235711", "Khai@gmail.com", "Gold", "Quang Binh"));
    }

    @Override
    public void display() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);

    }

    @Override
    public Customer findById(String id) {
        for (Customer c : customerList) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void editCustomer(Customer customer) {
        for (int i = 0; i < customerList.size() ; i++) {
            if (customer.getId().equals(customerList.get(i).getId())) {
                customerList.set(i, customer);
            }
        }
    }
}
