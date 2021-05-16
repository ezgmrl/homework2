package homework2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor(2, "engindemirog", "1234", "Engin ", "Demirog", "Yazilim Gelistirici Kursu");
		Student student = new Student(3, "abcd", "12345 ", "Ahmet ", "Yildirim", "Temel Programlama");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.completed(instructor);
		instructorManager.goingOn(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.reg(student);
		studentManager.del(student);

		UserManager userManager = new UserManager();
		userManager.signIn(student);
		userManager.signOut(instructor);
	
	}
}
