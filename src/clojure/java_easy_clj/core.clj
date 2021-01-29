(ns java-easy-clj.core)

(defn call [code-str & pairs]
  (let [forms (-> (str "( " code-str ")") read-string)
        kv-pairs (partition 2 pairs)
        ks (map #(read-string (first %)) kv-pairs)
        vs (map second kv-pairs) ]
    (apply (eval `(fn [~@ks] ~@forms)) vs)))

(defn call-from-java [code-str vararg-array]
  (apply call code-str (seq vararg-array)))
