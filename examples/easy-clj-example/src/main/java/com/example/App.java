package com.example;
import net.aguzik.java.EasyClj;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is your first name?");
        String firstName = (String)EasyClj.call("(read-line)");
        EasyClj.call("(println s)", "s", "What is your last name?");
        String lastName = (String)EasyClj.call("(read-line)");
        Consumer<String> printGreeting = (String msg) -> { System.out.println(msg); };
        EasyClj.call("(.accept print-greeting (format \"Hello, %s %s!\" first-name last-name))",
          "first-name", firstName,
          "last-name", lastName,
          "print-greeting", printGreeting);
    }
}
