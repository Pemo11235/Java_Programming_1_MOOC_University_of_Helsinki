
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.getTotalPrice() - compared.getTotalPrice());
    }

    public int getTotalPrice() {
        return this.squares * this.princePerSquare;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare > compared.getPrincePerSquare()){
            return true;
        } else {
            return false;
        }
    }
}
