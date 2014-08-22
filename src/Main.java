import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Professor p = new Professor();
		Student s = new Student();
		p.setStudent(s);
		p.advise();
		
		Student gildong = new Student("gildong");
		Student gilseo = new Student("gilseo");
		Student gilnam = new Student("gilnam");
		Course se = new Course("Software Engineering");
		Course design = new Course("Design Pattern");
		Course db = new Course("DataBase");
		Transcript ts1 = new Transcript(gildong, se);
		ts1.setDate("2013");
		ts1.setGrade("A+");
		Transcript ts2 = new Transcript(gilseo, se);
		ts2.setDate("2013");
		ts2.setGrade("C");
		Transcript ts3 = new Transcript(gilnam, db);
		ts3.setDate("2013");
		ts3.setGrade("B+");
		
		ts1 = new Transcript(gildong, design);
		ts1.setDate("2013");
		ts1.setGrade("A");
		
		ts2 = new Transcript(gilseo, design);
		ts2.setDate("2013");
		ts2.setGrade("B");
		
		ts1.setDate("2012");
		ts1.setGrade("D");
		
		Vector<Course> courses;
		Vector<Student> students;
		courses = gildong.getCourses();
		students = se.getStudent();
		for(int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i).getName());
			System.out.println(students.get(i).getName());
		}
	}
}
