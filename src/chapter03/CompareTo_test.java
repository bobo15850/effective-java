package chapter03;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class CompareTo_test {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("1.00");
		HashSet<BigDecimal> hashBigDecimals = new HashSet<BigDecimal>();
		hashBigDecimals.add(a);
		hashBigDecimals.add(b);
		System.out.println(hashBigDecimals);
		TreeSet<BigDecimal> treeBigDecimals = new TreeSet<BigDecimal>();
		treeBigDecimals.add(a);
		treeBigDecimals.add(b);
		System.out.println(treeBigDecimals);
		//该实例提示我们最好compareTo和equals遵守相同的约定
	}
}
