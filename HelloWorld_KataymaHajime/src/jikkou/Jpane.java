package jikkou;
import syori.Process;
public class Jpane {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Process aisatu1 = new Process("こんにちは","日本","寿司","うまい","和食");
		System.out.println(aisatu1.aisatu() + "!" + "ここは" + aisatu1.kuni() + "です！");
		System.out.println("この" + aisatu1.tabemono() + "は" + aisatu1.mikaku());
		System.out.println(aisatu1.tabemono() + "は" + aisatu1.syoku() + "です");
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd H:m:s");
        //SimpleDateFormatで今の時間を調整している
        String hizuketojikann = sdf.format(new java.util.Date());
        //java.util.Dateで現在の時間を出力している
        System.out.println("現在の日時: " + hizuketojikann);
	}
}