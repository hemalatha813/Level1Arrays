package Tasks;

import java.util.Arrays;

public class level1array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1, 2, 3, 4, 5};
		
		//Creating and Initializing an Array
     	int[] Array = new int[]{1, 2, 3 ,4 ,5};
		
        for (int i = 0; i <5; i++) {
            System.out.println(arr[i]);
  
        }
        
        //Accessing Elements of an Array
       System.out.println("The first element is: " + arr[1]);
       System.out.println("The fourth element is: " + arr[4]); 
        
        //Modifying Elements of an Array
        int[] arr3={1, 2, 3, 4, 5};
        arr3[1]=10;
        System.out.println(Arrays.toString(arr3));
        
        // Finding the Length of an Array
        System.out.println(arr.length);
        
        //Looping through an Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        //Multi-dimensional Arrays
        int[][] array = { {1, 2}, {3, 4}, {5, 6} };
        System.out.println("Element at row 1 column 1: " + array[0][0]);
        
        //Copying arrays
        
        int[] arr2 =new int[5];
        for(int i=0;i<arr2.length;i++) {
        	arr2[i]=arr[i];
        	System.out.println(arr2[i]);
        }
        
        //Sorting Arrays
        int[] a= {5, 3, 4, 1, 2};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i]);
        }
        
        

	}

}
