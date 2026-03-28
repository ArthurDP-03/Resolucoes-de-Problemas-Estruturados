public class FloodFill {
    private Queue<Integer> fila = new Queue<>();
    private int[][] matriz = new int[8][8];

    public FloodFill(){

    }
    public void carregar(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i + j == 7) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

}
