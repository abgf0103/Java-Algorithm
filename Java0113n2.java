public class Java0113n2 {
    public static long solution(int price, int money, int count) {
        long sum = 0;
        long answer = -1;
        for(int i=1; i <= count; i++){
            sum += price*i;
        }
        if(sum<money){
            return 0;
        }
        return sum-money;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}