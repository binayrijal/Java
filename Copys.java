import java.io.*;
class Copys{
public static void main(String[] args){
try{
FileInputStream fis=new FileInputStream("new.txt");
FileOutputStream fos=new FileOutputStream("copied.txt");
int cons;
while((cons=fis.read())!=-1){
  fos.write(cons);
}
fis.close();
fos.close();

}catch(IOException e){
System.out.println(e.getMessage());
}
}

}