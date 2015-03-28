package bubblesort;

import java.util.*;

public class Sort <T extends Comparable<T>> implements Comparator<T> {

	public ArrayList<T> list;

	public int compare(T a, T b) {

		return a.compareTo(b);

	}

	public Sort(){

		this.list = new ArrayList<T>();

	}

	@Override
	public String toString(){

		String listOut = "";

		listOut += "-->";

		for (int i = 0; i < list.size(); i++) {

			listOut += list.get(i) + " ";

		}

		return listOut;

	}

	public void MainSort() {

		int length = list.size();

		boolean swapped = true;;

		T holder;

		while(swapped) {

			swapped = false;

			for (int i = 0; i < length - 1; i++) {

				if (this.compare(list.get(i), list.get(i+1)) < 0) {

					holder = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i + 1, holder);

					swapped = true;

				}

			}

		}

	}

}
