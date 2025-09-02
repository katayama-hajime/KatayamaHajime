package syori2;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

public class FruitMap {
	Map<Integer, String> mMap = new HashMap<Integer, String>();

	public void Put() {
		// Mapにデータを格納
		mMap.put(0, "北海道" + ":" + "札幌市" + ":" + "83424");
		mMap.put(1, "青森県" + ":" + "青森市" + ":" + "9646");
		mMap.put(2, "岩手県" + ":" + "盛岡市" + ":" + "15275");
		mMap.put(3, "宮城県" + ":" + "仙台市" + ":" + "7282");
		mMap.put(4, "秋田県" + ":" + "秋田市" + ":" + "11638");
		mMap.put(5, "山形県" + ":" + "山形市" + ":" + "9323");
		mMap.put(6, "福島県" + ":" + "福島市" + ":" + "13784");
		mMap.put(7, "茨城県" + ":" + "水戸市" + ":" + "6097");
		mMap.put(8, "栃木県" + ":" + "宇都宮市" + ":" + "6408");
		mMap.put(9, "群馬県" + ":" + "前橋市" + ":" + "6362");
		mMap.put(10, "埼玉県" + ":" + "さいたま市" + ":" + "3798");
	}
	public String getValue(Integer key) {

		return mMap.get(key);
	}
}	
//	public void ascending() {
//		 List<Entry<Integer, String>> list_entries = new ArrayList<Entry<Integer, String>>(mMap.entrySet());
//	     //一行ずつ持ってくる   
//	        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
//	        Collections.sort(list_entries, new Comparator<Entry<Integer, String>>() {
//	            public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2) {
//	                // 4. 昇順
//	                return obj1.getKey().compareTo(obj2.getKey());
//	            }
//	        });
//	        
//	        System.out.println("昇順でのソート");
//	        // 5. ループで要素順に値を取得する
//	        for(Entry<Integer, String> entry : list_entries) {
//	            System.out.println(entry.getKey() + " : " + entry.getValue());
//	        }
//	}
//	public void descending() {
//		List<Entry<Integer, String>> list_entries = new ArrayList<Entry<Integer, String>>(mMap.entrySet());
//
//		// 6. 比較関数Comparatorを使用してMap.Entryの値を比較する（降順）
//		Collections.sort(list_entries, new Comparator<Entry<Integer, String>>() {
//			//compareを使用して値を比較する
//			public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2) {
//				//降順
//				return obj2.getKey().compareTo(obj1.getKey());
//			}
//		});
//
//		System.out.println("降順でのソート");
//		// 7. ループで要素順に値を取得する
//		for (Entry<Integer, String> entry : list_entries) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//	}
//}