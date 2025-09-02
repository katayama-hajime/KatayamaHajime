package jikkou;

public class Sub {
	private String name;
	private double sinntyou;
	private int sokudo;
	private String gakumei;

	// コンストラクタ
	public Sub(String name) {
		// 空文字チェック
		if (name == null || name.isEmpty()) {
			System.exit(0);
		}
	}

	/**
	 * 入力値を出力するメソッド
	 * @param name 動物情報
	 */
	public void outPut(String name) {
		String[] items = name.split(",");
		String[] arr = { "動物名", "体長", "速度", "学名" };
		for (int i = 0; i < items.length; i++) {
			String[] animalInf = items[i].split(":");
			for (int j = 0; j < animalInf.length; j++) {
				System.out.println("動物名:" + animalInf[0]);
				System.out.println("体長:" + animalInf[1] + "m");
				System.out.println("速度:" + animalInf[2] + "km/h");
				System.out.println("学名:" + getgakumei(animalInf[0]));
				System.out.println();
				break;
//				System.out.println(arr[j] + animalInf[j] + getgakumei(animalInf[0]));
				}
						
			}
	}
	
	/**
	 * 動物名から学名を取得するメソッド
	 * @param name 動物名
	 * @return 学名
	 */
	private String getgakumei(String name) {
		switch (name) {
		case "ライオン": return "パンテラ レオ";
		case "ゾウ": return "ロキソドンタ・サイクロティス";
		case "パンダ": return "アイルロポダ・メラノレウカ";
		case "チンパンジー": return "パン・トゥログロディテス";
		case "シマウマ": return "チャップマンシマウマ";
		default: return "不明";
		            }
		        }
	}
//	        public String getName() { return name; }
//	        public double getLength() { return sinntyou; }
//	        public int getSpeed() { return sokudo; }
//	        public String getScientificName() { return gakumei; }
