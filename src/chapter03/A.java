package chapter03;

import java.util.ArrayList;

public class A implements Cloneable {
	private int a;
	private B b;
	private ArrayList<String> aList;

	public A() {
	}

	public String toString() {
		return "a:" + a + "b:" + b + "aList:" + aList.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public A clone() {
		try {
			A result=(A) super.clone();
			result.aList=(ArrayList<String>) aList.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new AssertionError();
		}
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public ArrayList<String> getaList() {
		return aList;
	}

	public void setaList(ArrayList<String> aList) {
		this.aList = aList;
	}
}
