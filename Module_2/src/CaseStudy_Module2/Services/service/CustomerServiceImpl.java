package CaseStudy_Module2.Services.service;

import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Repository.CustomerManagement.CustomerRepository;
import CaseStudy_Module2.Repository.CustomerManagement.ICustomerRepository;
import CaseStudy_Module2.Services.IService.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
   ICustomerRepository iCustomerRepository =  new CustomerRepository();
    @Override
    public void display() {
        iCustomerRepository.display();
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }

    @Override
    public Customer findById(String id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void editCustomer(Customer customer) {
        iCustomerRepository.editCustomer(customer);

    }

}
