package Abstract;

import Entities.Customer;

public interface CustomerService {
    void Save(Customer customer);
    void Delete(Customer customer);
    void Update(Customer customer);
}
