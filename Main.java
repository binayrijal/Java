public abstract class Animal{
 final int tail=1;
 public abstract void Sound();
 public void Walk(){
 System.out.println("walking");
}
}
class Bird extends Animal{
public void Sound(){
 System.out.println("chipir");
}
}
class Main{
public static void main(String [] args){
 Bird b=new Bird();
 b.Sound();
 b.Walk();

}

}