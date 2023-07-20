public class Machine extends Car{


    public Machine(String name, String color, int age) {
        super(name, color, age);
    }

    public static void nameMachine(String name){
        System.out.println(name + " Hello");
    }public static void colorMachine(){
        System.out.println(" 4 года");
    }

    @Override
    public String toString() {
        return "Machine{}";
    }
}
