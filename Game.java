abstract class Sportperson{
  String name;
  int age;
  public Sportperson(String name,int age){
   this.name=name;
   this.age=age;
}
 public abstract void Statics();
 public void display(){
  System.out.println("name="+this.name+"age="+this.age);
}
}
class FootballPlayer extends Sportperson{
 int goal;
 public FootballPlayer(String name,int age,int goal){
 super(name,age);
 this.goal=goal;
}
public void Statics(){
 System.out.println("the no of goal is"+this.goal);
}  
}
class CricketPlayer extends  Sportperson{
int run;
public CricketPlayer (String name,int age,int run){
super(name,age);
this.run=run;
}
public void Statics(){
System.out.println("the no of run is"+this.run);

}

}
class Game{
public static void main(String[] args){
FootballPlayer f=new FootballPlayer("binay",22,2);
f.Statics();
f.display();
CricketPlayer c=new CricketPlayer("ram",33,400);
c.Statics();
c.display();

}
} 