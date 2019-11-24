(ns property-based-testing-workshop.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check :refer :all]
            [clojure.test.check.clojure-test :refer :all]
            [clojure.test.check.properties :refer :all]
            [clojure.test.check.generators :as gen]
            [property-based-testing-workshop.core :refer :all]))

(defn returns-one [amount]
  (= [amount] (Core/getChange amount)))

(defspec always-returns-one 100
  (for-all [amount gen/small-integer]
           (returns-one amount)))

(deftest a-unit-test
  (is (returns-one 1)))
