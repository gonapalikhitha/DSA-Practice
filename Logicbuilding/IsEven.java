public class IsEven {
    public static boolean isEven(int n){
        int rem = n % 2;
        if(rem == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.println(isEven(num));
    }
}
