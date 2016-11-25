package edu.grinnell.sortingvisualizer.sortevents;

import java.util.*;

public class SwapEvent<T> implements SortEvent<T> {
	
	/* indices of the things being swapped */
	public int i;
	public int j;
	public String type = "Swap";
	
	/* Constructor */
	public SwapEvent(int val1, int val2) {
		this.i = val1;
		this.j = val2;
	}

	/**
	 * swaps the stored indices i and j of the given array
	 */
	public void apply(T[] arr) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public List<Integer> getAffectedIndices() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(this.i);
		list.add(this.j);
		return list;
	}

	public boolean isEmphasized() {
		return true;
	}
	
}
