class B {
    public static int reverseBits(int n) {
        String temp = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(temp);
        while(sb.length() <32){
            sb.insert(0, '0');
        }
        sb.reverse();
        return (int)Long.parseLong(sb.toString(), 2);
    }
    public static void main(String args[]){
        System.out.println(reverseBits(43261596));
    }
}