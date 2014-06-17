package org.itmo.iyakupov;

import org.objectweb.asm.MethodVisitor;

public interface MethodResident {
	public void compile(MethodVisitor mv);
}
