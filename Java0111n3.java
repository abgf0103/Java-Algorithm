import java.util.Arrays;

public class Java0111n3 {
    public static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");

        s = Arrays.toString(s.split(" ")).toLowerCase();

        for (int i = 0; i < words.length; i++){
            if (words[i].length() != 0){
                words[i] = words[i].toLowerCase();
                String f = words[i].substring(0,1).toUpperCase();
                String r = words[i].substring(1);
                answer += f + r + " ";
            }else {
                answer += " ";
            }
        }
        return answer.trim();
    }

    public static void main(String[] args) {
        System.out.println(solution("for the last  week"));
    }
}