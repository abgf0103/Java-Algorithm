import java.util.Arrays;

public class Java0111n3 {
    public static boolean solution(String s) {
        int answer = 0;
        String[] words = s.split("");

        for (int i = 0; i < words.length; i++){
            if (words[i] == "(")
                answer ++;
            else
                answer --;
            if(answer == -1){
                return false;
            }
        }
        return answer == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()("));
    }
}