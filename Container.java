public class Container {
    public static int container(int arr[]){
        int size = arr.length;
        int bigs[] = new int [arr.length];
        for (int i = 0; i < arr.length-1; i++){
            bigs[i] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if((arr[j] > bigs[i])&&(arr[j] != bigs[i-1])){
                    bigs[i] = arr[j];
                }
            }
        }
        for(int i = 0; i <bigs.length; i++){
            System.out.println(bigs[i]);
        }
        return 0;
    }
    
    public static void main(String [] args){
        int arr [] = {1, 2, 3, 4};
        container(arr);
    }
}
