package week3;

public class BuilderDemo {

    public static void main(String[] args) {

        Engineer engineer = new Engineer();

        engineer.constructHouse();

        System.out.println(engineer.getHouse());

    }
}
