package com.planerygmbh.springboottest.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Request {

    @NotNull(message = "Please provide a value A")
    private Float valueA;

    @NotNull(message = "Please provide a value B")
    private Float valueB;

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


}
