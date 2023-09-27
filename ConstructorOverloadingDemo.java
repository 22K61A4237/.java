import java.io.*;
import java.util.*;
class square {
int s;
square();
s = 5;
}
square(int x){
s = x;
}
void area(){
System.out.println("Area of square is"+s*s);
}
}
class ConstructorOverloadingDemo{
public static void main(String args[]){
square s1=new square();
square s2=new square();
s1.area();
s2.area();
}
}