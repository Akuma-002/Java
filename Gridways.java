public class Gridways {
    public static int gridWays(int arr[][], int i , int j, int way){
        if(i == arr.length -1 || j == arr[0].length -1){
            way++;
            return way;
        }
        else if (i == arr.length || j == arr[0].length){
            return 0;
        }
        int w1 = gridWays(arr, i, j+1, way);
        int w2 = gridWays(arr, i+1, j, way);
        return w1+w2;
    }
    public static void main(String[] args){
        int arr[][] = new int [10][10];
        System.out.println(gridWays(arr, 0, 0, 0));
    }
}
