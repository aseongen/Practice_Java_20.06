package Generic;
class Product<T,M>{
	private T kind;
	private M model;
	
	//각각 이클립스 메뉴로 setter(),getter()를 만들어 본다.
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
}//class Product
class Tv{}
class ChildProduct <T,M,C> extends Product <T,M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}//Class ChildProduct

interface Storage<T>{
	void add (T item, int index);
	T get(int index); //추상 메서드 
}//제네릭 인터페이스
class StorageImpl<T> implements Storage<T>{
	
	private T [] array;
	
	StorageImpl(int size){
		this.array = (T[]) (new Object[size]);
	}

	@Override
	public void add(T item, int index) {
		array [index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}//StorageImp1
public class Generic07 {
	public static void main(String[] args) {

		ChildProduct<Tv,String,String> product=new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart Tv"); product.setCompany("Samsung");
		
		Storage<Tv> storage=new StorageImpl<>(100);
		storage.add(new Tv(),0);//첫번째 원소값 저장
		Tv tv=storage.get(0);//첫번째 원소값 반환
	}
}
