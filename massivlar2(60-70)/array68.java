public class array68 {
    public static void main(String[] args){
        int nums[] = {1,2,3};
        int[] num2 = getConcatenation(nums);
        for(int i=0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
    }
    public static int[] getConcatenation(int[] nums){
        int[] newNums = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newNums[i] = nums[i];
            newNums[i+nums.length] = nums[i];
        }
        return newNums;
    }
}