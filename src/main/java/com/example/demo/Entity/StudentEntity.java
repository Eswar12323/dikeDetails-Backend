package com.example.demo.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info")
public class StudentEntity {
@Id
@Column(name="bid")
private int bid;
@Column(name="bname")
private String bname;
@Column(name="ownername")
private String ownername;
@Column(name="phnumber")
private long phnumber;
@Column(name="email")
private String email;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public long getPhnumber() {
	return phnumber;
}
public void setPhnumber(long phnumber) {
	this.phnumber = phnumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "StudentEntity [bid=" + bid + ", bname=" + bname + ", ownername=" + ownername + ", phnumber=" + phnumber
			+ ", email=" + email + "]";
}
public StudentEntity() {

}

}
