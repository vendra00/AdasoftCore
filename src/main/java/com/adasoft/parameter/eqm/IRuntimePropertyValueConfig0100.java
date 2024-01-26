package com.adasoft.parameter.eqm;

public interface IRuntimePropertyValueConfig0100<T> {
    String getPropertyReference();

    RuntimePropertyLimitConfig0100<T> getLimitConfiguration();

    T getRuntimeValue();
}
