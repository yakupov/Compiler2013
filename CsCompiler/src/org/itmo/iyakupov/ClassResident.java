package org.itmo.iyakupov;

import java.util.List;

import org.itmo.iyakupov.components.ClassDef;
import org.itmo.iyakupov.components.Variable;
import org.objectweb.asm.ClassWriter;

public interface ClassResident {
	public void compile(ClassWriter cw, String className, List<Variable> initExpressions, ClassDef parentClass);
}
