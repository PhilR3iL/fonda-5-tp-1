public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("La somme est : " + calculateSum(numbers));
    }

    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
