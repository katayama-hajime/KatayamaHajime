package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("商品を「、」区切りで入力してください：");
        String[] items = scanner.nextLine().split("、");
        scanner.close(); // 入力ストリームのクローズ
        int tv = rand.nextInt(12);
        int disp = 11 - tv ;
           
        for (String item : items) {
            int stock = rand.nextInt(12); // 0〜11のランダム値

            switch (item) {
                case "テレビ":
                case "ディスプレイ":
                    System.out.println(
                        item.equals("テレビ")
                        ? item + "の残り台数は" + tv + "台です"
                        : item +  "の残り台数は" + disp + "台です"
                    );
                    break;

                case "パソコン":
                    
                case "冷蔵庫":
                	
                case "洗濯機":
                	
                case "扇風機":
                	
                case "加湿器":
                	System.out.println( item + "の残り台数は" + stock + "台です");
                    break;

                default:
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    break;
            }
        }   
    }
}