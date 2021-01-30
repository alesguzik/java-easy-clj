# java-easy-clj

[![Clojars Project](https://img.shields.io/clojars/v/java-easy-clj.svg)](https://clojars.org/java-easy-clj)

A Java/Clojure library to easily call clojure code from java. It provides a high-level interface into clojure land via one static method.

## Usage

See `examples/` for sample java/maven projects using this library. Basically all you do is:

```java
import net.aguzik.java.EasyClj;

EasyClj.call("42") // => 42;

EasyClj.call("(+ a b)", "a", 2, "b", 3) // => 5

EasyClj.call("(require '[clojure.pprint :as pprint])")
EasyClj.call("(doseq [i (range len)] (pprint/pprint i))", "len", 10) // prints numbers from 0 to 9

```

## License

Copyright © 2021 Ales Huzik

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
