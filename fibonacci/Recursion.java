public class Recursion{

    static int count = 2;

    public static void fibonacci(int prev1, int prev2){
        if(count <= 19){
            int newFibNumber = prev1 + prev2;
            System.out.println(newFibNumber);
            prev1 = prev2;
            prev2 = newFibNumber;
            count += 1;
            fibonacci(prev1, prev2);
        } else {
            return;
        }
    }

    public static void main(String[] args){
        fibonacci(0, 1);
    }


}