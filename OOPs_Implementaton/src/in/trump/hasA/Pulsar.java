package in.trump.hasA;

public class Pulsar extends Engine {
	
	String modelName;
	
	public Pulsar() {
		super();
		//this("pulsar");
		System.out.println("Pulsar.Pulsar()");
	}
	
	public Pulsar(String modelName) {
		System.out.println("Pulsar.Pulsar() - parameterized constructor");
		this.modelName = modelName;
	}
	
	public static void main(String[] args) {
		//Engine e = new Engine();
		Pulsar p = new Pulsar();
		//System.out.println(e.chasisNo+" "+e.rpm+" "+e.cc);
	}

}
