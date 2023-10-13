package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int applicationId;
private String applicationName;
private  int applicationCost;
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public String getApplicationName() {
	return applicationName;
}
public void setApplicationName(String applicationName) {
	this.applicationName = applicationName;
}
public int getApplicationCost() {
	return applicationCost;
}
public void setApplicationCost(int applicationCost) {
	this.applicationCost = applicationCost;
}
@Override
public String toString() {
	return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName + ", applicationCost="
			+ applicationCost + "]";
}

}
