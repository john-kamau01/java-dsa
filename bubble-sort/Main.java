public class Main{
    public static void main(String[] args){
        int[] nums = {10, 2, 300, 90, 29, 45, 78, 200, 230, 140};
        int size = nums.length;
        int temp = 0;

        // The outer loop is responsible for determining the number of iterations
        // the inner loop is responsible for swaping - this loop must loop through one less value each time it runs

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array::::");

        for(int num : nums){
            System.out.print(num + ",");
        }

        System.out.println();
    }
}