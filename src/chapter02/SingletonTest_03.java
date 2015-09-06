package chapter02;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonTest_03 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonTest_03 instance;

	private transient int i;
	private transient String s;

	private SingletonTest_03() {
	}

	public static SingletonTest_03 getInstance() {
		if (instance == null) {
			instance = new SingletonTest_03();
		}
		return instance;
	}

	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
