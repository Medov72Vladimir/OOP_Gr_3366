/** 
 * Дата создания 18.04.2023г
*/
import Products.BottleOfWater;
import Products.Product;
import VendingMachines.VendingMachine;
import Products.DrinksAreHot;
public class App {
    public static void main(String[] args) throws Exception{
        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);
        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));        
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachine.addProduct(new DrinksAreHot("Кофе латте", 90.00, 0.30, 65));
        itemMachine.addProduct(new DrinksAreHot("Кофе эспрессо", 45.00, 0.15, 75));

        for (Product product : itemMachine.getProductAll()){
            System.out.println(product.toString());
        }
    }
}
