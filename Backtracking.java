public class Backtracking {
    public static void changeArray(int arr[], int i, int value){
        if(i == arr.length){
            return;
        }
        arr[i] = value;
        changeArray(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = new int [5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
}
