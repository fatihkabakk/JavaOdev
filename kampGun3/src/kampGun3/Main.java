package kampGun3;

public class Main {

	public static void main(String[] args) {
		Student fatih = new Student();
		fatih.firstName = "Fatih";
		fatih.lastName = "Kabak";
		fatih.id = 1;
		fatih.studentNumber = "333";
		
		Instructor engin = new Instructor();
		engin.firstName = "Engin";
		engin.lastName = "Demiroğ";
		engin.id = 2;
		engin.instructorNumber = "555";
		
		UserManager userManager = new UserManager();
		userManager.addComment("Mükemmel bir dersti.");
		userManager.addUser(fatih);
		userManager.deleteUser(fatih);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Java Kampı");
		instructorManager.addCourse("C# Kampı");
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse("Java Kampı");
		studentManager.registerCourse("C# Kampı");
	}

}
