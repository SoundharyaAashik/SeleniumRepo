package week3.day2;

public class ChildClass extends ParentClass{
	
	public void ChildBehaviour() {
		System.out.println("Child Character");
	}

	public static void main(String[] args) {

		/*
		 * ParentClass parent = new ParentClass(); parent.ParentBehaviour();
		 */
		
		ChildClass child = new ChildClass();
		child.ChildBehaviour();
		child.ParentBehaviour();

	}

}
