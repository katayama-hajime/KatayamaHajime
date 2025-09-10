package question19execution;

public class Dog {
	// Q1: 動物の名前の変数
    private String doubutunamea1;
    
    // Q2: 動物の数の変数
    private int doubutunokazu1;

    // Q3: 「犬」を代入するコンストラクタ
    public Dog() {
        this.doubutunamea1 = "犬";
    }

    // Q4: 数を引数で受け取るコンストラクタ
    public Dog(int count) {
        this.doubutunokazu1 = count;
    }

    // 名前取得メソッド
    public String doubutunokazu2() {
        return doubutunamea1;
    }

    // 数取得メソッド
    public int getAnimalCount2() {
        return doubutunokazu1;
}
}