import java.util.*;

public class PrintTable {
    public static void printTable(int n) {
        for(int i = 0; i <= 10; i++)
            System.out.println(n + " * " + i + " = " + n * i);
        
    }
    public static void main(String[] args) {
        int n = 4;
        printTable(n);
    }
    
}
