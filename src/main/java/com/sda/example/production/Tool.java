package com.sda.example.production;

import java.util.Objects;

public class Tool {

    private int weight ;

    private String name ;

    public Tool(){}

    public Tool(int weight , String name){

        this.weight = weight ;

        this.name = name ;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tool)) return false;
        Tool tool = (Tool) o;
        return getWeight() == tool.getWeight() &&
                Objects.equals(getName(), tool.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getWeight(), getName());
    }

    @Override
    public String toString() {
        return "Tool{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
