(ns property-based-testing-workshop.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check :refer :all]
            [clojure.test.check.clojure-test :refer :all]
            [clojure.test.check.properties :refer :all]
            [clojure.test.check.generators :as gen]
            [property-based-testing-workshop.core :refer :all]))

(deftest one
  (is (= (Core/getChange 1) [1])))
