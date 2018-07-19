
public class Sup  
{    int x;
    Sup() {  x = 1; }
    Sup(String str) {
        x = 2;
    }
}
public class Test extends Sup   {
    Test() {  x = 3;   }
    Test(String str) {
        x = 4;
    }
    public static void main(String args[]) {
        Sup s = new Test("abc");
        System.out.println(s.x);
   }
}
