# year
import java.io.*;
import java.util.*;
public class year{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k;
System.out.println("Enter the year");
k=sc.nextInt();
if((k%4 == 0) && (k%100!=0)){
System.out.println("The Leaf year");
}
else if(k%100 == 0){
System.out.println("The not a Leaf year");
}
else if(k%400 == 0){
System.out.println("The Leaf year");
}
else
System.out.println("The not a Leaf year");
}
}
