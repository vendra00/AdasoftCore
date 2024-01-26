package com.adasoft.parameter.eqm;

public class RuntimePropertyLimitConfig0100<T> {
    private T lowerLimit;
    private T upperLimit;
    private T expectedValue;

    public RuntimePropertyLimitConfig0100(T lowerLimitProperty, T upperLimitProperty) {
        this.lowerLimit = lowerLimitProperty;
        this.upperLimit = upperLimitProperty;
    }

    public RuntimePropertyLimitConfig0100(T expectedValueProperty) {
        this.expectedValue = expectedValueProperty;
    }

    public RuntimePropertyLimitConfig0100() {
    }

    public T getLowerLimit() {
        return this.lowerLimit;
    }

    public void setLowerLimit(T lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public T getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(T upperLimit) {
        this.upperLimit = upperLimit;
    }

    public T getExpectedValue() {
        return this.expectedValue;
    }

    public void setExpectedValue(T expectedValue) {
        this.expectedValue = expectedValue;
    }
}
