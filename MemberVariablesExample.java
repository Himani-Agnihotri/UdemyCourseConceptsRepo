public class MemberVariablesExample {
    int memberVariable;
    static int staticVariable = 100;

    MemberVariablesExample(){

    }

    MemberVariablesExample(int a){

    }
    public void dummyMethod(){
        byte localVariable = 20;
        System.out.println(localVariable);
        System.out.println(staticVariable);
    }

    public int dummyMethod2(int a, int b){
        byte localVariable = 20;
        System.out.println(localVariable);
        return a+b;
    }

    public static void main(String args[]){

        System.out.println(staticVariable);

    }


}
