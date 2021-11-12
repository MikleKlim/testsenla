package senlatask.fifth;

public abstract class Common {
    protected int volume, cost;
    
    protected Common(int volume, int cost){
        this.volume = volume;
        this.cost = cost;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public int getCost(){
        return cost;
    }
}
