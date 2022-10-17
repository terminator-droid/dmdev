package com.dudev.generics.practice.task1;

public class Pair<K, V> {
    private K firstVariable;
    private V secondVariable;

    public Pair(K firstVariable, V secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstVariable=" + firstVariable +
                ", secondVariable=" + secondVariable +
                '}';
    }

    public void setFirstVariable(K firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(V secondVariable) {
        this.secondVariable = secondVariable;
    }

    public K getFirstVariable() {
        return firstVariable;
    }

    public V getSecondVariable() {
        return secondVariable;
    }
}

