import java.util.Arrays;
import java.util.Comparator;

public class Java0113n1 {
    public static String solution(String s) {
        String[] answer = s.split("");
        String result = "";
        Arrays.sort(answer, Comparator.reverseOrder());
        for(int i=0; i<answer.length;i++){  
            result += answer[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}