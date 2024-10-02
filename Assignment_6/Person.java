package Assignment_6;

	public class Person {
		final String name;
		final int age;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

		public static void main(String[] args) {

			Person per = new Person("Riya",34);
			per.setName("Gayatri");//for final field value cannot be change
			per.setAge(23);//  for final field value cannot be change
			per.getName();
	        per.getAge();
			
		}
	
}
