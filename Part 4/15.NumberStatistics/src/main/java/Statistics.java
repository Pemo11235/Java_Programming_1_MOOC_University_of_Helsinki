
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int num) {
        this.count++;
        this.sum += num;
    }

    public int getCount() {
        return this.count;
    }
    
     public int sum() {
        return this.sum;
    }

    public double average() {
        return (this.count>0? 1.0*this.sum()/this.getCount(): 0);
    }
}
