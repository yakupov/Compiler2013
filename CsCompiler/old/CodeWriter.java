package org.itmo.iyakupov;

public interface CodeWriter {

	void writeComment(String string);

	void println(String string);

	void push(String value);

	void println(String string, Object... args);

	void increaseIndention();

	void decreaseIndention();

	void writeLabel(String label0);

}
