(ns property-based-testing-workshop.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check :refer :all]
            [clojure.test.check.clojure-test :refer :all]
            [clojure.test.check.properties :refer :all]
            [clojure.test.check.generators :as gen]
            [property-based-testing-workshop.core :refer :all]))

(def coins [200 100 50 20 10 5 2 1])


(defn is-coin? [number]
  (some #{number} coins))

(defspec returns-the-same-amount-when-added
         10000
         (for-all [amount gen/nat]
                  (= amount (apply + (Core/getChange amount)))))

(defspec returns-only-coins
         10000
         (for-all [amount gen/nat]
                  (every? is-coin? (Core/getChange amount))))

(defspec returns-the-biggest-possible
         10000
         (for-all [amount gen/nat]
                  (let [change (Core/getChange amount)
                        freq (frequencies change)]
                    (and (<= (get freq 1 0) 1)
                         (<= (get freq 2 0) 2)
                         (<= (get freq 5 0) 1)
                         (<= (get freq 10 0) 1)
                         (<= (get freq 20 0) 2)
                         (<= (get freq 50 0) 1)
                         (<= (get freq 100 0) 1)
                         ))))


