import bubblesort.*;
import mergesort.*;
import quicksort.*;
import java.util.*;

class Main {

	public static void main(String[] args) {

		int numItems = Integer.parseInt(args[0]);;

		long integerTime, floatTime, stringTime;

		quicksort.Sort<Integer> driver1 = new quicksort.Sort<Integer>();
		quicksort.Sort<Float> driver2 = new quicksort.Sort<Float>();
		quicksort.Sort<String> driver3 = new quicksort.Sort<String>();

		////////////////////////////////////////////////////////

		integerTime = runIntegerTestQuick(numItems, driver1);
		System.out.print(integerTime + " ");

		////////////////////////////////////////////////////////
		
		floatTime = runFloatTestQuick(numItems, driver2);
		System.out.print(floatTime + " ");

		///////////////////////////////////////////////////////
		
		stringTime = runStringTestQuick(numItems, driver3);
		System.out.print(stringTime + " ");


		mergesort.Sort<Integer> driver4 = new mergesort.Sort<Integer>();
		mergesort.Sort<Float> driver5 = new mergesort.Sort<Float>();
		mergesort.Sort<String> driver6 = new mergesort.Sort<String>();

		////////////////////////////////////////////////////////

		integerTime = runIntegerTestMerge(numItems, driver4);
		System.out.print(integerTime + " ");

		////////////////////////////////////////////////////////
		
		floatTime = runFloatTestMerge(numItems, driver5);
		System.out.print(floatTime + " ");

		///////////////////////////////////////////////////////
		
		stringTime = runStringTestMerge(numItems, driver6);
		System.out.print(stringTime + " ");

		bubblesort.Sort<Integer> driver7 = new bubblesort.Sort<Integer>();
		bubblesort.Sort<Float> driver8 = new bubblesort.Sort<Float>();
		bubblesort.Sort<String> driver9 = new bubblesort.Sort<String>();

		////////////////////////////////////////////////////////

		integerTime = runIntegerTestBubble(numItems, driver7);
		System.out.print(integerTime + " ");

		////////////////////////////////////////////////////////
		
		floatTime = runFloatTestBubble(numItems, driver8);
		System.out.print(floatTime + " ");

		///////////////////////////////////////////////////////
		
		stringTime = runStringTestBubble(numItems, driver9);
		System.out.print(stringTime + " ");

		System.out.println();
		
	}

	/////////////BUBBLE

	public static long runFloatTestBubble(int numItems, bubblesort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);



	}

	public static long runIntegerTestBubble(int numItems, bubblesort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

	public static long runStringTestBubble(int numItems, bubblesort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

	/////////////MERGE

	public static long runFloatTestMerge(int numItems, mergesort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);



	}

	public static long runIntegerTestMerge(int numItems, mergesort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

	public static long runStringTestMerge(int numItems, mergesort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

		/////////////QUICK

	public static long runFloatTestQuick(int numItems, quicksort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);



	}

	public static long runIntegerTestQuick(int numItems, quicksort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

	public static long runStringTestQuick(int numItems, quicksort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}

	//////////////////////////////////////////

	public static String getRandString() {

		int wordLength = 5;

		Random rand = new Random();

		StringBuilder word = new StringBuilder();

		String charArray = "abcdefghijklmnopqrstuvwxyz";

		int charIndex;

		for (int i = 0; i < wordLength; i++) {

			charIndex = rand.nextInt(26);

			word.append(charArray.charAt(charIndex));
			
		}

		return word.toString();

	}

}
