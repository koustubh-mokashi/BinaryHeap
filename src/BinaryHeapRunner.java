import java.util.Arrays;

public class BinaryHeapRunner {

	public static void main(String arg[]) {
		BinaryHeap binaryHeap = new BinaryHeap(10, 1);
		binaryHeap.setMaxHeap(true);
		binaryHeap.insert(2);
		binaryHeap.insert(3);
		binaryHeap.insert(4);
		binaryHeap.insert(5);
		binaryHeap.insert(6);
		binaryHeap.insert(7);
		binaryHeap.insert(8);
		binaryHeap.insert(9);
		binaryHeap.insert(10);
		Arrays.stream(binaryHeap.getValues()).forEach(System.out::print);
	}
}
