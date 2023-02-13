package Service;

import Model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();
    void save(Customer customer);
    Customer finById(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
