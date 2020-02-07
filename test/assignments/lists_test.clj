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

(deftest difference-test
  (testing "should return [9]"
    (is (= [9] (difference [1 3 5 7] [1 3 5 7 9]))))
  (testing "should return [] for identical lists"
    (is (= [] (difference [2 4 6 8] [2 4 6 8])))))

(deftest double-up-test
  (testing "should repeat every element twice"
    (is (= '(1 1 2 2 3 3 4 4) (double-up [1 2 3 4])))
    )
  (testing "should return empty list for empty list input"
    (is (= '() (double-up []))))
  )

(deftest index-of-test
  (testing "should return 2"
    (is (= 2 (index-of [1 2 3 4] 3))))

  (testing "should return -1 if the element is not in the list"
    (is (= -1 (index-of [1 2 3 4] 9))))

  )

(deftest palindrome?-test
  (testing "with empty collection"
    (is (true? (palindrome? []))))
  (testing "with palindrome list"
    (is (true? (palindrome? [1 2 1]))))
  (testing "with string"
    (is (true? (palindrome? "NaN"))))
  (testing "not a palindrome"
    (is (false? (palindrome? [1 2 3])))))

(deftest transpose-test
  (testing "with empty sequence"
    (is (= [] (transpose [[] []]))))
  (testing "with not-empty sequence"
    (is (= [[1 2 3] [4 5 6]] (transpose [[1 4] [2 5] [3 6]])))))