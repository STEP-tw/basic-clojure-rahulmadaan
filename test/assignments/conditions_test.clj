(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))


(deftest truthy-harishchandra
  (testing "truthy value (0)"
    (is (= 0 (harishchandra 0))))
  (testing "truthy value (2)"
    (is (= 2 (harishchandra 2))))
  (testing "falsy value nil"
    (is (= nil (harishchandra nil)))))

(deftest informative-divide-test
  (testing "return 2 by dividing 4 by 2"
    (is (= 2 (informative-divide 4 2))))
  (testing "return infinity by dividing 3 by 0"
    (is (= :infinite (informative-divide 3 0))))
  )



(deftest yudishtira-test
  (testing "truthy value 3"
    (is (= 3 (yudishtira 3))))
  (testing "falsy value '()"
    (is (= '() (yudishtira '()))))
  (testing "truthy value empty list"
    (is (= '() (yudishtira '()))))
  (testing "falsy value false and should return :ashwathama"
    (is (= :ashwathama (yudishtira false))))
  (testing "falsy value nil and should return :ashwathama"
    (is (= :ashwathama (yudishtira nil))))
  )

(deftest five-point-someone-test
  (testing "return :satan-bhagat if x is 5"
    (is (= :satan-bhagat (five-point-someone 5 2))))
  (testing "return :chetan-bhagat if y is 5"
    (is (= :chetan-bhagat (five-point-someone 3 5))))
  (testing "return :greece if x is greater than y"
    (is (= :greece (five-point-someone 8 4))))
  (testing "return :universe if none of the above condition matches"
    (is (= :universe (five-point-someone 0 0))))

  (testing "return :chetan-bhagat even if both x & y are 5"
    (is (= :chetan-bhagat (five-point-someone 5 5))))

  )

(deftest order-in-words-test
  (testing "x > y & y > z"
    (is (= [:x-greater-than-y :y-greater-than-z] (order-in-words 4 3 2))))
  (testing "x > y & z > x"
    (is (= [:x-greater-than-y :z-greater-than-x] (order-in-words 4 3 6))))
  (testing "z > x & y < x"
    (is (= [:z-greater-than-x] (order-in-words 2 3 4))))
  (testing "all are equal"
    (is (= [] (order-in-words 4 4 4))))
  (testing "x > y"
    (is (= [:x-greater-than-y] (order-in-words 4 2 3))))

  )


(deftest zero-aliases-test
  (testing "for 0"
    (is (= :zero (zero-aliases 0))))
  (testing "for '()"
    (is (= :empty (zero-aliases '()))))
  (testing "for []"
    (is (= :empty (zero-aliases []))))
  (testing "for #{}"
    (is (= :empty-set (zero-aliases #{}))))
  (testing "for {}"
    (is (= :empty-map (zero-aliases {}))))
  (testing "for non zero"
    (is (= :not-zero (zero-aliases 1))))
  )

(deftest zero-separated-palindrome-test
  (testing "for positive numbers"
    (is (= '(4 3 2 0 2 3 4) (zero-separated-palindrome '(1 2 3)))))
  (testing "for negative numbers"
    (is (= '(-2 3 0 0 0 3 -2) (zero-separated-palindrome '(-1 2 -3)))))
  )
