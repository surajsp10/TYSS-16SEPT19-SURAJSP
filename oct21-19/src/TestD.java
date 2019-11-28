
public class TestD {

	public static void main(String[] args) {
		BTM b = new BTM();
		b.swipe();
		int count = b.getCount();
		System.out.println("Count is"+count);
		int totalCount = b.getTotalCount();
		System.out.println("Total count is"+totalCount);
		
		BTM b1 = new BTM();
		b1.swipe();
		
	}
}
