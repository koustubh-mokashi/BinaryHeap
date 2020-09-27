
public class BinaryHeap {

	private int[] values;

	private int count = 0;

	private boolean left = true;

	private int insrtPnt = 0;

	private boolean isMaxHeap = false;

	public BinaryHeap(int size, int value) {
		this.values = new int[size];
		this.values[count] = value;
	}

	public int[] getValues() {
		return values;
	}

	public void insert(int value) {
		if (left) {
			insrtPnt = 2 * count + 1;
			left = false;
		} else {
			left = true;
			insrtPnt = 2 * count + 2;
			count++;
		}
		this.values[insrtPnt] = value;
		adjustElementIfRequired(insrtPnt);
	}

	private void adjustElementIfRequired(int insrtPnt) {
		while (insrtPnt > 0) {
			int currentVal = this.values[insrtPnt];
			int parentIndex = left ? (insrtPnt - 2) / 2 : (insrtPnt - 1) / 2;
			boolean swap = (isMaxHeap && this.values[parentIndex] < currentVal) ? true
					: (this.values[parentIndex] > currentVal) ? true : false;
			if (swap) {
				int temp = this.values[parentIndex];
				this.values[parentIndex] = currentVal;
				this.values[insrtPnt] = temp;
			}
			insrtPnt = parentIndex;
		}
	}

	public void setMaxHeap(boolean isMaxHeap) {
		this.isMaxHeap = isMaxHeap;
	}

}
