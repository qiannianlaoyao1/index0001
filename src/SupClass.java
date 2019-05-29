public class SupClass extends AAA
{
    public static int a = 123;
    
    static
    {
        System.out.println("supclass init");
    }
}
class AAA{
    public static int xxx = 11;
    static {

        System.out.println("yes");
    }
}
class SubClass extends SupClass
{
    static int x = 100;
    static
    {
        System.out.println("subclass init");
    }
}

class Test
{
    public static void main(String[] args)
    {
        System.out.println(SubClass.xxx);
    }
}