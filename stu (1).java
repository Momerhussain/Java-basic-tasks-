class st{
private String name;
private int id;
st(){
name="omer";
id=32;
}
st(String name , int id){
this.name=name;
this.id=id;
}
st(st s){
this.name=s.name;
this.id=s.id;
}
void rs(){
System.out.println(name+""+id);
}
}
public class stu{
public static void main(String args[]){
st obj=new st();
st obj1=new st("asad",64);
st obj2=new st(obj1);
obj.rs();
obj1.rs();
obj2.rs();
}
}