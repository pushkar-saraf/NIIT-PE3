public class Q5 {
    public static void main(String[] args) {
        boolean[][] chessboard = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = (i%2==0&&j%2==0);
                if (chessboard[i][j]){
                    System.out.print("WW");
                } else {
                    System.out.print("BB");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
