import java.io.*;
import java.util.Scanner;
class Writer{
static Scanner scan=new Scanner(System.in);
public static void main(String[] args){

FileInputStream fis=new FileInputStream("new.txt");
int con;
while((con=fis.read())!=-1){
int a=fis.read();
System.out.println((char)a);
}
fis.close();

}
}