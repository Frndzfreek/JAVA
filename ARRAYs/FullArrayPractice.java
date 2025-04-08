//Reverse Array-method 1

// import java.util.Arrays;
// class Main{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         for(int i=0;i<arr.length/2;i++){
//             int temp=arr[i];
//             arr[i]=arr[arr.length-1-i];
//             arr[arr.length-1-i]=temp;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

//Reverse Array-method 2

// class Main{
//     public static void reverseArray(int[] arr){
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }System.out.println();
//     }
//     public static void main (String[] args){
//         int[] ar={1,2,3};
//         reverseArray(ar);
//     }
// }

//Reverse Array-method 3

// import java.util.Arrays;
// class Main{
//     public static int[] reverseArray(int[] arr){
//         int[] rev=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             rev[i]=arr[arr.length-1-i];
//         }
//         return rev;
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3};
//         System.out.println(Arrays.toString(reverseArray(arr)));
//     }
// }

//Palindrome

// class Main{
//     public static boolean palindrome(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=arr[arr.length-1-i]){
//                 return false;
//             }
//         }return true;
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3};
//         if(palindrome(arr)){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
//     }
// }

//Second Largest element

// class Main{
//     public static int seclargest(int[] arr){
//         int first=Integer.MIN_VALUE;
//         int second=Integer.MIN_VALUE;
        
//         for(int num:arr){
//             if(num>first){
//                 second=first;
//                 first=num;
//             }
//         }
//         return second;
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3};
//         System.out.println(seclargest(arr));
//     }
// }

//Second largest with error handling

// class Main {
//     public static int seclargest(int[] arr) {
//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int num : arr) {
//             if (num > first) {
//                 second = first;
//                 first = num;
//             } else if (num > second && num < first) {
//                 second = num;
//             }
//         }
//         // Handle the case where no second-largest element exists
//         if (second == Integer.MIN_VALUE) {
//             throw new IllegalArgumentException("No second-largest element exists.");
//         }
//         return second;
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 3, 3};
//         try {
//             System.out.println(seclargest(arr));
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

//Bubble Sorting

// import java.util.Arrays;
// class Main{
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] arr){
//         int[] ar={1,3,4,2};
//         bubbleSort(ar);
//     }
// }

//move by one rotation

// import java.util.*;
// class Main{
//     public static void leftRotateByOne(int[] arr) {
//         int first = arr[0];
//         for (int i = 0; i < arr.length - 1; i++) {
//             arr[i] = arr[i + 1];
//         }
//         arr[arr.length - 1] = first;
//         System.out.println(Arrays.toString(arr));
//     }
    
//     public static void main(String[] args){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int[] ar=new int[n];
//         for(int j=0;j<n;j++){
//             ar[j]=scan.nextInt();
//         }
//         leftRotateByOne(ar);
//     }
// }

//Find pairs with sum = K

// class Main{
//     public static void findPairsWithSum(int[] arr, int k) {
//         for (int i = 0; i < arr.length; i++) {
            
//             for (int j = i + 1; j < arr.length; j++) {
                
//                 if (arr[i] + arr[j] == k) {
//                     System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//                 }
//             }
//         }
//     }
//     public static void main(String[] args){
//         int[] ar={1,2,3,4,5,6};
//         int k=6;
//         findPairsWithSum(ar,k);
//     }
// }

//Most frequent element

// import java.util.*;
// class Main{
//     public static int mostFrequent(int[] arr) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int maxCount = 0, result = -1;
//         for (int num : arr) {
//             int count = map.getOrDefault(num, 0) + 1;
//             map.put(num, count);
//             if (count > maxCount) {
//                 maxCount = count;
//                 result = num;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args){
//         int[] ar={1,2,3,1,1,4,5,2,2,3,1,3,4,2,1,3};
//         System.out.println(mostFrequent(ar));
//     }
// }

//Check if array is sorted

// class Main{
//     public static boolean isSorted(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int[] ar={1,2,4,5,6,3};
//         System.out.println(isSorted(ar));
//     }
// }
