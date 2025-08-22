public class GreedyAlgorithm {
    public static int activity(int[] start, int [] end){
        int count = 1;
        int lastEnd = end[0];
        for(int i =1; i<end.length; i++){
            if(start[i] >= lastEnd){
                count++;
                lastEnd = end[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int [] arr1 = {1, 3, 0, 5, 8, 5};
        int [] arr2 = {2, 4, 6, 7, 9, 9};
        System.out.println((activity(arr1, arr2)));
    }
}
