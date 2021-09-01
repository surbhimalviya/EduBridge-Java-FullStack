interface A{
void info();
interface B{
void info_one();
}}
class Nested implements A.B{
public void info_one()
{
System.out.println("Nested interface");
}
}
public class interface_nested{
public static void main (String[] args){
Nested N =new Nested();
N.info_one();
}
}