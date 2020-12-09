

public class hashClss {

	public static void main(String[] args) {
		Person p1 = new Person("email@email.com", "gluestick");
		Position pos1 = new Position(10, 10);
		p1.position = pos1;
		
		Person p2 = new Person("email@email.com", "gluestick");
		Position pos2 = new Position(10, 10);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		}
		
		
	}


