import java.io.*;
class Copy{
public static void main(String[] args){
try{
FileInputStream fis=new FileInputStream("new.txt");
FileOutputStream fos=new FileOutputStream("nextnew.txt");
int content;
while((content=fis.read())!=-1){
fos.write(content);
}
fos.close();
fis.close();
}catch(IOException e){
System.out.println(e.getMessage());
}
}

}