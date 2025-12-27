package studntmanagementsystem;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
		@Id
		@Column(name="StudentID",length=10)
		private String StudentID;
		@Column(name="FirstName",length=15)
		private String FirstName;
		@Column(name="LastName",length=35)
		private String LastName;
		@Column(name="DateOfBirth")
		private LocalDate dateOfBirth;
		@Column(name="Gender",length = 10)
		private String gender;
		@Column(name="Email",length =25)
		private String email;
		@Column(name="Phone_Number",length = 10)
		private String phone;
		
		public String getStudentID() {
			return StudentID;
		}
		public void setStudentID(String studentID) {
			StudentID = studentID;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public Student(String studentID, String firstName, String lastName, LocalDate dateOfBirth, String gender,
				String email, String phone) {
			super();
			StudentID = studentID;
			FirstName = firstName;
			LastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.email = email;
			this.phone = phone;
		}
		
		public Student() {
			super();
		}
		
		
		@Override
		public String toString() {
			return "Student [StudentID=" + StudentID + ", FirstName=" + FirstName + ", LastName=" + LastName
					+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email + ", phone=" + phone
					+ "]";
		}
		public static void main(String[] args) {
		

	}

}
