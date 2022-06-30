import java.io.*;
import java.util.Scanner;
class Mixed{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
try{
FileOutputStream fos=new FileOutputStream("user.txt");
DataOutputStream dos=new DataOutputStream(fos);
do{
System.out.println("enter your name");
String name=scan.next();
System.out.println("enter your salary");
int salary=scan.nextInt();
System.out.println("enter your post");
String post=scan.next();
dos.writeInt(salary);
dos.writeUTF(name);
dos.writeUTF(post);
System.out.println("enter yes or no");
String ans=scan.next();
}while(ans.toLowerCase()equals("yes"));
fos.close();
dos.close();
}catch(IOException e){
System.out.println(e.getMessage());
}
}



}