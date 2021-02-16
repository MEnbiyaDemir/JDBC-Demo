package src;

public class School {

 String name;
 String no;
 String country;
 String ID;
 
 public School(String ID,String no,String name,String country) {
		// TODO Auto-generated constructor stub
	 this.ID=ID;
	 this.no=no;
	 this.name=name;
	 this.country=country;
	}

 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}

}
