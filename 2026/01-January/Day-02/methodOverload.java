public class methodOverload {

    static void sum(){
        System.out.println(2 + 2);
    }

    static void sum(int a , int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {

        sum();
        sum(2,8);
    }
}
