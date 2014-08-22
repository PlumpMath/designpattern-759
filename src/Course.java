import java.util.Iterator;
import java.util.Vector;

public class Course {
	private String name;
	private Vector<Student> students;
	private Vector<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
		transcripts = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}
	
	public Vector<Student> getStudent() {
		Vector<Student> students = new Vector<Student>();
		Iterator<Transcript> itor = transcripts.iterator();
		
		while( itor.hasNext() ) {
			Transcript tr = itor.next();
			students.add(tr.getStudent());
		}
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void deleteStudent(Student student) {
		students.remove(student);
	}
}
