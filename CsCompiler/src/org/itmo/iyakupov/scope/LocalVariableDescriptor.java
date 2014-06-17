package org.itmo.iyakupov.scope;

import org.objectweb.asm.Type;

public class LocalVariableDescriptor {
    private final int index;
    private final Type type;

    public LocalVariableDescriptor(int index, Type type) {
        this.index = index;
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public Type getType() {
        return type;
    }
}
