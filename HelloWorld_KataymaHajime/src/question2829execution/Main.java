package question2829execution;

import java.util.Arrays;
import java.util.Scanner;

import question2829process.FruitMap;

public class Main {
	public static void main(String[] args) {
		FruitMap map = new FruitMap();
		map.Put();
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		String input = scanner.nextLine();
		String[] strNumbers = input.split(",");
		Integer[] numbers = new Integer[strNumbers.length];
		for (int i = 0; i < strNumbers.length; i++) {
			numbers[i] = Integer.parseInt(strNumbers[i]);
		}
		System.out.println("昇順降順を入力してください。");
		String ascending = scanner.nextLine();
		if (ascending.equals("昇順")) {
			Arrays.sort(numbers);
		} else if (ascending.equals("降順")) {
			Arrays.sort(numbers, (a, b) -> b - a);//番号の並び替え
		} else {
			System.out.println("昇順降順を正しく入力してください。");
		}
		for (Integer key : numbers) {
			String value = map.getValue(key);
			if (value != null) {
				String[] strCoron = value.split(":");
				double agedouble = Double.parseDouble(strCoron[2]);
				System.out.println("都道府県名:" + strCoron[0]);
				System.out.println("県庁所在地:" + strCoron[1]);
				System.out.println("面積:" + agedouble + "km2");
				System.out.println();
			}
		}
		scanner.close();
	}
}