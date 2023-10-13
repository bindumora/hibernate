package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pancardId;
private String pancardNumber;
private String pancardauthority;
@OneToOne(mappedBy = "pancard")
 private Person peron;
public int getPancardId() {
	return pancardId;
}
public void setPancardId(int pancardId) {
	this.pancardId = pancardId;
}
public String getPancardNumber() {
	return pancardNumber;
}
public void setPancardNumber(String pancardNumber) {
	this.pancardNumber = pancardNumber;
}
public String getPancardauthority() {
	return pancardauthority;
}
public void setPancardauthority(String pancardauthority) {
	this.pancardauthority = pancardauthority;
}
public Person getPeron() {
	return peron;
}
public void setPeron(Person peron) {
	this.peron = peron;
}
@Override
public String toString() {
	return "PanCard [pancardId=" + pancardId + ", pancardNumber=" + pancardNumber + ", pancardauthority="
			+ pancardauthority + "]";
}

}
