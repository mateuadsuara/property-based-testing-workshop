(ns property-based-testing-workshop.core
  (:gen-class))

(defn -main [& args]
  (let [amount (Integer/parseInt (first args))
        change (Core/getChange amount)]
    (println (str "The change for " amount " is:"))
    (println (clojure.string/join ", " change))))
