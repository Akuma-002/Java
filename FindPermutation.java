public class FindPermutation {
    public static void findPermutation(String word, String ans){
        if(word.length() == 0){
            System.out.println(ans);
            return;
        }
        //for a
        for(int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            String newStr = word.substring(0, i) + word.substring(i+1);
            findPermutation(newStr, ans+temp);
        }
        

    }
    public static void main(String[] args){
        findPermutation("wor", "");
    }
}
