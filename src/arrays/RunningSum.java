package src.arrays;

public class RunningSum {

    public static void main(String[] args) {

        int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        RunningSum rs = new RunningSum();
        int [] sum = rs.RSum(nums);
        System.out.println("The running sums in the array are: " );
        for(int i : sum)
        System.out.print(i + "\t");

    }

        public int[] RSum(int[] nums) {

            int runnSum = 0;
            for(int i = 0; i < nums.length; i++)
            {
                nums[i] = runnSum + nums[i];
                runnSum = nums[i];
            }
            return nums;
        }
    }

