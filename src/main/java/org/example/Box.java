package org.example;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends ComparableFruit> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public List<T> getList() {
        return this.list;
    }

    public void add(T fruit) {
        list.add(fruit);
    }


    void moveTo(Box<T> box) {
        if (!box.getList().equals(list)) {
            box.getList().addAll(list);
            list.clear();
        }
    }

    float getWeight() {
        float weight = 0;
        for (T item : list) {
            weight += item.getWeight();
        }
        return weight;
    }

    boolean compare(Box<Orange> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }


    void printBox() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            for (T t : list) {
                System.out.println(t);
            }
        }
    }
}