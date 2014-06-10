package org.itmo.iyakupov;

import org.itmo.iyakupov.components.Type;
import org.itmo.iyakupov.components.Variable;

public class VariableSymbol extends Symbol {

    public VariableSymbol(Variable var) {
        super(var.getName(), var);
    }

    public Type getType() {
        return ((Variable) getCode()).getType();
    }
}
