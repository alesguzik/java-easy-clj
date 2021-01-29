(ns java-easy-clj.core-test
  (:require [clojure.test :as t]
            [java-easy-clj.core :refer :all]))

(t/deftest call-examples
  (t/is (= 3 (call "(+ 1 2)")))

  (t/is (= 3 (call "(+ a b)" "a" 1, "b" 2)))

  (t/is (= 42 (call "bar" "{:keys [bar]}" {:bar 42})))

  (t/is (= 19 (call "(apply + a b (apply + (into-array [5 6]))
                       (seq args))"
                    "[a b]" [1 2]
                    "args" [2 3])))
)
