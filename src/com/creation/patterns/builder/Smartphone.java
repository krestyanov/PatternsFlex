package com.creation.patterns.builder;

public class Smartphone {
    private String name;
    private int price;
    private int memory;
    private Model model;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                ", model=" + model +
                '}';
    }
}
