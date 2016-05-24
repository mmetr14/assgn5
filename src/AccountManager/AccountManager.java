package AccountManager;

import java.util.HashMap;

public class AccountManager {
	private HashMap<String, String> users;
	public AccountManager() {
		users = new HashMap<>();
		users.put("Patrick", "1234");
		users.put("Molly", "FloPup");
	}

	public boolean accountExists(String key) {
		if (users.get(key) != null)
			return true;
		return false;
	}

	public void createAccount(String key, String value) {
		users.put(key, value);
	}

	public boolean checkAccount(String key, String value) {
		if (users.containsKey(key)) {
			String val = users.get(key);
			if (val.equals( value))
				return true;
		}
		return false;
	}

}
