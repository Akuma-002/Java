import java.util.ArrayList;
public class Pairsum {
    public static Boolean check(ArrayList<Integer>list){
        int lp = 0, rp = list.size() - 1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == 5){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < 5){
                lp++;
            }
            else if(list.get(lp) + list.get(rp) > 5){
                rp--;
            }
        }
        return false;
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); 
        list.add(5);
        list.add(6);
        System.out.println(check(list));
    }
}
