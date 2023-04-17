/** 
 * Дата создания 18.04.2023г
*/
package Products;
/** 
 * Базовый класс продукта
*/
public class Product{    
    /** наименование продукта */
    private String name;
    /** цена продукта*/
    private double price;
    /**
     * конструктор продукта 
     * @param name наименование продукта
     * @param price цена продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    /** получаем наименование продукта */
    public String getName(){ 
        return name;     
    } 
    /** получаем цену продукта */
    public double getPrice(){ 
        return price; 
    }
    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(double value){
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        this.price = value;
    }
    /**
     * метод переопределения формата вывода продукта на экран
     */
    @Override
    public String toString(){
        return  "Product{" +
        "name='" + name + '\'' +
        ", cost=" + price +
        '}';
    }
}