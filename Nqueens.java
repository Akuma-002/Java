public class Nqueens{
    public static int flag = 0;
    public static void nQueens(char arr[][], int row){
        if(row == arr.length){
            flag++;
            printboard(arr);
            return;
        }
        for(int j = 0; j < arr.length; j++){
            if(isSafe(arr, row, j)){
                arr[row][j] = 'Q';
                nQueens(arr, row+1);
                arr[row][j] = 'x';
            }
            
        }
    }

    public static boolean isSafe(char arr[][], int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        
        for(int i = row -1, j = col - 1; i>=0 && j >=0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row -1, j = col+1; i>=0 && j <arr.length; i--, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        
        return true;
    }

    public static void printboard(char arr[][]){
        System.out.println("----------------");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 4;
        char chess[][] = new char [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chess[i][j] = 'x';
            }
        }
        nQueens(chess, 0);
        System.out.println(flag);
    }
}