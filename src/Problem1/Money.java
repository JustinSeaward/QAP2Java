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

    public Money add(Money otherAmount){
        long totalCents = (dollars * 100) + cents;
        long otherTotalAmount = (otherAmount.dollars * 100) + otherAmount.cents;
        long totalMoney = totalCents + otherTotalAmount;

        return new Money(totalMoney / 100.0);
    }
}
