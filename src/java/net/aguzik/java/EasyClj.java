package net.aguzik.java;
import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class EasyClj {
  private static boolean initialized = false;
  private static IFn callFn;
  private static void ensureInitialized(){
    if(!initialized){
      IFn require = Clojure.var("clojure.core", "require");
      require.invoke(Clojure.read("java-easy-clj.core"));
      callFn = Clojure.var("java-easy-clj.core", "call-from-java");
    }
  }
  public static Object call(String codeStr, Object... args) {
    ensureInitialized();
    return callFn.invoke(codeStr, args);
  }
}

