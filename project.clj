(defproject java-easy-clj "1.0"
  :description "Easy interface to call Clojure from Java"
  :url "http://github.com/alesguzik/java-easy-clj"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repl-options {:init-ns java-easy-clj.core}
  :aot :all)
