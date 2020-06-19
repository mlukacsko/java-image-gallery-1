/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.au.cc.gallery;
import static spark.Spark.*;


public class App {
    public String getGreeting() {
        return "Hello Molly!";
    }

    public static void main(String[] args) throws Exception {
        String portString = System.getenv("JETTY_PORT");

	if (portString == null || portString.equals("")) {
		port(5000);
	} else {
		port(Integer.parseInt(portString));
	}

        new User().addRoutes();
    }
}
 

