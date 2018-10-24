package cs107KNN;

public class KNN {
	public static void main(String[] args) {
		byte b1 = 40; // 00101000
		byte b2 = 20; // 00010100
		byte b3 = 10; // 00001010
		byte b4 = 5; // 00000101

		// [00101000 | 00010100 | 00001010 | 00000101] = 672401925
		int result = extractInt(b1, b2, b3, b4);
		System.out.println(result);

		String bits = "10000001";
		System.out.println("La séquence de bits " + bits + "\n\tinterprétée comme byte non signé donne "
				+ Helpers.interpretUnsigned(bits) + "\n\tinterpretée comme byte signé donne "
				+ Helpers.interpretSigned(bits));
	}

	/**
	 * Composes four bytes into an integer using big endian convention.
	 *
	 * @param bXToBY The byte containing the bits to store between positions X and Y
	 * 
	 * @return the integer having form [ b31ToB24 | b23ToB16 | b15ToB8 | b7ToB0 ]
	 */
	public static int extractInt(byte b31ToB24, byte b23ToB16, byte b15ToB8, byte b7ToB0) {
		// TODO: Implémenter
		return 0;
	}

	/**
	 * Parses an IDX file containing images
	 *
	 * @param data the binary content of the file
	 *
	 * @return A tensor of images
	 */
	public static byte[][][] parseIDXimages(byte[] data) {
		// TODO: Implémenter
		return null;
	}

	/**
	 * Parses an idx images containing labels
	 *
	 * @param data the binary content of the file
	 *
	 * @return the parsed labels
	 */
	public static byte[] parseIDXlabels(byte[] data) {
		// TODO: Implémenter
		return null;
	}

	/**
	 * @brief Computes the squared L2 distance of two images
	 * 
	 * @param a, b two images of same dimensions
	 * 
	 * @return the squared euclidean distance between the two images
	 */
	public static float squaredEuclideanDistance(byte[][] a, byte[][] b) {
		// TODO: Implémenter
		return 0f;
	}

	/**
	 * @brief Computes the inverted similarity between 2 images.
	 * 
	 * @param a, b two images of same dimensions
	 * 
	 * @return the inverted similarity between the two images
	 */
	public static float invertedSimilarity(byte[][] a, byte[][] b) {
		// TODO: Implémenter
		return 0f;
	}

	/**
	 * @brief Quicksorts and returns the new indices of each value.
	 * 
	 * @param values the values whose indices have to be sorted in non decreasing
	 *               order
	 * 
	 * @return the array of sorted indices
	 * 
	 *         Example: values = quicksortIndices([3, 7, 0, 9]) gives [2, 0, 1, 3]
	 */
	public static int[] quicksortIndices(float[] values) {
		// TODO: Implémenter
		return null;
	}

	/**
	 * @brief Sorts the provided values between two indices while applying the same
	 *        transformations to the array of indices
	 * 
	 * @param values  the values to sort
	 * @param indices the indices to sort according to the corresponding values
	 * @param         low, high are the **inclusive** bounds of the portion of array
	 *                to sort
	 */
	public static void quicksortIndices(float[] values, int[] indices, int low, int high) {
		// TODO: Implémenter
	}

	/**
	 * @brief Swaps the elements of the given arrays at the provided positions
	 * 
	 * @param         i, j the indices of the elements to swap
	 * @param values  the array floats whose values are to be swapped
	 * @param indices the array of ints whose values are to be swapped
	 */
	public static void swap(int i, int j, float[] values, int[] indices) {
		// TODO: Implémenter
	}

	/**
	 * @brief Returns the index of the largest element in the array
	 * 
	 * @param array an array of integers
	 * 
	 * @return the index of the largest integer
	 */
	public static int indexOfMax(int[] array) {
		// TODO: Implémenter
		return 0;
	}

	/**
	 * The k first elements of the provided array vote for a label
	 *
	 * @param sortedIndices the indices sorted by non-decreasing distance
	 * @param labels        the labels corresponding to the indices
	 * @param k             the number of labels asked to vote
	 *
	 * @return the winner of the election
	 */
	public static byte electLabel(int[] sortedIndices, byte[] labels, int k) {
		// TODO: Implémenter
		return 0;
	}

	/**
	 * Classifies the symbol drawn on the provided image
	 *
	 * @param image       the image to classify
	 * @param trainImages the tensor of training images
	 * @param trainLabels the list of labels corresponding to the training images
	 * @param k           the number of voters in the election process
	 *
	 * @return the label of the image
	 */
	public static byte knnClassify(byte[][] image, byte[][][] trainImages, byte[] trainLabels, int k) {
		// TODO: Implémenter
		return 0;
	}

	/**
	 * Computes accuracy between two arrays of predictions
	 * 
	 * @param predictedLabels the array of labels predicted by the algorithm
	 * @param trueLabels      the array of true labels
	 * 
	 * @return the accuracy of the predictions. Its value is in [0, 1]
	 */
	public static double accuracy(byte[] predictedLabels, byte[] trueLabels) {
		// TODO: Implémenter
		return 0d;
	}
}
