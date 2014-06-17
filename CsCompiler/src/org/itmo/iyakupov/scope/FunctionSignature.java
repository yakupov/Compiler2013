package org.itmo.iyakupov.scope;

import java.util.Arrays;

import org.objectweb.asm.Type;


class FunctionSignature {
    private final String name;
    private final Type[] argumentType;

    public FunctionSignature(String name, Type[] argumentType) {
        this.name = name;
        this.argumentType = argumentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionSignature that = (FunctionSignature) o;
        return name.equals(that.name) && Arrays.equals(argumentType, that.argumentType);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(argumentType);
        return result;
    }
}
