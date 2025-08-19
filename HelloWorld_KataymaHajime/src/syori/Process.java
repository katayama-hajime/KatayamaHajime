package syori;

public class Process {
	String aisatu;
	private String kuni;
	private String tabemono;
	private String mikaku;
	private String syoku;
	public Process(String string1,String string2,String string3,String string4,String string5) {
		this.aisatu =string1;
	    this.kuni = string2;
	    this.tabemono = string3;
	    this.mikaku = string4;
	    this.syoku = string5;
	}
	public String aisatu() {
			return aisatu;
	}
	public String kuni() {
		return kuni;
	}
	public String tabemono() {
		return tabemono;
	}
	public String mikaku() {
		return mikaku;	
	}
	public String syoku() {
		return syoku;
	}
}