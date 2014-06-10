package org.itmo.iyakupov.components;

import java.util.List;

import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.components.expr.Expression;

public class TypeChecker {
    public static boolean typeCheck(Type lValue, Type exprType) {
        return !(lValue == Type.VOID || exprType == Type.VOID) && lValue == exprType;
    }

    public static boolean typeCheck(Type lValue, Expression expression) {
        return typeCheck(lValue, expression.getType());
    }

    public static boolean typeCheck(Expression expression1, Expression expression2) {
        return typeCheck(expression1.getType(), expression2.getType());
    }

    private static boolean containsVarArg(List<Type> expected) {
    	for (Type t: expected)
    		if (t == Type.OBJECT)
    			return true;
        return false;
    }

    private static boolean checkVarArg(List<Type> expected) {
        for (int i = 0; i < expected.size(); ++i) {
            if (expected.get(i) == Type.OBJECT && i < expected.size() - 1) {
                return false;
            }
        }
        return true;
    }

    public static void argsChecker(List<Expression> actual, List<Type> expected, ErrorProcessor errors, int line) {
        boolean isVarArg = containsVarArg(expected);
        if (isVarArg) {
            errors.assertTrue(checkVarArg(expected), line, "VarArg must be last argument");
        }
        errors.assertTrue(expected.size() - (isVarArg ? 1 : 0) <= actual.size(), line,
                String.format("Function takes %d arguments", actual.size()));
        for (int i = 0; i < expected.size() - (isVarArg ? 1 : 0); ++i) {
            errors.assertTrue(TypeChecker.typeCheck(expected.get(i), actual.get(i)),
                    line, String.format("Cannot assign : %d argument", (i + 1)));
        }
    }
}