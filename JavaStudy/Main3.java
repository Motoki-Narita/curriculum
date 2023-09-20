
public class Main3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、int変数 plus を作成しなさい。
         int plus=0;
         plus=5+10;
         System.out.println(plus);

        // ② 20 から 7 を減算した値を代入する、変数 minus 
        int minus=0;
        minus=20-7;
        System.out.println(minus);

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // １０から２を除算した値を代入する、変数multiply
        int multiply = 10 * 2;
        System.out.println(multiply);

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi=0;
        remi=20%6;
        System.out.println(remi);

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // Stringで変数名townに文字列”有楽町”を代入。     Stringで変数名lineに文字列”線”を代入。
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train=town+line;
        System.out.println(train);

        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。

    }
}