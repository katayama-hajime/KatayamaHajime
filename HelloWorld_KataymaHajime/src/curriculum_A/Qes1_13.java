package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {

	public static void main(String[] args) {
		// 問題①
		byte b;
		short s;
		int i;
		long l0;
		float f;
		double d5;
		char c;
		String str;
		boolean b1;

		// 問題②
		b = 0;
		s = 0;
		i = 0;
		l0 = 0L;
		f = 0.0f;
		d5 = 0.0d;
		c = '\u0000';
		str = "";
		b1 = false;
		// 問題③
		b = 10;
		s = 100;
		i = 1000;
		l0 = 10000L;
		f = 9.5f;
		d5 = 10.5d;
		c = 'a';
		str = "ハロー";
		b1 = true;
		//　問題④
		System.out.println(b + s + i + l0);
		System.out.println(f + d5);
		System.out.println(c + str + b1);
		double sam = b + s + i + l0 + f + d5;
		System.out.println((int) sam);
		System.out.println(b * s * i * l0);
		System.out.println(d5 / s);
		System.out.println(b - s);
		// 問題⑤
		String num = "4";
		int num1 = 3;
		System.out.println("ハローJAVA" + (num + num1));
		// 問題⑥
		String naime = "山田太郎";
		int age = 18;
		float height = 170.5f;
		double weight = 62.2;
		String favoriteFood = "寿司";
		System.out.println("初めまして" + naime + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("体重は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		//　問題⑦
		double bmi = weight / ((height / 100) * (height / 100));
		bmi = (double) Math.round(bmi * 100) / 100;
		System.out.println("BMIは" + bmi + "です");

		// 問題⑧
		naime = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2d;
		favoriteFood = "オムライス";
		System.out.println("初めまして" + naime + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("体重は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		bmi = weight / ((height / 100) * (height / 100));
		// 変数beforeBmiを宣言し四捨五入する変数bmiを代入
		BigDecimal beforeBmi = new BigDecimal(bmi);
		// setScaleメソッドで小数第2位を四捨五入する
		BigDecimal afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		//　問題⑨
		age = age + age;
		height += height;
		weight += weight;
		favoriteFood = "オムライス";
		System.out.println("初めまして" + naime + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("体重は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		bmi = weight / ((height / 100) * (height / 100));
		// 変数beforeBmiを宣言し四捨五入する変数bmiを代入
		beforeBmi = new BigDecimal(bmi);
		// setScaleメソッドで小数第2位を四捨五入する
		afterBmi = beforeBmi.setScale(2, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		//　問題⑩
		age = 25; // 年齢を25に設定
		boolean isAdult = age >= 25; // 25歳以上ならtrue
		System.out.println(isAdult); // 結果を出力
		// 問題⑪
		naime = "鈴木一郎";
		System.out.println("初めまして" + naime + "です");
		String str1 = "身長は";
		String str2 = "cmです";
		String str3 = str1 + "168.5 " + str2;
		System.out.println(str3);
		String str4 = "体重は";
		String str5 = "ｋｇです";
		String str6 = str4 + "64.2 " + str5;
		System.out.println(str6);
		favoriteFood = "オムライス";
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		bmi = weight / ((height / 100) * (height / 100));
		// 変数beforeBmiを宣言し四捨五入する変数bmiを代入
		beforeBmi = new BigDecimal(bmi);
		// setScaleメソッドで小数第2位を四捨五入する
		afterBmi = beforeBmi.setScale(2, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		//　問題⑫
		naime = "鈴木一郎";
		System.out.println("初めまして" + naime + "です");
		int age1 = 24;
		float height1 = 168.5f;
		weight = 64.2d;
		favoriteFood = "オムライス";
		System.out.println("年齢は " + age1 + "歳です");
		System.out.println("身長は" + height1 + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		bmi = weight / ((height / 100) * (height / 100));
		// 変数beforeBmiを宣言し四捨五入する変数bmiを代入
		beforeBmi = new BigDecimal(bmi);
		// setScaleメソッドで小数第2位を四捨五入する
		afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		//　問題⑫
		age = 25;         // 年齢をここで設定
        height = 158;     // 身長をここで設定

        boolean result = (age == 25 || height >= 160);
        System.out.println(result);
	}
}