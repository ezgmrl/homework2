package homework2;

public class StudentManager extends UserManager {
			public void reg(Student student) {
				System.out.println(student.getFirstName() + student.getLastName() + " kursa kaydiniz basarili. ");
			}
			public void del(Student student) {
				System.out.println(student.getFirstName() + student.getLastName() + " kursa kaydiniz silindi. ");
			}
}
