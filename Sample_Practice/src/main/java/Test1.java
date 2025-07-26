import java.util.Arrays;
import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbs = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                numbs[i] = sc.nextInt();
            }
        }
        System.out.println(Arrays.stream(runningsum(numbs)));

    }
    public static int[] runningsum(int[] nums){
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for(int i = 1;i< nums.length;i++){
            results[i] = nums[i] +results[i-1];
        }
        return results;
    }

    }

