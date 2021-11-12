package senlatask.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Safe {
    
    private int volume;
    
    private List<Common> items = new ArrayList<>();
    
    public Safe(int volume){
        this.volume = volume;
    }
    
    public void addItems(List<Common> items){
        int summ = 0, i = 0;
        items.sort(Comparator.comparing(Common::getCost));
        Collections.reverse(items);
        while(summ<this.volume){
            summ+=items.get(i).getVolume();
            i++;
        }
        
        System.out.println();
        
        for(int j = 0; j<i; j++){
            this.items.add(items.get(j));
        }
    }
    
    public void showItems(){
        for(Common c: items){
            System.out.println(c.getCost() + "\t" + c.getVolume());
        }
    }
}
