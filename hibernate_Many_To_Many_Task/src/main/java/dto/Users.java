package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String userName;
private String userAddress;
@ManyToMany
List<Application> application;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public List<Application> getApplication() {
	return application;
}
public void setApplication(List<Application> application) {
	this.application = application;
}
@Override
public String toString() {
	return "Users [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", application="
			+ application + "]";
}

}
