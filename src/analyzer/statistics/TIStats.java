package analyzer.statistics;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.util.Pair;

public abstract class TIStats {
	protected HashMap<String,Integer> number = new HashMap<String,Integer>();
	protected HashMap<String, Double> percent = new HashMap<String, Double>();
	
	public abstract void numberWordPerClass(ArrayList<Pair<String,String>> result);
	public abstract void percentWordPerClass();
	
	protected void updateMap(String key) {
		number.put("total", number.get("total") + 1);
		
		if(number.containsKey(key)) {
			number.put(key, number.get(key) + 1);
		} else {
			number.put("foreign", 1);
		}
	}
	
	public HashMap<String, Integer> getNumber() {
		return number;
	}
	
	public HashMap<String, Double> getPercent() {
		return percent;
	}
}
