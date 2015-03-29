###CSCI3055 Assignment 2

####Caleb Phillips 100518555

______________________
_______________________

#####What is this?

This is an implemention of Quick Sort, Merge Sort, and Bubble Sort in both Scala and Java. It is meant to compare the ease of programming, coding style, and efficiency of each language. It should be noted that I have had more experience with Java than with Scala prior to performing this test, so the number of compiler errors should be taken with a grain of salt.

#####Number of compile/runtime errors during the writing of each algorithm for each language. 
*Note: *If there were multiple errors in any single compile, only one was fixed at a time, and then the code was recompiled. This gives a more accurate estimate rather than fixing multiple errors at once.

| Algorithm | Java | Scala|
|-----------|------|------|
|Bubble Sort|  25  |   40 |
|Quick Sort |   7  |   20 |
|Merge Sort |   5  |  24  |

To compile the java section

```
javac Main.java
```

To compile the scala section

```
scalac Main.scala quicksort/Sort.scala mergesort/Sort.scala bubblesort/Sort.scala

```

The main branch of the repo has a main function that runs a sample of each sort with a small list of ten items to demonstrate functionality.

To view the time comparison, switch to the TimeComparison branch, which is used as follows.

```
java Main <# Items per List>
```
or

```
scala Main <# Items per List>

```
This performs a Quick, Merge, and Bubble sort on lists of Integers, String, and Floats. Each list has randomized entries and a random order.

The output is a single line of times in Milliseconds in the following order:

* Integer QuickSort time
* Float QuickSort time
* String QuickSort time
* Integer MergeSort time
* Float MergeSort time
* String MergeSort time
* Integer BubbleSort time
* Float BubbleSort time
* String BubbleSort time

Using a series of bash and matlab scripts I was able to visualize some of the data as seen below.

![QuickSort](graphing/quicksort.png)
![MergeSort](graphing/mergesort.png)
![BubbleSort](graphing/bubblesort.png)

#####Discussion

First comparing the various sorting methods. 

We can see that MergeSort and BubbleSort are very similar in performance, notice their y-axis. The Bubble sort is terrible in all cases, but especially it seems for Sorting java strings. This is odd because the way I implemented the random strings, java only selects from lower case letters, while the scala implementation selects from Upper, lower, and numeric characters. Having the larger character set I was almost certain scala would be slower. The method I used for both languages is near identical for bubble sort.

Next notice the similarities between MergeSort and QuickSort, not only are their axis at the same range, but the shape of each line pair accross graphs seems to be a mirror image, if only a slight bit scaled. The implementation is also very language specific in each case. The java implemntations stayed fairly close to the pseudo code for each algorithm, where as the scala implemntations use much of scala's syntactic sugar. 

Despite this differences in implementation, the similarity in performance is clear, leading me to believe that scala's synactic sugar is little more than a programming novelty, and lends no benefit to the actual running of the program.

Comparing the 2 language's Merge and Quick Sorts, it can be seen that scala's implementation is slower than java's in all types, if only by a little bit.

Im granting java the winner in this poorly judged contest, however; a chance for redemption is due once my scala programming skills improve, as perhaps my implementation does not do the language justice right now.
