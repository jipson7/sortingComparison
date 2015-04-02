(ns sorting (:use clojure.pprint))

(defn cust-comp [a b] 
  (cond
    (>= (compare a b) 0) true
    (< (compare a b) 0) false))

(load-file "./bubblesort/sort.clj")
(load-file "./quicksort/sort.clj")
(load-file "./mergesort/sort.clj")

(pprint (bubble-sort (list 3 4 2 5 7 1 9 8 6 0)))

(pprint (quick-sort (list 3 4 2 5 7 1 9 8 6 0)))

(pprint (merge-sort (list 3 4 2 5 7 1 9 8 6 0)))
