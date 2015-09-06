package chapter04;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class ClassTest_13 {
	public static final String[] strArray = new String[] { "123", "234", "456" };
	private static final Thing[] PRIVATE_VALUES = {};
	public static final List VALUES = (List) Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

	public static final Thing[] values() {
		return PRIVATE_VALUES.clone();
	}

	private class Thing {

	}
}
