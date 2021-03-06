import bubblesort.*;
import mergesort.*;
import quicksort.*;
import java.util.*;

class Main {

	public static void main(String[] args) {

		int numItems = 10;

		long integerTime, floatTime, stringTime;

		System.out.println("Running with 1000 items per list");

		System.out.println("<----------Quick Sort--------->");

		quicksort.Sort<Integer> driver1 = new quicksort.Sort<Integer>();
		quicksort.Sort<Float> driver2 = new quicksort.Sort<Float>();
		quicksort.Sort<String> driver3 = new quicksort.Sort<String>();

		////////////////////////////////////////////////////////

		System.out.println("\nInteger test:\n///////////");
		integerTime = runIntegerTestQuick(numItems, driver1);

		////////////////////////////////////////////////////////
		
		System.out.println("\nFloat test:\n///////////");
		floatTime = runFloatTestQuick(numItems, driver2);

		///////////////////////////////////////////////////////
		
		System.out.println("\nString test:\n///////////");
		stringTime = runStringTestQuick(numItems, driver3);

		System.out.println("\n<----------Merge Sort--------->");

		mergesort.Sort<Integer> driver4 = new mergesort.Sort<Integer>();
		mergesort.Sort<Float> driver5 = new mergesort.Sort<Float>();
		mergesort.Sort<String> driver6 = new mergesort.Sort<String>();

		////////////////////////////////////////////////////////

		System.out.println("\nInteger test:\n///////////");
		integerTime = runIntegerTestMerge(numItems, driver4);

		////////////////////////////////////////////////////////
		
		System.out.println("\nFloat test:\n///////////");
		floatTime = runFloatTestMerge(numItems, driver5);

		///////////////////////////////////////////////////////
		
		System.out.println("\nString test:\n///////////");
		stringTime = runStringTestMerge(numItems, driver6);

		System.out.println("\n<----------Bubble Sort--------->");

		bubblesort.Sort<Integer> driver7 = new bubblesort.Sort<Integer>();
		bubblesort.Sort<Float> driver8 = new bubblesort.Sort<Float>();
		bubblesort.Sort<String> driver9 = new bubblesort.Sort<String>();

		////////////////////////////////////////////////////////

		System.out.println("\nInteger test:\n///////////");
		integerTime = runIntegerTestBubble(numItems, driver7);

		////////////////////////////////////////////////////////
		
		System.out.println("\nFloat test:\n///////////");
		floatTime = runFloatTestBubble(numItems, driver8);

		///////////////////////////////////////////////////////
		
		System.out.println("\nString test:\n///////////");
		stringTime = runStringTestBubble(numItems, driver9);

		System.out.println("\n<----------------------------->\n");
		
	}

	/////////////BUBBLE

	public static long runFloatTestBubble(int numItems, bubblesort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);



	}

	public static long runIntegerTestBubble(int numItems, bubblesort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);

	}

	public static long runStringTestBubble(int numItems, bubblesort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);

	}

	/////////////MERGE

	public static long runFloatTestMerge(int numItems, mergesort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);



	}

	public static long runIntegerTestMerge(int numItems, mergesort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);

	}

	public static long runStringTestMerge(int numItems, mergesort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);

	}

		/////////////QUICK

	public static long runFloatTestQuick(int numItems, quicksort.Sort<Float> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextFloat());

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);



	}

	public static long runIntegerTestQuick(int numItems, quicksort.Sort<Integer> driver) {

		Random rand = new Random();

		for (int i = 0; i < numItems; i++) {

			driver.list.add(rand.nextInt(100));

		}
		
		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

		return (endTime - startTime);

	}

	public static long runStringTestQuick(int numItems, quicksort.Sort<String> driver) {	

		for (int i = 0; i < numItems; i++) {

			driver.list.add(getRandString());

		}

		System.out.println(driver);
		final long startTime = System.currentTimeMillis();
		driver.MainSort();
		final long endTime = System.currentTimeMillis();
		System.out.println(driver);

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
