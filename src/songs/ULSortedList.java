package songs;

import java.util.Comparator;
/**
 * 
 * @author Wahl_D
 *
 * @param <E>
 */

public class ULSortedList<E> implements Cloneable {

	int capacity;
	int size;
	E[] data;
	Comparator<E> cmp;

	public ULSortedList(Comparator cmp) {
		capacity = 16;
		size = 0;
		data = (E[]) new Object[capacity];
		this.cmp = cmp;
	}

	public ULSortedList(Comparator cmp, int initialCapacity) {
		capacity = initialCapacity;
		size = 0;
		data = (E[]) new Object[capacity];
		this.cmp = cmp;
	}

	public void add(E item) {
		// TODO determine its placement in the array using the comparator
		if (size == capacity) {
			capacity *= 2;
			E[] temp = data;
			data = (E[]) new Object[capacity];
			for(int i = 0; i < temp.length; i++) {
				data[i] = temp[i];
			}
		}

		data[size] = item;
		sift_up(size);
		size++;
	}

	public int capacity() {
		return capacity;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	public ULSortedList<E> clone() {
		ULSortedList<E> newList = null;
		try {
			newList = (ULSortedList<E>) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newList.data = (E[]) this.data.clone();
		return newList;
	}

	public boolean contains(E item) {
		boolean found = false;
		int place = 0;
		while (place < size && found == false) {
			if (data[place].equals(item)) {
				found = true;
			}
			place++;
		}
		return found;
	}

	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if (otherObject != null) {
			if (otherObject == this) {
				isEqual = true;
			} else if (otherObject instanceof ULSortedList<?>) {
				ULSortedList otherList = (ULSortedList) otherObject;
				isEqual = otherList.size == size && otherList.data.equals(data);
			}
		}
		return isEqual;
	}

	public E get(int index) {
		return data[index];
	}

	public void remove(E item) {
		boolean found = false;
		int index = 0;
		while(found == false && index < size) {
			if(data[index].equals(item)) {
				found = true;
			}
			index++;
		}
		
		if(found == true) {
			for(int i = index; i < size-1; i++) {
				data[i] = data[i+1];
			}
			data[size - 1] = null;
			size--;
		}
		else {
			throw new ULItemNotFoundException();
		}
	}

	public int size() {
		return size;
	}

	public String toString() {
		return data.toString();
	}
	
	private void swap(int index1, int index2) {
		E temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	private void sift_up(int index) {
		if(index > 0) {
			E item = data[index];
			E parent = data[index/2];
			if(parent != null) {
				if(cmp.compare(item, parent) < 0) {
					swap(index, index/2);
					sift_up(index/2);
				}
			}
		}
	}
	
//	private void sift_down(int index) {
//		int firstChild = index * 2;
//		int secondChild = firstChild + 1;
//		
//		if(firstChild < size) {
//			int largestChildIndex = firstChild;
//			if(secondChild < size && 
//					cmp.compare(data[firstChild], data[secondChild]) < 0) {
//				largestChildIndex = secondChild;
//			}
//			if(cmp.compare(data[index], data[largestChildIndex]) > 0) {
//				swap(index, largestChildIndex);
//				sift_down(largestChildIndex);
//			}
//		}
//	}
}
