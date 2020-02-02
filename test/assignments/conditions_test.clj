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


