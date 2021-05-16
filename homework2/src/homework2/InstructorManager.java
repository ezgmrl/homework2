package homework2;

public class InstructorManager extends UserManager{
			public void completed(Instructor instructor) {
				System.out.println(instructor.getFirstName() + instructor.getLastName() + " kursu tamamladiniz. ");
			}
			public void goingOn(Instructor instructor) {
				System.out.println(instructor.getFirstName() + instructor.getLastName() + " kursunuz devam ediyor. ");
			}
}
