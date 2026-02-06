package Problem1;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount){
        dollars = (long) amount;
        cents = (long) ((amount * 100) % 100);
    }

    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }


}
