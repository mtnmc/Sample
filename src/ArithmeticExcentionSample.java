
public class ArithmeticExcentionSample {

    public static void main(String[] args) {
        // int型１０をint型0で除算
        //int a = 10 / 0; // ここで、例外が発生！

        // この下の出力は実行されない！！
        //System.out.println(a);

        // double型１０．０をdouble型０．０で除算
        double a = 10.0 /0.0;

        // この下の出力は実行される！
        System.out.println(a);

    }

}
