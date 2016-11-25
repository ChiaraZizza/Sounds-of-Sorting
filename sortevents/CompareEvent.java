package edu.grinnell.sortingvisualizer.sortevents;

import java.util.*;

public class CompareEvent<T> implements SortEvent<T> {
	
	/* indices being compared */
	public int i;
	public int j;
	
	/* Constructor */
	public CompareEvent(int val1, int val2) {
		this.i = val1;
		this.j = val2;
	}

	public void apply(T[] arr) {
		return; // do nothing
	}

	public List<Integer> getAffectedIndices() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(this.i);
		list.add(this.j);
		return list;
	}

	public boolean isEmphasized() {
		return false;
	}
	
}
