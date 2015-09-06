package chapter02;

public class Test {
	public static void main(String[] args) {
		Bean_02 bean = new Bean_02.Builder().setA(3).setB(4).setC(5).setD(6).build();
		System.out.println(bean.getSum());
		Elvis_03.INSTANCE.setA(5);
		Elvis_03.INSTANCE.setB(7);
		System.out.println(Elvis_03.INSTANCE.getSum());
	}
}
