package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseGameManager extends Games implements GameService{

    public BaseGameManager(int gameId, String gameName, String gamePrice) {
        super(gameId, gameName, gamePrice);
    }

    @Override
    public void addToCustomer(Customer customer, Games games) {
        System.out.println(games.getGameName() + " - " + customer.getFirstName() + " Kullanıcısına eklendi");
        if (games.getGameId() %2==1){
            System.out.println("Tebrikler " + games.getGameName() + " oyununuzu indirimli aldınız");
        }
        else {
            System.out.println("İndirimleri takip edin");
        }
    }

    @Override
    public void deleteToCustomer(Customer customer, Games games) {
        System.out.println(games.getGameName() + " - " + customer.getFirstName() + " Kullanıcısından silindi");
    }
}
