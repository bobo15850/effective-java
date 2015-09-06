package chapter03;

public class HashTable_11 implements Cloneable {

	private Entry[] buckets;

	private static class Entry {
		final Object key;
		Object value;
		Entry next;

		Entry(Object key, Object value, Entry next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		Entry deepCopy() {
			return new Entry(key, value, next == null ? null : next.deepCopy());// 用递归方式实现深拷贝
		}

		Entry deepCopy_iterat() {
			Entry result = new Entry(key, value, next);
			for (Entry p = result; p.next != null; p = p.next) {
				p.next = new Entry(p.next.key, p.next.value, p.next.next);
			}
			return result;
		}
	}

	public HashTable_11 clone() {
		try {
			HashTable_11 result = (HashTable_11) super.clone();
			result.buckets = new Entry[buckets.length];
			for (int i = 0; i < buckets.length; i++) {
				if (buckets[i] != null) {
					result.buckets[i] = buckets[i].deepCopy();
					// 两种深拷贝方式都可以，前者为递归，后者为迭代
					result.buckets[i] = buckets[i].deepCopy_iterat();
				}
			}
			return result;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new AssertionError();
		}
	}
}
