package chapter02;

public enum Elvis_03 {
	INSTANCE;

	private int a;
	private int b;

	public int getSum() {
		return a + b;
	}

	public void setA(int var) {
		this.a = var;
	}

	public void setB(int b) {
		this.b = b;
	}
}
