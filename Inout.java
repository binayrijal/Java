import java.io.*;
import java.util.Scanner;

class Inout{
public static void main(String[] args){
try{
FileOutputStream fout=new FileOutputStream("new.txt");
String a="ncit";
byte [] b=a.getBytes();
fout.write(b);
fout.close();
}catch(Exception e){
System.out.println(e.getMessage());
System.out.println("error");
}
}
}
