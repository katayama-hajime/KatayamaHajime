package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 問題
		String text = scanner.nextLine();
		if (text == null || text.isEmpty()) {
			System.out.println("名前を入力して下さい。");
		} else if (text.length() >= 10) {
			System.out.println("名前を10文字以内にしてください");
		} else if (!text.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字のみで名前を入力してください");// 問題２
		} else {
			System.out.println("ユーザー名を" + text + "登録しました");
			String[] hands = { "グー", "チョキ", "パー" };

			Random random = new Random();
			int count = 0;

			while (true) {
				count++;

				int player = random.nextInt(3); // 自分の手
				int opponent = random.nextInt(3); // 相手の手

				System.out.println(text + "の手は「" + hands[player] + "」");
				System.out.println("相手の手は「" + hands[opponent] + "」");

				if (player == opponent) {
					System.out.println("DRAW あいこ もう一回しましょう！\n");
				} else if ((player == 0 && opponent == 1) ||
						(player == 1 && opponent == 2) ||
						(player == 2 && opponent == 0)) {
					System.out.println("→ 勝ち！");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					break;
				} else {
					System.out.println("→ 負け");

					if (player == 0 && opponent == 2) {
						System.out.println("俺の勝ち！");
						System.out.println("なんで負けたか、明日まで考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです\n");
					} else if (player == 1 && opponent == 0) {
						System.out.println("俺の勝ち！");
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！\n");
					} else if (player == 2 && opponent == 1) {
						System.out.println("俺の勝ち！");
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ\n");
					}
					System.out.println("じゃんけんを行った回数は " + count + " 回です");
					System.out.println("勝つまでにかかった合計回数は " + count + " 回です");
				}
			}
		}
		scanner.close();
	}
}