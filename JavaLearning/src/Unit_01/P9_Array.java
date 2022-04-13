package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j < arr.length && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		
		System.out.println("duplicate elements:");
		boolean duplicate = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] == arr[j + 1])
					System.out.println(arr[j] + " ");
				break;

			}

		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		
		for (int i = 1; i < arr.length - 1; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j < arr.length && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("secondsmallest: " + arr[1]);
		System.out.println("secondlargest: " + arr[arr.length - 2]);


	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		
		System.out.println(Arrays.toString(arr));
		int j = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = j;
		System.out.println(Arrays.toString(arr));

	}

	void removeElementInArray(int[] arr) {
		// write code here!
		
		System.out.println("enter the element want delete:");
		Scanner in = new Scanner(System.in);
		int ele = in.nextInt();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele) {
				for (int j = i; j < arr.length - 1; j++)
					arr[j] = arr[j + 1];

			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
