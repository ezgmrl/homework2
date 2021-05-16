package homework2;

public class Student extends User {
			private String regCourse;

			public Student(int id, String userName, String password, String firstName, String lastName,
					String regCourse) {
				super(id, userName, password, firstName, lastName);
				this.regCourse = regCourse;
			}

			public String getRegCourse() {
				return regCourse;
			}

			public void setRegCourse(String regCourse) {
				this.regCourse = regCourse;
			}
			
			
			

}
