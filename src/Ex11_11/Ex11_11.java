package Ex11_11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
//		아래 Person 객체 중복제거가 안되고있음
//		소스 수정이 필요
//		위의 Person 
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);
	}
}
	class Person {
		String name;
		int age;

		public Person() {
		}

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

//		객체 중복을 제거하려면
//		equals 와 hashCode 오버라이딩 필요
		@Override
		public boolean equals(Object obj) {
//		Person 아니면 메소드 탈출
			if (!(obj instanceof Person))
				return false;
			Person p = (Person) obj;

			return name.equals(p.name) && age == p.age;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}

		@Override
		public String toString() {
			return name + ":" + age;
		}

	}
