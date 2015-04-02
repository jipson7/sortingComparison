(ns sorting)

(defn quick-sort [[pivot & xs]]
  (when pivot
    (let [smaller #(> pivot %)]
      (lazy-cat (quick-sort (filter smaller xs))
    [pivot]
    (quick-sort (remove smaller xs))))))

