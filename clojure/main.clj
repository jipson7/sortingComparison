(ns sorting (:use clojure.pprint))

(defn cust-comp [a b] 
  (cond
    (>= (compare a b) 0) true
    (< (compare a b) 0) false))

(def VALID-CHARS
  (map char (range 97 123)))

(defn random-char []
  (nth VALID-CHARS (rand (count VALID-CHARS))))

(defn random-str [length]
  (apply str (take length (repeatedly random-char))))

(load-file "./bubblesort/sort.clj")
(load-file "./quicksort/sort.clj")
(load-file "./mergesort/sort.clj")  

;(def numElements 100)
(defn rand-int-list [num-in-list] (take num-in-list (repeatedly #(rand-int 100))))
(defn rand-float-list [num-in-list] (take num-in-list (repeatedly #(rand 100))))
(defn rand-string-list [num-in-list] (take num-in-list (repeatedly #(random-str 5))))

(defn extract-time [timeString] (re-seq #"[0-9]+\.[0-9]+" timeString))

(defn timeList [numElements] 
  (vector 
    (let [x (rand-int-list numElements)] (with-out-str (time (quick-sort x))))
    (let [x (rand-float-list numElements)] (with-out-str (time (quick-sort x))))
    (let [x (rand-string-list numElements)] (with-out-str (time (quick-sort x))))
    (let [x (rand-int-list numElements)] (with-out-str (time (merge-sort x))))
    (let [x (rand-float-list numElements)] (with-out-str (time (merge-sort x))))
    (let [x (rand-string-list numElements)] (with-out-str (time (merge-sort x))))
    ;(let [x (rand-int-list numElements)] (with-out-str (time (bubble-sort x))))
    ;(let [x (rand-float-list numElements)] (with-out-str (time (bubble-sort x))))
    ;(let [x (rand-string-list numElements)] (with-out-str (time (bubble-sort x))))
    ))


(defn get-time-row [xElements] (flatten (map extract-time (timeList xElements))))

(println (flatten (interpose "\n" (map #(doall (get-time-row %)) (range 100 10000 100)))))

;bubble (int, float, string), quick (int, float, string), merge (int, float, string)
