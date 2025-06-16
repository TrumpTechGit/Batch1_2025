package in.trump.training;

public class TrainingRoom {
	
	int id;
	String courses;
	String trainers;
	
	public TrainingRoom(int id, String courses, String trainers) {
		super();
		this.id = id;
		this.courses = courses;
		this.trainers = trainers;
	}
	
	void taining() {
		System.out.println("training starts");
	}
	

}
