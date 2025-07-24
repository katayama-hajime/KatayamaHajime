package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void main(String[] args) {
		text1("HelloJavaSE", 11);
		int a = 1;
		int b = 2;
		number1(a, b);
		int[] testnember1 = { 1, 2, 3, 4, 5, };
		seisu1(testnember1);
		double c = 1.1;
		double d = 2.2;
		number1(c, d);
		int[] testnember2 = seisu2(4);
		double f = heikin(testnember2);
		double average = heikin(testnember2);
		boolean result = ijyou(average);
	}

	private static void text1(String string, int number) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(string + number);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void number1(int a, int b) {
		int result = a * b;
		System.out.println("乗算の結果" + result);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void seisu1(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void number1(double c, double d) {
		double sum = c + d;
		System.out.println(String.format("%.2f", sum));
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	private static int[] seisu2(int f) {
		int[] testnember2 = new int[f];
		Random random = new Random();
		int opponent = 0;
		for (int i = 1; i <= f; i++) {
			opponent = random.nextInt(1, 100);
			testnember2[i - 1] = opponent;
		}
		System.out.println(Arrays.toString(testnember2));
		return testnember2;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	private static double heikin(int[] heikin) {
		double text2 = 0;
		for (int i = 0; i < heikin.length; i++) {
			text2 += heikin[i];
		}
		text2 = text2 / heikin.length;
		System.out.println(text2);
		return text2;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	private static boolean ijyou(double ika) {
		boolean result;
		if (ika >= 50) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
		return result;

	}
}