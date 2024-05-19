import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour,QueueBehaviour{

private List<Actor> actors = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " Встал в очередь");
    }

    @Override
    public void takeOrder() {
        for (Actor actor : actors) {
            if (!actor.isMakeOrder()) {
            actor.isMakeOrder = true;
            System.out.println(actor.getName()+" cделал заказ.");
            }

        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : actors) {
            if (actor.isMakeOrder()) {
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " получил заказ.");
            }
            
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor>releaseQueaue = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor.isTakeOrder()) {
                releaseQueaue.add(actor);
                System.out.println(actor.getName()+" покинул очередь.");
            }
            
        }
        releaseFromMarket(releaseQueaue);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName()+" зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName()+" покинул магазин.");
            actors.remove(actor);
            
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
    
}
