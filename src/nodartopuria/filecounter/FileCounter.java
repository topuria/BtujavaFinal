package nodartopuria.filecounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

public class FileCounter {
	public static void main(String[] args) throws FileNotFoundException {
		File folder = new File("~/nika/BTU_DOCUMENTS");
		FilenameFilter filenameFilter = (dir, name) -> {
			String lowercaseName = name.toLowerCase();
			return lowercaseName.startsWith("btu");
		};
		String[] files = folder.list(filenameFilter);
		int counter = 0;
		assert files != null;
		for (String file : files) {
			++counter;
		}
		System.out.println("List of the btu files in the specified directory:");
		for(String fileName : files) {
			System.out.println(fileName);
		}
		System.out.println("Files with name btu in Dir: "+counter);
	}
}
