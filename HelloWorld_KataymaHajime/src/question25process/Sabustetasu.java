package question25process;
public class Sabustetasu extends Superstetasu {
public Sabustetasu() {
	super();
		 setHp(randomStat());
		 setMp(randomStat());
		 setAttack(randomStat());
		 setSpeed(randomStat());
		 setDefense(randomStat());
}
	protected int randomStat() {
        return (int)(Math.random() * 1000); // 0〜999のランダムな数値
}
}