package DiamonShop.Entity;

public class Users {
	private long id;
	private String user;
	private String passsword;
	private String display_name;
	private String address;
	
	public Users() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPasssword() {
		return passsword;
	}
	
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
} 
