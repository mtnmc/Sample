
public class ArithmeticOperations {

    public static void main(String[] args) {
        //変数の宣言・初期化
        int num1 = 200; //int型変数num1を宣言し、１００を代入
        int num2 = 10; //int型変数num2を宣言し、１０を代入

        System.out.println("num1 + num2 = " + (num1 + num2));

        // int型変数result1を宣言し、num1とnum２の加算結果を代入
        int result1 = num1 + num2;
        //加算結果を出力
        System.out.println("num1 + num2 = " + result1);

        // int型変数result2を宣言し、num1とnum２の減算結果を代入
        result1 = num1 - num2;
        // 減算結果を出力
        System.out.println("num1 - num2 = " + result1);

        // int型変数result3を宣言し、num１とnum２の乗算結果を代入
        result1 = num1 * num2;
        // 乗算結果を出力
        System.out.println("num1 * num2 = " + result1);

        // int型変数result4を宣言し、num１とnum２の除算結果を代入
        result1 = num1 / num2;
        // 除算結果を出力
        System.out.println("num1 / num2 = " + result1);

        // int型変数result5を宣言し、num１とnum２の剰余算結果を代入
        result1 = num1 % num2;
        // 剰余算結果を出力
        System.out.println("num1 % num2 = " + result1);

    }
}
