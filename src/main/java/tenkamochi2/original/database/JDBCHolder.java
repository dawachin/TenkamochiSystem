package tenkamochi2.original.database;

import java.net.URI;
import java.net.URISyntaxException;

public class JDBCHolder {

    private static JDBCHolder instance;

	public static JDBCHolder getInstance()
			throws URISyntaxException {
		if (instance == null) {
			instance = new JDBCHolder();
		}
		System.out.println("db-connecting");
		return instance;
	}

	//環境変数が設定されていない時はnullをセットする
	private URI DB_URI;
	private static final String DB_URI_ENV_NAME = "DATABASE_URL";

	private JDBCHolder() throws URISyntaxException {
		if (System.getenv(DB_URI_ENV_NAME) != null) {
			DB_URI = new URI(System.getenv(DB_URI_ENV_NAME));
		} else {
			DB_URI = null;
		}
	}

	public String getUrl() {
		return "jdbc:postgresql://" + getHost() + "/" + getPath();
	}

	public String getUsername() {
		if (DB_URI == null) {
			return "postgres";
		}
		return DB_URI.getUserInfo().split(":")[0];
	}

	public String getPassword() {
		if (DB_URI == null) {
			return "postgres";
		}
		return DB_URI.getUserInfo().split(":")[1];
	}
	
	private String getHost() {
		if (DB_URI == null) {
			return "localhost";
		}
		return DB_URI.getHost();
	}
	
	private String getPath() {
		if (DB_URI == null) {
			return "mail";
		}
		return DB_URI.getPath();
	}
}
