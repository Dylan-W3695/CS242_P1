package songs;

import java.util.Comparator;

public class ULSortedList<E> implements Cloneable {

	int capacity;
	int size;
	E[] data;
	Comparator cmp;

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
		}

		// data[size] = item;
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

	public ULSortedList<E> clone() throws CloneNotSupportedException {
		ULSortedList<E> newList = (ULSortedList<E>) super.clone();
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
	}

	public int size() {
		return size;
	}

	public String toString() {
		return data.toString();
	}
}
