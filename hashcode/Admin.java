package hashcode;

public class Admin {
	String name;
	String id;
	
	public Admin(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
//	Admin admin = new Admin("A1", "22");
//	Admin admin2 = new Admin("A2", "23");
//	admin.equals(admin2);
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(getClass() != obj.getClass()) return false;
		
		Admin admin2 = (Admin)obj;
		if(name == null) {
			if(admin2.name != null) return false;
		}
		else if(!name.equals(admin2.name)) return false;
		if(id == null) {
			if(admin2.id != null) return false;
		}
		else if(!id.contentEquals(admin2.id)) return false;
		
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null)? 0 : name.hashCode()) + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
