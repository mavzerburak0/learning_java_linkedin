// Singleton Design Pattern example

public class MySingleton {


    // placeholder for current singleton object
    private static MySingleton __me = null;

    // No other object can instantiate
    private MySingleton() {

    }

    // Asking for a singleton

    // This is a technique called lazy instantiation

    public static MySingleton getInstance() {
        // Does it already exist?
        if (__me == null) {

            // If not, instantiate and store
            __me = new MySingleton();
        }
        return __me;


    }

    public void someMethod() {


    }

}
