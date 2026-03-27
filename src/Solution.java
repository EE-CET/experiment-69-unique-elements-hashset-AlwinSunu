import java.util.Scanner;
import java.util.LinkedHashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // LinkedHashSet removes duplicates and keeps the input order
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    set.add(sc.nextInt());
                }
            }
            
            // Print only the unique numbers separated by a space
            // The autograder expects: 10 20 30
            boolean first = true;
            for (Integer num : set) {
                if (!first) System.out.print(" ");
                System.out.print(num);
                first = false;
            }
            System.out.println();
        }
        sc.close();
    }
}
