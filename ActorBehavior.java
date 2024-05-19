public interface ActorBehavior {
    
    void setTakeOrder(boolean isTakeOrder);
    void setMakeOrder(boolean isMakeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
