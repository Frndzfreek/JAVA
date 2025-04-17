import java.io.*;
//Serialization converts an object into a byte stream for storage or transmission.

class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class SerializationEX {
	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			Person p = new Person("Alice", 30);
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
    }
	}
}

//Output: A file person.ser will be created containing the serialized object.
