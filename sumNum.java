 class sumNum{
    void show(){
        System.out.println("ONE");
    }
}
 class Test extends sumNum{
    void show(){
    System.out.println("two");
    }
    public static void main(String[] args) {
      //  sumNum S=new sumNum();
        //S.show();
        Test t=new Test();
        t.show();
    }
} 