import java.util.ArrayList;

public class Mostwater2 {
    public static void main(String [] args){
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
        int lp = 0, rp = height.size() - 1;
        while(lp != rp){
            if(height.get(lp) <= height.get(rp)){
                int temp = height.get(lp) * (rp - lp);
                if(temp >= max){
                    max = temp;
                }
                lp++;
            }
            else if(height.get(rp) < height.get(lp)){
                int temp = height.get(rp) * (rp - lp);
                if(temp >= max){
                    max = temp;
                }
                rp--;
            }
            
        }
        System.out.print(max);
    }
}
