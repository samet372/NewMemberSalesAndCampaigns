package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void Save(Customer customer) {
        System.out.println(customer.getFirstName() + " Veri tabanına kaydedildi ");
    }
    public void Delete(Customer customer){
        System.out.println(customer.getFirstName() + " Veri tabanından silindi ");
    }
    public void Update(Customer customer){
        System.out.println(customer.getFirstName() + " Veri tabanı bilgileri güncellendi");
    }
}
