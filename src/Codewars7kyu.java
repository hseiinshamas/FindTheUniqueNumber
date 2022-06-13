package PACKAGE_NAME;public class Codewars7kyu {

    /*
Description : There is an array with some numbers.
 All numbers are equal except for one. Try to find it!
 */
//                              Code wars 7kyu : Find the unique number

        public static double findUniq(double[] arr) {

            if (arr[0] == arr[1] && arr[0] != arr[2]) return arr[2];
            if (arr[0] == arr[2] && arr[0] != arr[1]) return arr[1];
            if (arr[1] == arr[2] && arr[0] != arr[1]) return arr[0];

            // If we reach here, then first three elements
            // must be same assuming that only one element
            // is different.Most efficient O(n)
            for (int i = 3; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) return arr[i];
            }
            return arr[arr.length - 1];


        }















}
