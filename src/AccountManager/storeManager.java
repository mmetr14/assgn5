package AccountManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class storeManager {
	Connection con;
	private HashMap<String, Item> items;

	public storeManager(Connection con) {
		this.con = con;
		items = new HashMap<>();
		String command = "Select * from products";
		try {
			PreparedStatement statement = con.prepareStatement(command);
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				Item curItem = new Item();
				curItem.id = res.getString(1);
				curItem.name = res.getString(2);
				curItem.image = res.getString(3);
				curItem.price = res.getDouble(4);
				items.put(curItem.id, curItem);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Item> getItems() {
		ArrayList<Item> res = new ArrayList<>();
		res.addAll(items.values());
		return res;
	}

	public Item getItem(String ID) {
		return items.get(ID);
	}

	public ArrayList<Item> getItemsByIDs(Set<String> ids) {
		ArrayList<Item> result = new ArrayList<>();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			String curID = it.next();
			if (items.containsKey(curID)) {
				result.add(items.get(curID));
			}
		}
		return result;
	}
}
