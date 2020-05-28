public class App {
	public static void main(String[] args) {
		App obj = new App("MgMg", 31, 1);
		System.out.println(obj);

	}

	private String name;
	private int age;
	private int enrollNo;

	public App(String name, int age, int enrollNo) {
		super();
		this.name = name;
		this.age = age;
		this.enrollNo = enrollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getEnrollNo() {
		return enrollNo;
	}

	@Override
	public String toString() {
		return "App [name=" + name + ", age=" + age + ", enrollNo=" + enrollNo + "]";
	}

}
