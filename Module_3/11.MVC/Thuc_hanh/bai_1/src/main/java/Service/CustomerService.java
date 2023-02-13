package Service;

import Model.Customer;
import Repository.CustomerRepository;
import Repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{

    private ICustomerRepository iCustomerRepository = new CustomerRepository();


    @Override
    public List<Customer> finAll() {
        return iCustomerRepository.finAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Customer finById(int id) {
        return iCustomerRepository.finById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        iCustomerRepository.update(id, customer);
    }

    @Override
    public void remove(int id) {
        iCustomerRepository.remove(id);
    }
}
