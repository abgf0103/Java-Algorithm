public class Java0122n1 {
    public static String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length()- 4 ; i++) {
            answer = answer + "*";
        }
        int cnt = -4;
        for(int i = 0; i < 4; i++) {
            answer = answer + phone_number.charAt(phone_number.length() + cnt);
            cnt ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("01012345678"));
    }
}