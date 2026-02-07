package Problem1;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        owner = newCardHolder;
        creditLimit = new Money(limit);
        balance = new Money(0);
    }

    public Money getBalance(){
        this.balance = new Money(balance);
        return this.balance;
    }

    public Money getCreditLimit(){
        this.creditLimit = new Money(creditLimit);
        return this.creditLimit;
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        Money tempBalance = balance.add(amount);
        int result = tempBalance.compareTo(creditLimit);

        if(result == 1){
            System.out.println("Charge declined");
        } else if (result == -1 || result == 0) {
            System.out.println("Charge successful");
            balance = balance.add(amount);
        }
    }
}
