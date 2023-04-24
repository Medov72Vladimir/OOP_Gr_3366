import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;
/**
 * Главный класс.
 */
public class App {
    /**
     * Главный метод (точка входа).
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception {
       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Vova");
       iActorBehaviour item2 = new SpecialClient("Petr", 1000);
       iActorBehaviour item3 = new PromoClient("Ivan", "1+1=3", 10);
       /**
        * Обычный клиент.
        */
       market.acceptToMarket(item1);
       market.update();
       /**
        * VIP клиент.
        */
       market.acceptToMarket(item2);
       market.takeOrder();
       market.giveOrder();
       market.releaseFromQueue();
         /*
        * Акционный клиент.
        */
       market.acceptToMarket(item3);       
    }
}
