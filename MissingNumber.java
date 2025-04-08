class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Array is missing '4'
        int n = arr.length + 1; // Total numbers (including the missing one)
        int expectedSum = n * (n + 1) / 2; // Sum of first 'n' natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
