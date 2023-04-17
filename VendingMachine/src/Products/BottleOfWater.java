/** 
 * Дата создания 18.04.2023г
*/
package Products;
public class BottleOfWater extends Product {
    private int volume;
    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }    
    public int getVolume(){ 
        return volume;        
    } 
    public void setVolume(int value){
        volume = value;
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
        '}';
    }
}
