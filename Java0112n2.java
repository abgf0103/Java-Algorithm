import java.util.Arrays;

public class Java0111n3 {
    public static String solution(String s) {
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            return s.substring(s.length()/2,s.length()/2+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef"));
    }
}