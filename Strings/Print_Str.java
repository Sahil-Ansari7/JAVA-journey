import java.util.*;;
public class Print_Str {
    public static void PrintStr(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String fullName = "Sahil Ansari";
        PrintStr(fullName);

    }
}
