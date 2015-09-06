package chapter02;

public class Bean_02 {
	private int a;
	private int b;
	private int c;
	private int d;

	public static class Builder {
		private int a;
		private int b;
		private int c;
		private int d;

		public Builder() {
		}

		public Builder setA(int var) {
			a = var;
			return this;
		}

		public Builder setB(int var) {
			b = var;
			return this;
		}

		public Builder setC(int var) {
			c = var;
			return this;
		}

		public Builder setD(int var) {
			d = var;
			return this;
		}

		public Bean_02 build() {
			return new Bean_02(this);
		}
	}

	private Bean_02(Builder builder) {
		this.a = builder.a;
		this.b = builder.b;
		this.c = builder.c;
		this.d = builder.d;
	}

	public int getSum() {
		return a + b + c + d;
	}
}
