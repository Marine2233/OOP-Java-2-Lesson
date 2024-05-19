public class Human extends Actor {

    public Human(String name){
        super(name);
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {super.isTakeOrder = isTakeOrder;}

    @Override
    public void setMakeOrder(boolean isMakeOrder) {super.isMakeOrder = isMakeOrder;}

    @Override
    public boolean isMakeOrder() {return super.isMakeOrder;}

    @Override
    public boolean isTakeOrder() {return super.isTakeOrder;}

    @Override
    String getName() { return super.name;}
    
}
