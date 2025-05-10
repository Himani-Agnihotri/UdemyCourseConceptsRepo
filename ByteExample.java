public class ByteExample {
    static byte var;
    public static void main(String args[]){

        //-128 to 127
        byte a=127;
        byte b=1;
        byte sum= (byte) (a+b);
        System.out.println(sum); //default value is always assigned to class member variables only
    }
}
