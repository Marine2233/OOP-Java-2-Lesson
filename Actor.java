public abstract class Actor implements ActorBehavior {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name){
        this.name = name;
    }

    abstract String getName();
}
