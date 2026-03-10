public class ReverseString {
    public static String reverseString(String s){
       
        int left = 0;
        int right = s.length()-1;
 StringBuilder res = new StringBuilder(s);
 while(left<right){
    char temp = res.charAt(left);
    res.setCharAt(left,res.charAt(right));
    res.setCharAt(right,temp);
    left++;
    right--;
 }
 return  res.toString();

    }
    public static void main(String[] args) {
        String s ="Likhitha";
        System.out.println(reverseString(s));
    }
    
}
