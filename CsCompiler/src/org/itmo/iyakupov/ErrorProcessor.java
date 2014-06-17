package org.itmo.iyakupov;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ErrorProcessor {
	private final Log log = LogFactory.getLog(getClass());
	//private final boolean throwOnFailedAss = false;
	private final boolean throwOnFailedAss = true;
	
	public void assertEquals(int i, int j, int line, String string) {
		if (i != j) {
			String errMsg = String.format("line %d: assertion failed: %d != %d. Message: %s", line, i, j, string); 
			log.error(errMsg);
			if (throwOnFailedAss)
				throw new RuntimeException(errMsg);
		}
	}

	public void assertTrue(boolean b, int line, String string) {
		if (!b) {
			String errMsg = line + " : assertion failed (false). Text: " + string;
			log.error(errMsg);
			if (throwOnFailedAss)
				throw new RuntimeException(errMsg);
		}
	}

	public void fail(int line, String string) {
		String errMsg = line + " : " + string;
		log.error(errMsg);
		if (throwOnFailedAss)
			throw new RuntimeException(errMsg);	
	}

}
