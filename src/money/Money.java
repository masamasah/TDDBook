package money;

class Money implements Expression{
    protected int amount;

    protected String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    Expression plus(Money addend){
        return new Money(amount + addend.amount, this.currency);
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return this.currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
}
