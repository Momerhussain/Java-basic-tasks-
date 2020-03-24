 class Card
{
void greeting()
{
System.out.print("\nHere Are The Greetings");
System.out.print("\n======================");
System.out.print("\n======================");
}
}
class Valentine extends Card
{
void greeting()
{
super.greeting();
System.out.print("\n\n*1) Happy Valentine Day");
}
}
class Birthday extends Card
{
void greeting()
{
System.out.print("\n\n*2) Happy Birth Day");
}
}
class Holiday extends Card
{
void greeting()
{
System.out.print("\n\n*3) Happy Summer Days\n");
}
}
public class GreetCollect
{
public static void main(String args[])
{
Valentine v=new Valentine();
Birthday b=new Birthday();
Holiday h=new Holiday();
v.greeting();
b.greeting();
h.greeting();
}
}