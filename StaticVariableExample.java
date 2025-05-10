class B{
    static int var =10;
    public void p(){
        System.out.println(var);
    }
}
public class StaticVariableExample {

    public static void main(String args[]){

        B.var=200;
        //System.out.println(B.var);
        B obj = new B();
        //obj.p();

        MemberVariablesExample.staticVariable=200;
        System.out.println(MemberVariablesExample.staticVariable);
        MemberVariablesExample ob= new MemberVariablesExample();
        ob.dummyMethod();
    }
}
