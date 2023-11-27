package Oops_Concept;
import java.io.Serializable;
public class ServeletBean  implements Serializable{
	private static final long serialVersionUID=1L;
	private String firstname;
	private String middlename;
	private String lastname;
	private String address;
	private String mobileno;
	private String education;
	private String email;
	private String Salary;
	
	
	public String getFirstName() {
		return firstname;
		}
	public void setFirstName(String firstName) {
		this.firstname=firstName;
		}
	
	public String getMiddleName() {
		return middlename;
	}
	public void setMiddleName(String middleName) {
		this.middlename=middleName;
		}
	
   public String getLastName() {
	return lastname;
   }
   public void setLastName(String lastName ) {
		this.lastname=lastName;
		}
   
   public String getAddress() {
		return address;
   }
   public void setAddress(String address) {
		this.address=address;
		}
   
   public  String getMobileNo() {
		return mobileno;
   }
   public void seMobileNo(String mobileno) {
		this.mobileno=mobileno;
		}
   
   public String getEducation() {
		return education;
  }
  public void setEducation(String education) {
		this.education=education;
		}
  
  public String getEmail() {
		return email;
}
public void setEmail(String email) {
		this.email=email;
		}
public String getSalary() {
	return Salary;
}
public  void setSalary(String salary) {
	this.Salary=salary;
	}

	public static void main(String[] args) {
		

	
	// String getAddresspublic() {
		// TODO Auto-generated method stub
		//return null;
	}
}


