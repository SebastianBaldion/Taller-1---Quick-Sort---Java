
package taller1.quick.sort;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller1QuickSort {

    private int Array[];
    private int length;
    
    public static void main(String[] args) {
       Taller1QuickSort sorter = new Taller1QuickSort();
       int[] input = {145, 65, 74, 36, 2, 45, 5, 320, 210, 175};
       sorter.sort(input);
       
       for (int i : input) {
           System.out.print(i);
           System.out.println(" ");
       }
    }
    
    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        
        this.Array = inputArr;
        length = inputArr.length;
        QuickSort(0, length - 1);
    }
    
    private void QuickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = Array[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {
            while (Array[i] < pivot) {
                i++;
            }
            while (Array[j] > pivot) {
                j--;
            }
            
            if(i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        
        if (lowerIndex < j) {
            QuickSort(lowerIndex, j);
        }
        
        if (i < higherIndex) {
            QuickSort(i, higherIndex);
        }
    }
    
    private void exchangeNumbers(int i, int j) {
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }
}
    

