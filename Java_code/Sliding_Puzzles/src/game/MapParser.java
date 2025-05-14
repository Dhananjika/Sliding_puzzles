package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author - DISSANAYAKA MUDIYANSELAGE DHANANJIKA NIWARTHANI
 */

public class MapParser {

	public static Map parseMapFromFile(String filePath) {

		Map mapObj = new Map();

		try {
			// read file
			FileReader inputFile = new FileReader(filePath);
			BufferedReader read = new BufferedReader(inputFile);

			int startPointHorizontal = 0; // start point X coordinate
			int startPointVertical = 0; // start point Y coordinate
			int endPointHorizontal = 0; // end point X coordinate
			int endPointVertical = 0; // end point Y coordinate

			int columnLength = 0; // line count
			int rowLength = 0; // character length in a line

			String rowString;
			List<String> rowStringArray = new ArrayList<>();

			// count row & column length
			while ((rowString = read.readLine()) != null) {
				rowLength = rowString.length();
				columnLength++;
				rowStringArray.add(rowString);
			}

			int[][] map2D = new int[columnLength][rowLength]; // stores full maze
			String[] inputMap = new String[columnLength]; // stores maze rows

			// map each character to a 2D integer array
			for (int i = 0; i < rowStringArray.size(); i++) {

				String lineString = rowStringArray.get(i);

				// find start and end point coordinates
				if (lineString.contains("S")) {
					startPointVertical = i;
					startPointHorizontal = lineString.indexOf("S");
				}

				if (lineString.contains("F")) {
					endPointVertical = i;
					endPointHorizontal = lineString.indexOf("F");
				}

				// replace characters
				inputMap[i] = lineString.replace("0", "1").replace(".", "0").replace("S", "0").replace("F", "0");

				// convert string line to integer array
				int[] maze1D = Arrays.stream(inputMap[i].split("")).mapToInt(Integer::parseInt).toArray();

				// add scanned row
				map2D[i] = maze1D;
			}

			mapObj.setStartPointHorizontal(startPointHorizontal);
			mapObj.setStartPointVertical(startPointVertical);
			mapObj.setEndPointHorizontal(endPointHorizontal);
			mapObj.setEndPointVertical(endPointVertical);
			mapObj.setMap2D(map2D);

			System.out.println("Start Point: (" + (startPointHorizontal + 1) + "," + (startPointVertical + 1)
					+ ") | End Point: (" + (endPointHorizontal + 1) + "," + (endPointVertical + 1) + ")");
			System.out.println();

		} catch (IOException e) {
			System.out.println("IO EXCEPTION ERROR | Parsing Map Failed!");
		}

		return mapObj;
	}

}
