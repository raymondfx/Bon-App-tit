; Complete the bonAppetit function below.
(defn bonAppetit [bill k b]
   (let [not-pay (nth bill k)
        total    (reduce + bill)
        b-actual (/ (- total not-pay) 2)]
    (println
      (if (= b b-actual)
        "Bon Appetit"
        (- b b-actual))))

)

(def nk (clojure.string/split (clojure.string/trimr (read-line)) #" "))

(def n (Integer/parseInt (nth nk 0)))

(def k (Integer/parseInt (nth nk 1)))

(def bill (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))

(def b (Integer/parseInt (clojure.string/trim (read-line))))

(bonAppetit bill k b)
