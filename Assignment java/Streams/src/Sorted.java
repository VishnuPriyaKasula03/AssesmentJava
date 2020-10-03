import java.util.List;
import java.util.stream.Stream;

public class Sorted {
	public void sorted(List<Student> students) {
		Stream<Student> steam1 = students.stream()
				.sorted((s1, s2) -> s1.getStudentFirstName().compareTo(s2.getStudentFirstName()));
		steam1.forEach((student4) -> System.out.println(student4));
	}
}