/** 
 * Дата создания 18.04.2023г
*/
package Products;
/** 
 * Базовый класс напитков
*/
public class DrinksAreHot extends Product{
    /** температура напитка */
    private int temp;
    /** объем */
    private double volume;
    /**
     * конструктор напитка 
     * @param name наименование напитка
     * @param price цена напитка
     * @param volume объем
     * @param temp температура напитка
     */
    public DrinksAreHot(String name, double price, Double volume, int temp){
        super(name, price);
        this.volume = volume;
        this.temp = temp;
        /** генерация ошибки ввода температуры*/
        if ((temp <= 0) || (temp >= 100)){
            throw new IllegalStateException(String.format("Температура указана некорректно: %d", temp));
        }
    }
    /**
     * устанавливаем нужную температуру
     * @param value температура
     */
    public void setTemp(int value){
        /** генерация ошибки ввода температуры*/
        if (value <= 0) {
            throw new IllegalStateException(String.format("Темпереатура указана некорректно: %d", value));
        }
        temp = value;
    }
     /** метод получения температуры напитка */
     public int getTemp(){ 
        return temp;         
    } 
    /**
     * метод установки объема напитка
     * @param value объем
     */
    public void setVolume(double value){
        volume = value;
    }
     /** метод получения объема напитка */
    public double getVolume(){ 
        return volume;         
    } 
    /**
     * метод переопределения формата вывода продукта на экран
     */
    @Override
    public String toString(){
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", temperature=" + temp +
        '}';
    }
}
