class Animal {
String breed;
String color;
void Sound(){
System.out.println("Growl !!");
}
public static void main(String args[])
{
Animal a=new Animal();
Dog b=new Dog();
Cat c=new Cat();
a.Sound();
b.Sound();
c.Sound();
}
}
class Dog extends Animal{
String breed;
String color;
void Sound(){
System.out.println("Bark !!");
}
}
class Cat extends Animal{
String breed;
String color;
void Sound(){
System.out.println("Meow !!");
}
}