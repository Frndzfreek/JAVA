import java.io.*;
public class ByteStream{
//Byte streams are used for reading and writing binary data such as images, audio, and video.
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input.txt");
			        FileOutputStream fos = new FileOutputStream("output.txt")) {
      int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Output: A copy of input.txt will be created as output.txt.
