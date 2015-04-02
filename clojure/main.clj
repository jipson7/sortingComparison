(ns sorting (:use clojure.pprint))

(defn cust-comp [a b] 
  (cond
    (>= (compare a b) 0) true
    (< (compare a b) 0) false))

(load-file "./bubblesort/sort.clj")
(load-file "./quicksort/sort.clj")
(load-file "./mergesort/sort.clj")

(println "Bubble Sort")
(pprint (bubble-sort (list 3 4 2 5 7 1 9 8 6 0)))
(pprint (bubble-sort (list 0.3 0.4 0.2 0.5 0.7 0.1 0.9 0.8 0.6 0)))
(pprint (bubble-sort (list "g" "f" "e" "b" "a" "d" "c" "i" "h")))
(println)

(println "Quick Sort")
(pprint (quick-sort (list 3 4 2 5 7 1 9 8 6 0)))
(pprint (quick-sort (list 0.3 0.4 0.2 0.5 0.7 0.1 0.9 0.8 0.6 0)))
(pprint (quick-sort (list "g" "f" "e" "b" "a" "d" "c" "i" "h")))
(println)

(println "Merge Sort")
(pprint (merge-sort (list 3 4 2 5 7 1 9 8 6 0)))
(pprint (merge-sort (list 0.3 0.4 0.2 0.5 0.7 0.1 0.9 0.8 0.6 0)))
(pprint (merge-sort (list "g" "f" "e" "b" "a" "d" "c" "i" "h")))

