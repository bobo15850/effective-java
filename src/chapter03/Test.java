package chapter03;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.setC(3);
		B b = new B();
		b.setB(2);
		b.setC(c);
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("first");
		strList.add("second");
		A a = new A();
		a.setA(1);
		a.setB(b);
		a.setaList(strList);
		A a_copyA = a.clone();
		a_copyA.getaList().set(0, "new");
		System.out.println(a);
		System.out.println(a_copyA);
	}

	@Override
	public boolean equals(Object o) {
		return false;
	}
}
