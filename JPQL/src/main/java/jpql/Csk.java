package jpql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Csk {
	@Id
	private  int jerseyNo;
	private String player_Name;
	private String Role;
	private int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getPlayer_Name() {
		return player_Name;
	}
	public void setPlayer_Name(String player_Name) {
		this.player_Name = player_Name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Csk [jerseyNo=" + jerseyNo + ", player_Name=" + player_Name + ", Role=" + Role + ", age=" + age + "]";
	}

}
