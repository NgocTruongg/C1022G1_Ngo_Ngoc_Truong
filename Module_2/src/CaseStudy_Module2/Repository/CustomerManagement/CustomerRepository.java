package CaseStudy_Module2.Repository.CustomerManagement;

import CaseStudy_Module2.Data.ReadFile.ReadFile;
import CaseStudy_Module2.Data.WriteFile.WriteFile;
import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Services.IService.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    public static List<Customer> customerList = new ArrayList<>();
    public static final String PATH_CUSTOMER ="src\\CaseStudy_Module2\\Data\\FileCSV\\customer.csv";

    static {
        customerList.add(new Customer("KH-1", "Dao", "10/11/2004", "Nam", "192983728",
                "0397234711", "Dao@gmail.com", "Diamond", "Da Nang"));
        customerList.add(new Customer("KH-2", "Quynh", "1/2/1995", "Nu", "192983728",
                "0987234711", "Quynh@gmail.com", "Platinium", "Daklak"));
        customerList.add(new Customer("KH-3", "Khai", "10/11/2004", "Nam", "192983728",
                "0377235711", "Khai@gmail.com", "Gold", "Quang Binh"));
    }
    public void writeFile(List<Customer> customerList) {
        WriteFile.writeFileCustomer(PATH_CUSTOMER,customerList);
    }
    @Override
    public void display() {
        customerList = ReadFile.readFileCustomer(PATH_CUSTOMER);
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList = ReadFile.readFileCustomer(PATH_CUSTOMER);
        customerList.add(customer);
        writeFile(customerList);
        customerList.clear();

    }

    @Override
    public Customer findById(String id) {
        customerList = ReadFile.readFileCustomer(PATH_CUSTOMER);
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getId().equals(id)) {
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void editCustomer(Customer customer) {
        customerList = ReadFile.readFileCustomer(PATH_CUSTOMER);
        for (int i = 0; i < customerList.size() ; i++) {
            if (customer.getId().equals(customerList.get(i).getId())) {
                customerList.set(i, customer);
            }
        }
        writeFile(customerList);
        customerList.clear();
    }
}
