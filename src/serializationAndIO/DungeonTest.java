package serializationAndIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Head First Java Code Magnets pg467
public class DungeonTest {
	public static void main(String[] args) {
		try {
			DungeonGame d = new DungeonGame();
			System.out.println(d.getX() + d.getY() + d.getZ());
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();

			FileInputStream fis = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (DungeonGame) ois.readObject();
			System.out.println(d.getX() + d.getY() + d.getZ());
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
