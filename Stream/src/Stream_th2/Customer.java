package Stream_th2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Customer implements Externalizable {
	int id ;
	String name;
	int age;
	double height;

	public Customer(){} //매개변수가 없는 기본 생성자 
	
	Customer(int id, String name, int age, double height){
		this.id=id;
		this.name=name;
		this.age =age;
		this.height =height;
		
	}//생성자 오버로딩
	
	@Override
	public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException {
		Integer a = new Integer(2);
		Integer a1 = 2;
		int n = new Integer(2);
		id=(Integer)ois.readObject();//다운캐스팅+오토언박싱
		name=(String)ois.readObject();
		age=(Integer)ois.readObject();
		height=(Double)ois.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput oos) throws IOException {
		oos.writeObject(new Integer(id));//오토박싱과 업캐스팅하면서 객체 단위로 저장
		oos.writeObject(name);
		oos.writeObject(new Integer(age));
		oos.writeObject(new Double(height));
	}//객체 단위로 저장(기록.출력 )하기 위한 메서드구현

	@Override
	public String toString() {
		return "id : " +id + ",name : " + name + ",age : " +age +"height : " + height; 
	}
}




