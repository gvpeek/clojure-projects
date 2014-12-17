(ns football-prototype.pass)

(defn success? 
  ""
  [rating] 
  (if (> rating (rand-int 100)) 
    true 
    false))

(defn pass 
  ""
  [passer receiver] 
  (if (= true (success? qb) (success? wr)) 
    :complete 
    :incomplete))