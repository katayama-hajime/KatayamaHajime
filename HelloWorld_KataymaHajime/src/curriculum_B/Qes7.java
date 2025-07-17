package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int students;
	{

		// 生徒の人数を入力（2以上）
		while (true) {
			System.out.print("生徒の人数を入力してください（2以上）");
			students = scanner.nextInt();
			if (students >= 2)
				break;
			System.out.println("2以上の人数を入力してください。");
		}

		String[] subjects = { "英語", "数学", "理科", "社会" };
		int[][] scores = new int[students][subjects.length];
		double[] subjectTotal = new double[subjects.length];

		// 各生徒の各科目の点数を入力
		for (int i = 0; i < students; i++) {
			System.out.println((i + 1) + "人目の成績入力：");
			for (int j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
				scores[i][j] = scanner.nextInt();
				subjectTotal[j] += scores[i][j];
			}
		}

		// 個人平均の出力
		for (int i = 0; i < students; i++) {
			double sum = 0;
			for (int j = 0; j < subjects.length; j++) {
				sum += scores[i][j];
			}
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, sum / subjects.length);
		}

		// 科目別平均の出力
		for (int j = 0; j < subjects.length; j++) {
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectTotal[j] / students);
		}

		// 全体平均の出力
		double totalSum = 0;
		for (double subjectSum : subjectTotal) {
			totalSum += subjectSum;
		}
		double overallAvg = totalSum / (students * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

		scanner.close();
	}
	
}
}