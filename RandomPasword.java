import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;
import java.util.Scanner.*;
class Password
{
    String  generate(int length,String complexity )
    {
String lowercase="abcdefghijklmnopqrstuvwxyz";
String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String Digit="0123456789";
String special_symbol="!@#$%^&*()_-+=<>?";
StringBuilder sb=new StringBuilder();
String varchar="";
if(complexity.equals("low"))
{
    varchar=lowercase+uppercase+Digit;
}
else if(complexity.equals("medium"))
{
    varchar=lowercase+uppercase+Digit+special_symbol;

}
else if (complexity.equals("high")){
    varchar=lowercase+uppercase+Digit+special_symbol+special_symbol.toUpperCase();
}
else {
    System.out.println("SORRY YOU ENTER OVER EXCITED PASSWORD LIKE LOW, MEDIUM, HIGH...ENTER PASSWORD IN LOW,MEDIUM,HIGH COMPLEXITY LEVEL");
    return "";
}
        Random random1=new Random();
for(int i=0;i<length;i++)
{
    int id=random1.nextInt(varchar.length());
    sb.append(varchar.charAt(id));
}
        return  sb.toString();
    }
}

public class RandomPasword {
    public static  void main(String []args)
    {
        Password obj=new Password();
        Scanner sc=new Scanner(System.in);
boolean exit=false;

        while(!exit)
        {
System.out.println("*******RANDOM PASSWORD GENERATOR");
System.out.println("1.Generate Password");
System.out.println("2.Exit");
System.out.println("Enter your choice");
int choice=sc.nextInt();
switch (choice)
{
    case 1:System.out.println("ENTER PASSWORD LENGTH");
    int length=sc.nextInt();
    System.out.println("ENTER PASSWORD COMPLEXITY");
    String complexity=sc.next();
    String password=obj.generate(length,complexity);
    System.out.println("PASSWORD  IS "+password);
    break;
    case 2:System.out.println("GOOD BYE NO PASSWORD GENERATED");
    exit=true;
    break;
    default:System.out.println("WRONG CHOICE");
}


    }
}}
