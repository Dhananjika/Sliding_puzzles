package game;

/**
 * Author - DISSANAYAKA MUDIYANSELAGE DHANANJIKA NIWARTHANI
 */

public class Position {
	private int coordinateHorizontal;
	private int coordinateVertical;
	private String dir;

	public Position(int coordinateHorizontal, int coordinateVertical) {
		this.coordinateHorizontal = coordinateHorizontal;
		this.coordinateVertical = coordinateVertical;
	}

	public Position(int coordinateHorizontal, int coordinateVertical, String dir) {
		this.coordinateHorizontal = coordinateHorizontal;
		this.coordinateVertical = coordinateVertical;
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "(" + coordinateHorizontal + ", " + coordinateVertical + ", " + dir + ")";
	}

	public int getCoordinateHorizontal() {
		return coordinateHorizontal;
	}

	public int getCoordinateVertical() {
		return coordinateVertical;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}
}
