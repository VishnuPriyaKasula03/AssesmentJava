import java.util.List;
import java.util.stream.Stream;

public class Filter {

	public void filterStream(List<Student> students) {
		System.out.println("First name StaRts With N");
		Stream<Student> steam = students.stream().filter((student4) -> student4.getStudentFirstName().startsWith("N"));
		steam.forEach((student4) -> System.out.println(student4));
	}
}