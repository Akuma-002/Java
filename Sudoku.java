public class Sudoku {
    public static boolean sudoku(int arr[][], int row , int col){
        if(row == 9 && col == 9){
            return true;
        }
        else if (row == 9){
            return false;
        }
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(arr[row][col] != 0){
            return sudoku(arr, nextRow, nextCol);
        }
        for(int i = 1; i <= 9; i++){
            if(isSafe(arr, row, col, i)){
                arr[row][col] = i;
                if(sudoku(arr, nextRow, nextCol)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int arr[][], int row, int col, int digit){
        for(int i = 0; i < 9; i++){
            if(arr[i][col] == digit){
                return false;
            }

        }
        for(int j = 0; j < 9; j++){
            if(arr[row][j] == digit){
                return false;
            }
        }
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i = sr; i < sr +3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(arr[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        System.out.println(sudoku(sudoku, 0, 0));
    }
}
