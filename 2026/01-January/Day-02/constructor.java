class Animal{
    Animal(String name){
        System.out.println("This animal is " + name);
    }
}
public class constructor{
    public static void main(String[] args) {
        Animal an = new Animal("Cat");
    }
}