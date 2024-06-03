package o2m;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appId;
	private String appName;
	private String version;
	private double rating;
	private String size;
	@OneToMany
	private List<Users> users;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + ", version=" + version + ", rating=" + rating
				+ ", size=" + size + ", users=" + users + "]";
	}
	
	
	
}
