package com.planerygmbh.springboottest.models;

public class Response {
    private Float valueA;
    private Float valueB;
    private Float multiplicationResult;

    public Response(Float valueA, Float valueB, Float multiplicationResult) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.multiplicationResult = multiplicationResult;
    }

    public Float getValueA() {
        return valueA;
    }

    public void setValueA(Float valueA) {
        this.valueA = valueA;
    }

    public Float getValueB() {
        return valueB;
    }

    public void setValueB(Float valueB) {
        this.valueB = valueB;
    }

    public Float getMultiplicationResult() {
        return multiplicationResult;
    }

    public void setMultiplicationResult(Float multiplicationResult) {
        this.multiplicationResult = multiplicationResult;
    }
}
