package Assignment3;

class Course{
	public void courseInfo() {
		System.out.println("Course Information");
	}
}
class Science extends Course{
	public void scienceInfo() {
		System.out.println("Science Course Information");
	}
}
class Commerce extends Course{
	public void commerceInfo() {
		System.out.println("Commerce Course Information");
	}
}
class Arts  extends Course{
	public void artsInfo() {
		System.out.println("Arts Course Information");
	}
}
public class Q14_HierarchicalInheritance {

	public static void main(String[] args) {
		
		Course obj1 = new Course();
		obj1.courseInfo();
		Science obj2 = new Science();
		obj2.scienceInfo();
		Commerce obj3 = new Commerce();
		obj3.commerceInfo();
		Arts obj4 = new Arts();
		obj4.artsInfo();
		
	}

}
