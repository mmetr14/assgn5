import java.util.HashMap;
import java.util.Set;

public class cart {
	private HashMap<String, Integer> cartData;

	public cart() {
		cartData = new HashMap<>();
	}

	public void addItem(String item, String quantity) {
		int num;
		try {
			num = Integer.parseInt(quantity);
		} catch (NumberFormatException e) {
			num = 1;
		}
		if (num == 0) {
			cartData.remove(item);
			return;
		}
		if (!cartData.containsKey(item)) {
			cartData.put(item, num);
		} else {
			int newValue = cartData.get(item) + num;
			cartData.put(item, newValue);
		}

	}

	public int getQuantity(String item) {
		return cartData.get(item);
	}

	public Set<String> listItems() {
		return cartData.keySet();
	}

}
