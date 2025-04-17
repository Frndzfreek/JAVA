import java.io.*;
//Data streams allow reading and writing primitive data types.

public class DataStreamEX {
	public static void main(String[] args) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))) {
			dos.writeInt(100);
			dos.writeDouble(99.99);
			dos.writeBoolean(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//Output: A binary file data.dat will be created containing 100, 99.99, and true.
