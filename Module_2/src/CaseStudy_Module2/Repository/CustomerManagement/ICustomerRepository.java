package CaseStudy_Module2.Repository.CustomerManagement;

import CaseStudy_Module2.Models.Person.Customer;

public interface ICustomerRepository {
    void display();
    void add (Customer customer);
    Customer findById (String id);
    void editCustomer (Customer customer);
}
