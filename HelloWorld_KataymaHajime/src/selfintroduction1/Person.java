package selfintroduction1;

public class Person {
	// フィールド（インスタンスが持つデータの例）
	String name; // 名前
	int age;//年齢
	double height; // 身長
	double weight; // 体重
	//コンストラクタ（インスタンス生成時に実行される）
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	}
}