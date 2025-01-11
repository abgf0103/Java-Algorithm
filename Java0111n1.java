import java.util.Arrays;
import java.util.stream.Stream;

public class Java0111n1 {
    public static String solution(String s) {
        int[] nums = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }
}