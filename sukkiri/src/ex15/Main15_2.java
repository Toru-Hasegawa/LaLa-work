package ex15;

public class Main15_2 {

	public static void main(String[] args) {
		String folder = "C:\\javadev\\";
		String file = "readme.txt";
		String path = concatPath(folder, file);
		System.out.println(path);
	}
	public static String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}
