// Abstract class acts as the blueprint
abstract class SmartPhone {
    String name;
    String modelNo;

    // Constructor in an abstract class
    // This allows the child to pass data up to be initialized
    SmartPhone(String name, String modelNo) {
        this.name = name;
        this.modelNo = modelNo;
    }

    abstract void getName();
    abstract void getModelNo();
}

// Concrete class implementing the blueprint
class Samsung extends SmartPhone {

    // Constructor calls the parent constructor using super()
    Samsung(String n, String m) {
        super(n, m);
    }

    @Override
    void getName() {
        System.out.println("Phone Brand: " + name);
    }

    @Override
    void getModelNo() {
        System.out.println("Model Number: " + modelNo);
    }
}

// Main class (File name should be AbstractClassDemo.java)
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Instantiate the child class
        Samsung sm = new Samsung("Samsung", "XYZZ5622");
        
        // Call the implemented methods
        sm.getName();
        sm.getModelNo();
    }
}