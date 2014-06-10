package org.itmo.iyakupov.components;

public enum Type {
    INT {
        @Override
        public String getDescriptor() {
            return "I";
        }

        @Override
        public boolean hasDefaultValue() {
            return true;
        }

        @Override
        public String defaultValue() {
            return "0";
        }

        @Override
        public String getReturnCommand() {
            return "ireturn";
        }

        @Override
        public String load() {
            return "iload";
        }

        @Override
        public String store() {
            return "istore";
        }
    },
    STRING {
        @Override
        public String getDescriptor() {
            return "[C";
        }

        @Override
        public boolean hasDefaultValue() {
            return true;
        }

        @Override
        public String defaultValue() {
            return null;
        }

        @Override
        public String getReturnCommand() {
            return "areturn";
        }

        @Override
        public String load() {
            return "aload";
        }

        @Override
        public String store() {
            return "astore";
        }
    },
    VOID {
        @Override
        public String getDescriptor() {
            return "V";
        }

        @Override
        public boolean hasDefaultValue() {
            return false;
        }

        @Override
        public String defaultValue() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getReturnCommand() {
            return "return";
        }

        @Override
        public String load() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String store() {
            throw new UnsupportedOperationException();
        }
    },
    OBJECT {
        @Override
        public String getDescriptor() {
            return "[Ljava/lang/Object;";
        }

        @Override
        public boolean hasDefaultValue() {
            return true;
        }

        @Override
        public String defaultValue() {
            return "null";
        }

        @Override
        public String getReturnCommand() {
            return "areturn";
        }

        @Override
        public String load() {
            return "aload";
        }

        @Override
        public String store() {
            return "astore";
        }
    };

    public abstract String getDescriptor();
    public abstract boolean hasDefaultValue();
    public abstract String defaultValue();
    public abstract String getReturnCommand();
    public abstract String load();
    public abstract String store();

    public static Type getInstance(String type) {
        return Type.valueOf(type.toUpperCase());
    }
}