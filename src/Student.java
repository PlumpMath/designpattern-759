import java.util.Vector;
import java.util.Iterator;

public class Student {
	private Professor advisor;
	private String name;
	private Vector<Course> courses;
	private Vector<Transcript> transcripts;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
		transcripts = new Vector<Transcript>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCourse(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.deleteStudent(this);
		}
	}
	
	public Vector<Course> getCourses() {
		Vector<Course> courses = new Vector<Course>();
		Iterator<Transcript> itor = transcripts.iterator();
		
		while( itor.hasNext() ) {
			Transcript tr = itor.next();
			courses.add(tr.getCourse());
		}
		return courses;
	}
	
	public void advise(String msg) {
		System.out.println(msg);
	}
	
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
}