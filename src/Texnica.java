public class Texnica extends Car {


    public Texnica(String name, String color, int age) {
        super(name, color, age);
    }

    public static void senaTexnica(int a){
        System.out.println(a+10);
    }public static void nameTexnica(String word){
        System.out.println(word + " Hello");
    }

    @Override
    public String toString() {
        return "Texnica{}";
    }
}
