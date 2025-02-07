public class Main{
    public static void main(String[] args){
        int prev1 = 0;
        int prev2 = 1;

        System.out.println(prev1);
        System.out.println(prev2);
        System.out.println("**************************");

        for(int i = 0; i < 18; i++){
            int newFiboNumber = prev1 + prev2;
            System.out.println(newFiboNumber);
            prev1 = prev2;
            prev2 = newFiboNumber;
        }
    }
}