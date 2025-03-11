public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        int mid = si + (ei - si)/2;
        if(si >= ei){
            return;
        }
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp [k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        for(int p = 0; p < arr.length; p++){
            arr[p] = temp[p];
        }
    }
    public static void main(String [] args){
        int arr [] = {5, 4, 3, 2, 2, 1};
        mergeSort(arr, 0, (arr.length) - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
