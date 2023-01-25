

public class ArrayExamples {

	// Changes the input array to be in reversed order
	static void reverseInPlace(int[] arr) { 
		if (arr == null || arr.length <= 1) {
			return;
		}
		for(int i = 0; i < arr.length / 2; i++) {
			int store = arr[i]; // arr[0]
			arr[i] = arr[arr.length - i - 1]; // arr[0] = arr[2]
			arr[arr.length - i - 1] = store; // arr[2] = temp (arr[0] before modification)
		}
	}

	// Returns a *new* array with all the elements of the input array in reversed
	// order
	static int[] reversed(int[] arr) {
		int[] newArray = new int[arr.length];
		for(int i = 0; i < newArray.length; i++) { //arr[0] = newArray[2], arr[1] = newArray[1], arr[2] = newArray[0]
			newArray[arr.length - i - 1] = arr[i];
		}
		return newArray;
	}
	// Averages the numbers in the array (takes the mean), but leaves out the
	// lowest number when calculating. Returns 0 if there are no elements or just
	// 1 element in the array
	static double averageWithoutLowest(double[] arr) {
		if(arr.length < 2) { return 0.0; }
		double lowest = arr[0];
		for(double num: arr) {
			if(num < lowest) { lowest = num; }
		}
		double sum = 0;
		for(double num: arr) {
			if(num != lowest) { sum += num; }
		}
		return sum / (arr.length - 1);
	}


}

