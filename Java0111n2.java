import java.util.Arrays;
import java.util.Collections;

public class Java0111n2 {
    public static int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        // B를 Integer[] 형으로 변경
        Integer [] BB = new Integer[B.length];
        for (int i = 0; i < B.length; i++){
            BB[i] = B[i];
        }
        Arrays.sort(BB, (a, b) -> b - a);
        for (int i = 0; i < A.length; i++){
            answer += (A[i] * BB[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
}