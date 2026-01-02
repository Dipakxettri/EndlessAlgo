class Animal{
    String name;

    void getName(){
        System.out.println(name);
    }
}
public class opps{
    public static void main(String[] args) {
        Animal an = new Animal();
        an.name = "Dog";
        an.getName();
    }
}