
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    @Override
    public Money clone() {
        Money newMoney = new Money(this.euros, this.cents);
        return newMoney;
    }

    public Money plus(Money addition) {
        int totE = this.euros + addition.euros;
        int totC = this.cents + addition.cents;
        
        
        Money tot = new Money(totE, totC);

        return tot;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            }
        }

        return false;
    }
 
    public Money minus(Money decreaser){
        int totE = this.euros - decreaser.euros;
        int totC = this.cents - decreaser.cents;
        if(totC < 0){
            totC = 100 - Math.abs(totC);
            totE--;
        }
        Money newTot = null;
        if(totE < 0 ){
           newTot = new Money(0,0);
            return newTot;
        }
        newTot = new Money(totE,totC);
        return newTot;
    }
}
