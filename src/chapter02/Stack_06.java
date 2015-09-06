package chapter02;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_06 {
	private Object[] elements;
	private int size;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack_06() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object ele) {
		ensureCapacity();
		elements[size++] = ele;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		} else {
			Object result = elements[--size];
			elements[size] = null;// 消除了过期的引用，防止了隐式内存泄漏
			return result;
		}
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, size * 2 + 1);
		}
	}
}
