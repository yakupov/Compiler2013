package org.itmo.iyakupov;

import org.itmo.iyakupov.components.GenerableCode;

public class Symbol {

    private final String name;
    private final GenerableCode code;

    public Symbol(String name, GenerableCode code) {
        this.name = name;
        this.code = code;
    }

    public GenerableCode getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}