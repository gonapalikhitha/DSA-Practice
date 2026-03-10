import javax.sound.midi.SysexMessage;

public class areStringsame {
    public static boolean areStringsame(String s1, String s2){
        return(s1.equals(s2));
    }
public static void main(String[] args){
    String s1 = "abc";
    String s2 = "abcd";
    if(areStringsame(s1, s2)){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}    
}

