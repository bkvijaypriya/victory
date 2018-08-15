package Spring.BeanAutoWiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring.xml");
		
		//byName
		Student student = (Student)context.getBean("student");
		System.out.println(student.getJavaBook().getTitle());
		
		//byType
		Car car = (Car)context.getBean("car");
		System.out.println(car.getWheel().getName());
		
		//byConstructor
		College college = (College)context.getBean("college");
		System.out.println(college.getCollegeStudent().getStudentName());
	}
}