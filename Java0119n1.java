public class Java0119n1 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int area = brown + yellow;
        for (int row = area; row > 1; row--) {
            if (area % row == 0) {
                int col = area / row;
                if ((row * 2 + (col - 2) * 2) == brown) {
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 1));
    }
}