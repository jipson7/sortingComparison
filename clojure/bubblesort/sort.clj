(ns bubblesort (:use clojure.pprint))

(defn bubble-swap [the-list]
  (if (or (nil? the-list) (nil? (second the-list)))
    the-list
    (if (> (first the-list) (second the-list))
      (cons (second the-list) (cons (first the-list) (nthrest the-list 2)))
      (cons (first the-list) (bubble-swap (rest the-list))))))

(defn bubble-sort [a-list]
  (if (= a-list (bubble-swap a-list))
    a-list
    (recur (bubble-swap a-list))))
 

(pprint (bubble-sort (list 3 4 2 5 7 1 9 8 6 0)))
