public class FindSubset {
    public static void findSubset(String word, String ans, int i){
        //base case
        if(i == word.length()){
            System.out.println(ans);
            return;
        }
        //recursion 
        //Yes choice
        findSubset(word, ans+word.charAt(i), i+1);
        //No choice
        findSubset(word, ans, i+1);
    }
    public static void main(String[] args){
        findSubset("word", "", 0);
    }
}
