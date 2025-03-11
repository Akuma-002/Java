import java.util.ArrayList;

public class Mostwater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int max = 0;
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                if(height.get(i) <= height.get(j)){
                    int temp = height.get(i) * (j -i);
                    if(temp >= max){
                        max = temp;
                    }
                }
                else if(height.get(j) < height.get(i)){
                    int temp = height.get(j) * (j - i);
                    if(temp >= max){
                        max = temp;
                    }
                }
            }
        }
        System.out.println(max);

    }
}
