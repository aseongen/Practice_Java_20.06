class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.name=name; this.age=age;
	}
	void show (){
		System.out.println(this.name + "\t" + this.age);
	}
}
public class TEST10 {
	public static void main(String[] args) {

		Animal ani = new Animal("호랑이", 13);
		ani.show();
		
	}
}
