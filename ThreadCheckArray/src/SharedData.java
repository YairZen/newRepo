import java.util.ArrayList;

/**
 * SharedData is a data container used for multi-threaded operations.
 * It stores a list of integers, a target value {@code b}, a win array indicating
 * matches, and a flag to indicate success.
 */
public class SharedData {
	
	/** The list of integers to search through. */
	private ArrayList<Integer> array;
	
	/** Boolean array representing which indexes matched the search. */
	private boolean[] winArray;
	
	/** Flag indicating whether a successful match was found. */
	private boolean flag;
	
	/** The target number to search for in the array. */
	private final int b;

	/**
	 * Constructs a SharedData object with the given array and target number.
	 *
	 * @param array the list of integers to search
	 * @param b the target number to search for
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * Gets the win array indicating which positions matched.
	 *
	 * @return the win array
	 */
	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * Sets the win array.
	 *
	 * @param winArray the boolean array indicating matching positions
	 */
	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	/**
	 * Gets the list of integers.
	 *
	 * @return the integer list
	 */
	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * Gets the target number to search for.
	 *
	 * @return the target number {@code b}
	 */
	public int getB() {
		return b;
	}

	/**
	 * Checks if the flag is set (successful match).
	 *
	 * @return true if a match was found; false otherwise
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * Sets the flag indicating whether a match was found.
	 *
	 * @param flag true if a match was found; false otherwise
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
