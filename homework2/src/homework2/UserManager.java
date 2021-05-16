package homework2;

public class UserManager {
			public void signIn(User user) {
				System.out.println(user.getFirstName() + user.getLastName() + " girisiniz basarili. ");
			}
			public void signOut(User user) {
				System.out.println(user.getFirstName() + user.getLastName() + " cikisiniz basarili. ");
			}
			
}
