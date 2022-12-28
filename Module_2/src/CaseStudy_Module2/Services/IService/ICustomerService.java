package CaseStudy_Module2.Services.IService;

import CaseStudy_Module2.Models.Person.Customer;

public interface ICustomerService {
    void display();
    void add (Customer customer);
    Customer findById (String id);
    void editCustomer (Customer customer);
}
