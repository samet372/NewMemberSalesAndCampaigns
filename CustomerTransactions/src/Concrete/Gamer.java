package Concrete;

import Abstract.BaseGameManager;
import Entities.Customer;

public class Gamer extends BaseGameManager {
    public Gamer(int gameId, String gameName, String gamePrice) {
        super(gameId, gameName, gamePrice);
    }
}
