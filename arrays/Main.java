public class Main{
    public static void main(String[] args){
        String[] cars = {"Toyota", "Subaru", "Mazda"};

        int[] myNums = {30, 20, 50, 25, 45};
        int largestNum = myNums[0];

        for(int num : myNums){
            if(num > largestNum){
                largestNum = num;
            }
        }

        System.out.println("Largest number is:::" + largestNum);

    }
}