package Problem1;

public class Money {
    private final long dollars;
    private final long cents;

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

    public Money subtract(Money otherAmount){
        long totalCents = (dollars * 100) + cents;
        long otherTotalCents = (otherAmount.dollars * 100) + otherAmount.cents;
        long totalMoney =  totalCents - otherTotalCents;

        return new Money(totalMoney/ 100.0);
    }

    public int compareTo(Money otherObject){
        long totalCents = (this.dollars * 100) + this.cents;
        long otherTotalCents = (otherObject.dollars * 100) + otherObject.cents;

        return Long.compare(totalCents, otherTotalCents);
    }

    public boolean equals(Money otherObject){
        long totalCents = (this.dollars * 100) + this.cents;
        long otherTotalCents = (otherObject.dollars * 100) + otherObject.cents;

        return totalCents == otherTotalCents;
    }
}
