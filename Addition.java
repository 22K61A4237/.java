//java program to add two integers
//21-08-23
//Satya
//Adittion.java
import java.io.*;
import java.util.*;
class Addition extends Object{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter first integer ");
int i1=sc.nextInt();
System.out.print("enter second interger ");
int i2=sc.nextInt();
int i3=i1+i2;
System.out.println("sum of "+i1+" and "+i2+" is "+i3);
}
}