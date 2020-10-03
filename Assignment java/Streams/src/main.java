import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class main {

	public static void main(String[] args) {

		double marks1[] = { 80, 90, 100 };
		double marks[] = { 100, 97, 95 };
		Student student = new Student(1, "vishnu", "priya", 1, "female", marks);
		Student student1 = new Student(2, "Bhanu", "Rithvika", 2, "female", marks1);

		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student1);

		List<Double> doubles = new ArrayList<Double>();
		for (int i = 0; i < marks1.length; i++) {
			doubles.add(marks1[i]);
		}
		DoubleStream1 doubleStream = new DoubleStream1();
		System.out.println("Double Stream Example");
		doubleStream.doubleStream(students);

		Filter filter1 = new Filter();
		System.out.println("Filter example");
		filter1.filterStream(students);
		MaxMarks maxMarks = new MaxMarks();
		System.out.println("Max Example");
		maxMarks.maxMarks(students);
		Reduce reduce = new Reduce();
		reduce.reduce(students);
		System.out.println("Sorting Example");
		Sorted sorted = new Sorted();
		sorted.sorted(students);
		

	}

}