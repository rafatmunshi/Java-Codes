package design.test;

class Teacher {
	   String designation = "Teacher";
	   String collegeName = "Beginnersbook";
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class InheritanceEx extends Teacher{
	   String mainSubject = "Physics";
	   public static void main(String args[]){
		   InheritanceEx obj = new InheritanceEx();
		   Teacher obj1 = new InheritanceEx();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}