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

(def num-in-list 100)
(defn rand-int-list [] (take num-in-list (repeatedly #(rand-int 100))))
(defn rand-float-list [] (take num-in-list (repeatedly #(rand 100))))
(defn rand-string-list [] (take num-in-list (repeatedly #(random-str 5))))

(defn extract-time [timeString] (re-seq #"[0-9]+\.[0-9]+" timeString))

(def timeList (vector (let [x (rand-int-list)] (with-out-str (time (bubble-sort x))))
                      (let [x (rand-float-list)] (with-out-str (time (bubble-sort x))))
                      (let [x (rand-string-list)] (with-out-str (time (bubble-sort x))))
                      (let [x (rand-int-list)] (with-out-str (time (quick-sort x))))
                      (let [x (rand-float-list)] (with-out-str (time (quick-sort x))))
                      (let [x (rand-string-list)] (with-out-str (time (quick-sort x))))
                      (let [x (rand-int-list)] (with-out-str (time (merge-sort x))))
                      (let [x (rand-float-list)] (with-out-str (time (merge-sort x))))
                      (let [x (rand-string-list)] (with-out-str (time (merge-sort x))))))

;(pprint timeList)

(apply print (flatten (map extract-time timeList)))

;bubble (int, float, string), quick (int, float, string), merge (int, float, string)
