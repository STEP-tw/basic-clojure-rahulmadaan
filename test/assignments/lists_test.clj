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

(deftest count'-test
  (testing "number of element in a list"
    (is (= 5 (count' [1 2 3 4 5]))))
  (testing "number of element in an empty list"
    (is (= 0 (count' [])))))

(deftest sqr-of-the-first-test
  (testing "square of first element"
    (is (= [64 64 64] (sqr-of-the-first [8 5 2]))))
  )

(deftest filter'-test
  (testing "filtering even numbers"
    (is (= [2 4] (filter' even? [1 2 3 4 5]))))
  (testing "filtering odd numbers"
    (is (= [1 3 5] (filter' odd? [1 2 3 4 5])))))

(deftest reverse'-test
  (testing "reverse an array"
    (is (= [6 5 4 3 2 1] (reverse' [1 2 3 4 5 6]))))
  (testing "reverse an empty array"
    (is (= [] (reverse' [])))))
