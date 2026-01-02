class Animal{
    String name;

    void getName(){
        System.out.println(name);
    }
}

class Dog extends Animal{

}
public class inheritance{
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.name = "Dog";
        dg.getName();

    }
}