(ns easy-isbn-validator.core
  (:gen-class))

(defn -main
  "Determine whether the given input string is a valid ISBN
  Valid test input (actual book ISBNs):
  0026515628
  0030020786
  007035958X
  0070393605
  0070418780
  007054235X
  0072294337
  0072299908
  007231592X
  0072321113
  0890420254
  1401860265
  1416000887
  1416025340
  1418843709
  1558606041
  155860832X
  1932531084
  "
  [& args]

  (defn str2int [str] (Integer. str))
  (defn replace-x [digit-list] (conj (pop digit-list) (clojure.string/replace (last digit-list) #"X" "10")))

  (def input-digits (into [] (filter #(not= "-" %) (map str (seq (first args))))))

  (println "Valid ISBN?"
    (=
      (mod 
        (reduce +
          (map * [10 9 8 7 6 5 4 3 2 1]
            (map str2int (replace-x input-digits))
          )
        )
      11)
    0)
  )
  
)
