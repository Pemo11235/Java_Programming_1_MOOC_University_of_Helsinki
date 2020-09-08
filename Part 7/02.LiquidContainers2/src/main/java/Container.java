/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Container {

    private int liters;

    public Container() {
        this.liters = 0;

    }

    public int checkHundreds(int amount) {
        if (amount > 100) {
            return 100;
        }
        return amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liters += this.checkHundreds(amount);
            this.liters = this.checkHundreds(this.liters);
        }
    }

    public void move(int amount, Container second) {
        if (amount > 0) {
            if (!this.isEmpty()) {
                if (amount >= 100) {
                    second.add(100);
                    this.remove(100);
                } else if (amount > this.liters) {
                    second.add(this.liters);
                    this.remove(this.liters);
                } else {
                    second.add(amount);
                    this.remove(amount);
                }
            }
        }
    }

    public void remove(int amount) {
        if (!this.isEmpty()) {
            if (amount >= 100) {
                this.liters -= 100;
            } else if (amount > this.liters) {
                this.liters = 0;
            } else {
                this.liters -= amount;
            }
        }
    }

    public int contains() {
        return liters;
    }

    public boolean isEmpty() {
        if (this.liters > 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(this.liters) + "/100";
    }

}
