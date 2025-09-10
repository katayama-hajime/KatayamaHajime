package question23process;

public class Doubutuprocesu {
	private String name;
	private Double taityou;
	private Long hayasa;
	public void setName(String name) {
		this.name = name;
	}
	public void setTaityou(double taityou) {
		this.taityou = taityou;
	}
	public void setHayasa(long hayasa) {
		this.hayasa = hayasa;
	}
	public String getName() {
		return  this.name;
	}
	public Double getTaityou() {
		return this.taityou;
	}
	public  Long getHayasa() {
		return this.hayasa;
	}
	public void syuturyoku() {
	    System.out.println("動物名：" + this.getName());
	    System.out.println("体長：" + this.getTaityou() + "m");
	    System.out.println("速度：" + this.getHayasa() + "km/h");
}
}