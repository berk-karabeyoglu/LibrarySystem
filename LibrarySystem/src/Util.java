
public class Util {

	public final static String EMPTY_STRING = "";
	public final static String bigSpace = "								";
	public final static String hyphens = "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";

	public static String editSpace(String str) {
		String editedSpace = EMPTY_STRING;
		if (str != null) {
			int strLength = str.length();
			if (strLength < 30) {
				int addedSpaceCharacter = 40 - strLength;

				for (int i = 0; i < addedSpaceCharacter; i++) {
					editedSpace = editedSpace + " ";
				}

			}
		}

		return editedSpace;

	}

}
