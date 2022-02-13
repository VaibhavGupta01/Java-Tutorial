package serializationAndIO;

import java.io.Serializable;

//Head First Java Code Magnets pg467
public class DungeonGame implements Serializable {
	public int x = 3;
	transient long y = 4;
	private short z = 5;

	int getX() {
		return x;
	}

	long getY() {
		return y;
	}

	short getZ() {
		return z;
	}
}
