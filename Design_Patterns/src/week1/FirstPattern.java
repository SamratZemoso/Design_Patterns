package week1;

public class FirstPattern {

    public static void main(String[] arg) {

        // Only one instance is created
        Singleton obj1 = Singleton.getInstance();
        obj1.printMessage("Object 1");

        Singleton obj2 = Singleton.getInstance();
        obj2.printMessage("Object 2");

        System.out.println("-------------");

        // For every Object a new Instance will be created
        Sample obj3 = new Sample();
        obj3.printMessage("Object 3");

        Sample obj4 = new Sample();
        obj4.printMessage("Object 4");

    }

}
