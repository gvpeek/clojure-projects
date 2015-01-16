(ns easy-isbn-validator.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (def input-digits (into [] (filter #(not= "-" %) (map str (seq (first args))))))

  (println input-digits)
  (println (= "X" (last input-digits)))
  
)
