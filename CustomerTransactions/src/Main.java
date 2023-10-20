import Abstract.BaseCustomerManager;
import Abstract.BaseGameManager;
import Concrete.Gamer;
import Concrete.SubscribeCustomer;
import Entities.Customer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Customer fatih = new Customer();

        fatih.setId(1);
        fatih.setFirstName("Fatih Samed");
        fatih.setLastName("Taylan");
        fatih.setNationalityId("12345678912");
        fatih.setBirthYear(LocalDateTime.of(1987,6,5,4,3));

        BaseCustomerManager customerManager = new SubscribeCustomer();

        customerManager.Save(fatih);
        customerManager.Update(fatih);
        customerManager.Delete(fatih);

        BaseGameManager gameManager = new Gamer(1, "God Of War", "1500 TL");

        gameManager.addToCustomer(fatih, gameManager);
    }
}