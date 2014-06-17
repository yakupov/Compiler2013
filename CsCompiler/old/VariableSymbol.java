package org.itmo.iyakupov;

import org.itmo.iyakupov.components.MyType;
import org.itmo.iyakupov.components.Variable;

public class VariableSymbol extends Symbol {

    public VariableSymbol(Variable var) {
        //super(var.getName(), var);
    	super(var.getName(), null);
    }

    public MyType getType() {
        return ((Variable) getCode()).getType();
    }
}
