public class RewardValue {
    double cash;
    int miles;

  public   RewardValue(double cash){
        this.cash=cash;
        // converting cash into miles
        this.miles=(int)(cash*285.71);
    }

    public RewardValue(int miles){
        this.miles=miles;
        // converting miles into cash
        this.cash=miles*0.0035;
    }

    public double getCashValue(){
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }

   
}
