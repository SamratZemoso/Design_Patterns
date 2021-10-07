package week1;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("In the Singleton constructor");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
