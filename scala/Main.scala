import util.Random
import quicksort.Sort
import bubblesort.Sort
import mergesort.Sort

object Main {

  def main(args : Array[String]) {

    val currentLength: Int = args(0).toInt

    runQuickSort(currentLength)

    runMergeSort(currentLength)

    runBubbleSort(currentLength)

  }


  def runMergeSort(currLength: Int) {

    val sort1 = (a: Int, b: Int) => {a >= b}

    var unsortedInt = List.fill(currLength)(Random.nextInt(100))

    var currentTime = java.lang.System.currentTimeMillis()
    var holder1: List[Int] = mergesort.Sort.MergeSort(unsortedInt, sort1)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    var sort3 = (a: Float, b: Float) => (a >= b)

    var unsortedFloat = List.fill(currLength)(Random.nextFloat())

    currentTime = java.lang.System.currentTimeMillis()
    var holder2 = mergesort.Sort.MergeSort(unsortedFloat, sort3)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    val sort2 = (a: String, b: String) => {a <= b}

    var unsortedString = List.fill(currLength)(Random.alphanumeric.take(5).mkString)


    currentTime = java.lang.System.currentTimeMillis()
    var holder3: List[String] = mergesort.Sort.MergeSort(unsortedString, sort2)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    //////////////////////////////////////

  }

  def runBubbleSort(currLength: Int) {

    val sort1 = (a: Int, b: Int) => {a >= b}

    var unsortedInt = Array.fill(currLength)(Random.nextInt(100))

    var currentTime = java.lang.System.currentTimeMillis()
    var holder1: Array[Int] = bubblesort.Sort.BubbleSort(unsortedInt, sort1)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    var sort3 = (a: Float, b: Float) => (a >= b)

    var unsortedFloat = Array.fill(currLength)(Random.nextFloat())

    currentTime = java.lang.System.currentTimeMillis()
    var holder2 = bubblesort.Sort.BubbleSort(unsortedFloat, sort3)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    val sort2 = (a: String, b: String) => {a <= b}

    var unsortedString = Array.fill(currLength)(Random.alphanumeric.take(5).mkString)


    currentTime = java.lang.System.currentTimeMillis()
    var holder3: Array[String] = bubblesort.Sort.BubbleSort(unsortedString, sort2)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////
    println()

  }

  def runQuickSort(currLength: Int) {

    val sort1 = (a: Int, b: Int) => {a >= b}

    var unsortedInt = List.fill(currLength)(Random.nextInt(100))

    var currentTime = java.lang.System.currentTimeMillis()
    var holder1: List[Int] = quicksort.Sort.QuickSort(unsortedInt, sort1)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    var sort3 = (a: Float, b: Float) => (a >= b)

    var unsortedFloat = List.fill(currLength)(Random.nextFloat())

    currentTime = java.lang.System.currentTimeMillis()
    var holder2 = quicksort.Sort.QuickSort(unsortedFloat, sort3)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////////////////////

    val sort2 = (a: String, b: String) => {a <= b}

    var unsortedString = List.fill(currLength)(Random.alphanumeric.take(5).mkString)


    currentTime = java.lang.System.currentTimeMillis()
    var holder3: List[String] = quicksort.Sort.QuickSort(unsortedString, sort2)
    print(java.lang.System.currentTimeMillis() - currentTime + " ")

    ////////////////////
  }

}

