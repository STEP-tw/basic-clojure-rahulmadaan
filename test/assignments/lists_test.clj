(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))))

(deftest ascending?-test
  (testing "returns true for ascending list"
    (is (= true (ascending? [1 2 3 4 5]))))
  (testing "returns false for not an ascending list"
    (is (= false (ascending? [1 2 4 7 3]))))
  )
