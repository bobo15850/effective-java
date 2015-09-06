package chapter04;

public final class FinalClassTest_15 {
	private final int a;

	public FinalClassTest_15(int ini) {
		this.a = ini;
	}

	public int getA() {
		return a;
	}

	public static void main(String[] args) {
		FinalClassTest_15 finalClassTest_15 = new FinalClassTest_15(4);
		System.out.println(finalClassTest_15.getA());
	}
}