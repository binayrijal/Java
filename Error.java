import java.io.*;
import java.util.Scanner;

class InvalidAgeException extends Exception{
public InvalidAgeException(String msg){
super(msg);
}
}
class Voter{
String name;
int age;
public Voter(String name,int age) throws InvalidAgeException{
if(age<18){
throw new InvalidAgeException("invalid age");
}
else{
this.name=name;
this.age=age;
System.out.println("name= "+name+" "+"age= "+age);
}
}
}
class Error{
public static void main(String [] args){
try{
Voter v=new Voter("binay",45);
}catch(InvalidAgeException e){
System.out.println(e.getMessage());
}
}
}