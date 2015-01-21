(ns easy-isbn-validator.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (defn replace-x [digit-list] (conj (pop digit-list) (clojure.string/replace (last digit-list) #"X" "10")))

  (def input-digits (into [] (filter #(not= "-" %) (map str (seq (first args))))))

  (println (replace-x input-digits))
  
)
