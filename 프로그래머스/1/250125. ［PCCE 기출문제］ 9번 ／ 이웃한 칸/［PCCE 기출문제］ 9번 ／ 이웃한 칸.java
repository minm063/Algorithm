class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        // (h-1, w), (h, w-1), (h+1, w), (h, w+1)
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int h_check = 0, w_check = 0;
        int board_h = board.length, board_w = board.length;
        
        for (int i = 0;i < 4;i++) {
            h_check = h + dh[i];
            w_check = w + dw[i];
            if ((h_check >= 0 && h_check < board_h) && (w_check>=0&&w_check<board_w)&&board[h_check][w_check].equals(board[h][w])) {
                answer++;
            }
        }
        return answer;
    }
}