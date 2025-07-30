package topic.generics;

public class GenericDemo<T> {
	
	T obj; // an obj of type T is declared
	
	public GenericDemo(T t) {
		this.obj = t;
	}
	
	public T getObj() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		GenericDemo<Integer> gd1 = new GenericDemo<>(100); 
		//GenericDemo<Integer> gd1 = new GenericDemo<>("Hello"); //Cannot infer type arguments for GenericDemo<>
		int x = gd1.getObj(); 
		System.out.println(x); //100
		
		GenericDemo<String> gd2 = new GenericDemo<>("Hello"); 
		String name = gd2.getObj();
		System.out.println(name);

	}

}
