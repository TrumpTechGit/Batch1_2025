package in.trump.optional;

import java.util.Optional;

public class OptionalExample {
	
	public static Optional<String> getName(boolean returnName) {
        if (returnName) {
            return Optional.of("Alice"); // returns non-empty Optional
        } else {
            return Optional.empty(); // returns empty Optional
        }
    }

	public static void main(String[] args) {
		Optional<String> nameOptional = getName(true);
		//System.out.println(nameOptional);
		
		//check if the value is present
		if(nameOptional.isPresent()) {
			System.out.println("Name is :"+nameOptional.get());
		} else {
			System.out.println("Name not found");
		}
	}

}
