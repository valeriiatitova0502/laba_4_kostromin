package org.example;

public class BananaBox extends Box<Banana> {
    public BananaBox() {
        super();
    }

    void printBox() {
        if (getList().isEmpty()) {
            System.out.println("Коробка бананов пуста");
        } else {
            for (Banana b : getList()) {
                System.out.println(b);
            }
        }
    }

    boolean compare(BananaBox box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }
}