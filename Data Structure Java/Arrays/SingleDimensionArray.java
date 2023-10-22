import java.util.Arrays;

public class SingleDimensionArray {

    // let suppose we want to declare such where where its initial value must be othet than 0 means some sifault mininm value so we initially put its vlue null and the assig n
    // some defailt value minmum number...condition for declaring array is first declare the array and instantiate itt and the assign the size of the array
    int[] arr = null;

    public SingleDimensionArray(int arrSize) {
        arr = new int[arrSize];///instantiate---referentiating it
        Arrays.fill(arr, Integer.MIN_VALUE);

    }
   // to insert an element in array write some command
    public void insert(int location,int valueToBeInserted){

      try{
          // firstly we wil chek whether array is ocuupied or not
          if(arr[location]==Integer.MIN_VALUE){
              arr[location]=valueToBeInserted;
              System.out.println("Successfully Inserted");
          }else {
              System.out.println("The array is already occupied");
          }
      }catch(ArrayIndexOutOfBoundsException ignored){
          System.out.println("invalid index to access araay");
        }
    }


//    int[] sArray;
//    sArray=int new sA
//


}
