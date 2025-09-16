package question25execution;

import java.util.Scanner;

import question25process.Sabustetasu;

public class Nouryoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        String userName = scanner.nextLine();
        Sabustetasu player = new Sabustetasu(); // コンストラクタで初期化
        System.out.println("こんにちは 「" + userName + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getSpeed());
        System.out.println("防御力：" + player.getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
        scanner.close();
    }
}