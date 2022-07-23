import java.net.*;
import java.io.*;
import java.util.*;
class Multithreadserver{
public static void main(String[] args){
try{
 Scanner scan=new Scanner(System.in);
 ServerSocket ss=new ServerSocket(5000);
 System.out.println("server is running at 5000");
 while(true){
 Socket s=ss.accept();
 System.out.println("client is connected");
 MyThread t=new MyThread(s);
 t.start();
}
}catch(IOException e){
 System.out.println(e.getMessage());
}
}
}

class MyThread extends Thread{
private Socket s;
public MyThread (Socket s){
 this.s=s;
}
public void run(){
try{
DataInputStream dis=new DataInputStream(this.s.getInputStream());
int num1=dis.readInt();
DataOutputStream dos=new DataOutputStream(this.s.getOutputStream());
dos.writeInt(num1);
dis.close();
dos.close();
s.close();
}catch(IOException e){
 System.out.println(e.getMessage());
}
}
}

