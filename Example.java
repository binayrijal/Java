 class Parent{
 String name;
 int id;
 int salary;
 public Parent(String name,int id,int salary){
 this.name=name;
 this.id=id;
 this.salary=salary;
    }
 public int Yearly(){
 return this.salary*12;
    }
 public String toString(){
  return "name="+this.name+"id="+this.id;
    }
}
class Child extends Parent{
 int nClassess;
public Child(String name,int id,int salary,int nClassess){
 super(name,id,salary);
 this.nClassess=nClassess;
  } 
  public int yearly(){
  return super.Yearly()+this.nClassess*100;
   }
  public String toString(){
  return "name="+this.name+"id="+this.id;
   }
}
class Example{
 public static void main(String[] args){
 Child c=new Child("bin",45,3,8);
 c.Yearly();
 c.toString();
}
}
 
 
 