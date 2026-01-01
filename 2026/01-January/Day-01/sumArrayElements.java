public class sumArrayElements {
    public static void main(String[] args) {
        
        int sum = 0;
        int [] arry = {1,2,3,4};

        for (int i = 0; i< arry.length; i++){
            sum += arry[i];
        }

        System.out.println(sum);
    }
}
