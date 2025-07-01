import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        // time complexity O(n) hai.
        System.out.println(sb.length());
        System.out.print(sb);
    }
}
