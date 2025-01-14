public class Java0114n2 {
    public static int solution(int n) {
        int answer = 0;

        String binaryNumber = Integer.toBinaryString(n);
        int oneCount = Integer.bitCount(n);

        while(true){
            n++;
            int curOneCount = Integer.bitCount(n);
            if(curOneCount == oneCount) {
                answer = n;
                return answer;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}