class Computer{
String bname;
int ptype;
Storage s;
public Computer(String bname,int ptype,Storage s){
this.bname=bname;
this.ptype=ptype;
this.s=s;
}
public void display(){
System.out.println("bname"+this.bname+"ptype"+ptype);
this.s.showinfo();
}
}
class Storage{
boolean ssd;
public Storage(boolean ssd){
this.ssd=ssd;
}
public void showinfo(){
System.out.println(this.ssd);
}
}
class Contain{
public static void main(String[] args){
Storage sto=new Storage(true);
Computer com=new Computer("acer",64,sto);
com.display();
}
}