package oops_SuperKeyword.usesOf_superkeyword;
//// to refer immediate parent class instance
public class Use1 extends C{
    int a = 20;
    void show(int a){
        System.out.println(super.a);  /// 10
        System.out.println(this.a);  ///  20
        System.out.println(a);       ///  11
    }

    public static void main(String[] args) {
        Use1 obj = new Use1();
        obj.show(11);
    }
}
class C{
    int a = 10;
}
