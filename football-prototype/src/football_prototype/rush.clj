(ns football-prototype.rush)

(defn segment-success? 
  ""
  [rating] 
  (if (> rating (rand-int 100)) 
    true 
    false))

(defn rush-multiplier 
  ""
  [rating] 
  (+ 1 (rand-int 
    (- 9 (* rating 0.01)))))
    	  
(defn rush 
  ""
  [rating] 
  (reduce + (map * [(rush-multiplier rating) (rush-multiplier rating)] 
    (reductions + (iterate (partial * (* rating 0.01)) 1)))))

