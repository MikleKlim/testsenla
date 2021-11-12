package senlatask.fifth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Bag bag = new Bag(2, 2);
        Box box = new Box(4, 2);
        Ball ball = new Ball(10, 5);
        Ball ball2 = new Ball(1, 5);
        Box box2 = new Box(20, 20);
        List<Common> items = new ArrayList<>();
        items.add(bag);
        items.add(box);
        items.add(box2);
        items.add(ball);
        items.add(ball);
        items.add(ball2);
        
        Safe safe = new Safe(40);
        safe.addItems(items);
        safe.showItems();
        
    }
}
