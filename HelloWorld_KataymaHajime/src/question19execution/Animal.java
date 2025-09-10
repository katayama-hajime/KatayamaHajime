package question19execution;

public class Animal {
	public static void main(String[] args) {
        // Q1: 名前出力
        Dog dog1 = new Dog();  // 「犬」が設定される
        System.out.println("動物の名前: " + dog1.doubutunokazu2());

        // Q2: 数出力
        Dog dog2 = new Dog(4);  // 3匹と仮定
        System.out.println("動物の数: " + dog2.getAnimalCount2());

        // 現在の日時を指定形式で表示
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd H:m:s");
        //SimpleDateFormatで今の時間を調整している
        String hizuketojikann = sdf.format(new java.util.Date());
        //java.util.Dateで現在の時間を出力している
        System.out.println("現在の日時: " + hizuketojikann);
}
}