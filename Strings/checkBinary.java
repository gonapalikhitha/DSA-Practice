public class checkBinary {
    public static boolean checkBinary(String s){
        int n = s.length();
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) != 0 || s.charAt(i) != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s ="Geek10101";
        System.out.println(checkBinary(s));
    }
    
}
