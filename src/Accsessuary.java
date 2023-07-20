public class Accsessuary extends Car {


    public Accsessuary(String name, String color, int age) {
        super(name, color, age);
    }

    public static void colorAccsessuary(String word){
        System.out.println(word);
    }public static void senaAccsessuary(int a ){
        System.out.println(a +5);
    }

    @Override
    public String toString() {
        return "Accsessuary{}";
    }
}
