package homework2;

public class Instructor extends User {
			private String teachedCourses;

			public Instructor(int id, String userName, String password, String firstName, String lastName,
					String teachedCourses) {
				super(id, userName, password, firstName, lastName);
				this.teachedCourses = teachedCourses;
			}

			public String getTeachedCourses() {
				return teachedCourses;
			}

			public void setTeachedCourses(String teachedCourses) {
				this.teachedCourses = teachedCourses;
			}

			
}
