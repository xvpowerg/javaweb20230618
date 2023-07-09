package tw.com.beans;

public class DBInfo {
	private String acc;
	private String pwd;
	private static DBInfo defDbInfo = null;	
	public static DBInfo getDefaultDBInfo() {
		return defDbInfo;
	}
	public static void setDefaultDBInfo(DBInfo dbInfo) {
		defDbInfo = dbInfo;
	}
	
	public DBInfo(String acc, String pwd) {
		super();
		this.acc = acc;
		this.pwd = pwd;
	}
	
	
	
	public String getAcc() {
		return acc;
	}



	public String getPwd() {
		return pwd;
	}



	@Override
	public String toString() {
		return "DBInfo [acc=" + acc + ", pwd=" + pwd + "]";
	}
	
}
