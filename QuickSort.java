public class QuickSort {
    public static int partition(int arr[], int si, int ei){
        int i = si-1;
        int pivot = arr[ei];
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int part = partition(arr, si, ei);
        quickSort(arr, si, part-1);
        quickSort(arr, part+1, ei);

    }
    public static void main(String[] args){
        int arr[] = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
