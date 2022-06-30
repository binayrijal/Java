class Computer{
 String brand;
 int processor;
 Storge s;
public Computer(String brand,int processor,Storge s){
 this.brand=brand;
 this.processor=processor;
 this.s=s;
}
public void displayInfo(){
System.out.println(this.brand+"processor"+this.processor);
this.s.showInfo();
}
}
class Storge{
boolean ssd=true;
public Storge(boolean ssd){
 this.ssd=ssd;
}
public void showInfo(){
System.out.println(this.ssd);
}

}
class Composite{
public static void main(String[] args){
Storge s=new Storge(512);
Computer c=new Computer("acer",64,s);
c.displayInfo();


}
}