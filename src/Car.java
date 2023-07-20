public class Car {
    private String name ;
    private String color;
    private int age ;

    public Car(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void senaCar(String word, int a){
        System.out.println(word + a);
    }public static void nameCar(String word ){
        System.out.println(word + " Super");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
