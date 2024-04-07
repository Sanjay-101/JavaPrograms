class test{
    int a;
    String Name;
    test (){
        a=150;
        Name="raju";
    }
    void show()
    {
        System.out.print(a+" "+Name);
    }
}
class demo{
    public static void main(String[] a)
    {
        test A = new test();
        A.show();
    }
}