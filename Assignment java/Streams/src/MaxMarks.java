import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MaxMarks {

	public void maxMarks(List<Student> students) {
		System.out.println("Maximum total Marks Of a Student");
		Stream<Student> steam2 = students.stream();
		Stream<Double> steam = steam2.map((student) -> {
			double[] array = student.getStudentMarks();

			DoubleStream stream = Arrays.stream(array);
			double add = stream.reduce(0, (a, b) -> a + b);
			return add;
		});
		Optional<Double> optional = steam.max(Double::compare);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

	}
}