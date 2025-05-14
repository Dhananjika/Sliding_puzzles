package game;

/**
 * Author - DISSANAYAKA MUDIYANSELAGE DHANANJIKA NIWARTHANI
 */

public class Map {
	private int startPointHorizontal;
	private int startPointVertical;
	private int endPointHorizontal;
	private int endPointVertical;
	private int[][] map2D;

	public int getStartPointHorizontal() {
		return startPointHorizontal;
	}

	public void setStartPointHorizontal(int startPointHorizontal) {
		this.startPointHorizontal = startPointHorizontal;
	}

	public int getStartPointVertical() {
		return startPointVertical;
	}

	public void setStartPointVertical(int startPointVertical) {
		this.startPointVertical = startPointVertical;
	}

	public int getEndPointHorizontal() {
		return endPointHorizontal;
	}

	public void setEndPointHorizontal(int endPointHorizontal) {
		this.endPointHorizontal = endPointHorizontal;
	}

	public int getEndPointVertical() {
		return endPointVertical;
	}

	public void setEndPointVertical(int endPointVertical) {
		this.endPointVertical = endPointVertical;
	}

	public int[][] getMap2D() {
		return map2D;
	}

	public void setMap2D(int[][] map2D) {
		this.map2D = map2D;
	}
}
