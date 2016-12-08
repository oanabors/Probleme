package catalog;

import java.io.IOException;
import java.util.List;

import catalog.models.Student;
import catalog.utils.FileUtil;

public class Main {

	public static void main(String[] args) throws IOException {
		FileUtil fileUtil = new FileUtil();
		List<Student> students = fileUtil.readStudents("D:/eclipse/Workplace/Probleme/data/catalog/Students.csv");
		System.out.println(students);
	}

}
