package Abstract;

import Entities.Customer;
import Entities.Games;

public interface GameService {
    void addToCustomer(Customer customer, Games games);
    void deleteToCustomer(Customer customer, Games games);
}
