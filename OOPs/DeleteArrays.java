package Module3;
import java.util.Scanner;
class DeleteArray {
    public int[] deleteElement(int[] array, int size, int element) {
        int i=0;
        int mat[]=new int[size-1];
        for(int k=0;k<size;k++){
            if(array[k]!=element){
                mat[i]=array[k];
                i++;
            }
        }
        return mat;
    }
}
public class DeleteArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int x = s.nextInt();
        
        DeleteArray deleteArray = new DeleteArray();
        int[] result = deleteArray.deleteElement(a, n, x);
        
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i < result.length - 1 ? " " : ""));
            }
        } else {
            System.out.println("Element not found.");
        }
        s.close();
    }
}
