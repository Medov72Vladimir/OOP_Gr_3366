/** 
 * Дата создания 18.04.2023г
*/
package VendingMachines;
import Products.Product;
import java.util.*;
/** 
 * Базовый класс автомата выдачи продуктов
*/
public class VendingMachine{
    /** вместимость автомата выдачи продуктов */
    private int volume;
    /** список продуктов */
    private List<Product> products;
    /** журнал учета покупок*/
    private List<String> workLog;
    /**
     * Конструктор 
     * @param volume вместимость автомата выдачи продуктов
     * @param products выделение памяти для списка продуктов(инициализация)
     * @param workLog выделение памяти для журнала учета покупок(инициализация)
     */
    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }  
    /** метод добавления нового продукта */
    public void addProduct(Product prod){
        products.add(prod);
    }
    /** метод дбавления в журнал записи о проведенной продаже */
    public void addSales(String line){
        workLog.add(line);
    }   
    /** метод поиска нужного продукта */
    public Product getProdByName(String name){
        for (Product product : products) {
            if (product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }
    /** метод выдачи списка всех продуктов */
    public List<Product> getProductAll(){
        return products;
    }
}