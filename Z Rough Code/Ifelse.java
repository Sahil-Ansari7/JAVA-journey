// import java.util.*;
// public class Ifelse {

//     public static void main(String args[]) {
//         int month = 4; // April
//         String season;
//         if(month == 12 || month == 1 || month == 2)
//         season = "Winter";
//         else if(month == 3 || month == 4 || month == 5)
//         season = "Spring";
//         else if(month == 6 || month == 7 || month == 8)
//         season = "Summer";
//         else if(month == 9 || month == 10 || month == 11)
//         season = "Autumn";
//         else
//         season = "Bogus Month";
//         System.out.println("April is in the " + season + ".");
//         }
// }




import java.util.*;
public class Ifelse {

    public static void main(String args[])
throws java.io.IOException {
char choice;
do {
System.out.println("Help on:");
System.out.println(" 1. if");
System.out.println(" 2. switch");
System.out.println(" 3. while");
System.out.println(" 4. do-while");
System.out.println(" 5. for\n");
System.out.println("Choose one:");
choice = (char) System.in.read();
} while( choice < '1' || choice > '5');
System.out.println("\n");
switch(choice) {
case '1':
System.out.println("The if:\n");
System.out.println("if(condition) statement;");
System.out.println("else statement;");
break;
case '2':
System.out.println("The switch:\n");
System.out.println("switch(expression) {");
System.out.println(" case constant:");
System.out.println(" statement sequence");
System.out.println(" break;");
System.out.println(" // ...");
System.out.println("}");
break;
case '3':
System.out.println("The while:\n");
System.out.println("while(condition) statement;");
break;
case '4':
System.out.println("The do-while:\n");
System.out.println("do {");
System.out.println(" statement;");
System.out.println("} while (condition);");
break;
case '5':
System.out.println("The for:\n");
System.out.print("for(init; condition; iteration)");
System.out.println(" statement;");
break;
}
}
}
