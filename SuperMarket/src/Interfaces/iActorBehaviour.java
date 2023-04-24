package Interfaces;

import Classes.Actor;
/**
 * iнтерфейс, описывающий поведение покупателей в магазине.
 */
public interface iActorBehaviour{
    /**
     * Установка флага создания заказа.
     * @param makeOrder флаг создания заказа.
     */
    void setMakeOrder(boolean makeOrder);   
    /**
     * Установка флага взятия заказа.
     * @param pickUpOrder флаг взятия заказа.
     */
    void setTakeOrder(boolean pickUpOrder);    
    /**
     * Получение значения флага создания заказа.
     * @return true (заказ создан) / false (нет).
     */
    boolean isMakeOrder();    
    /**
     * Получение значения флага взятия заказа.
     * @return true (заказ взят) / false (нет).
     */
    boolean isTakeOrder();    
    /**
     * Получение объекта покупателя.
     * @return объект покупатель.
     */
    Actor getActor();
}
