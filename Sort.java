import java.util.*;

public class Sort {

	public static void main(String[] args) {
		int[] x = {39, 40, 1, 2, 9, 86, -5};
		
		ArrayList<Integer> randomArrayList = new ArrayList<Integer>(10000);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		for (int i=0; i<10; i++){
			
		Integer r = rand.nextInt() % 256;
		randomArrayList.add(r);
		
		};
		
		
		System.out.println(bubbleSort(x));  // theta n^2
		
		System.out.println(insertionSort(x)); // theta: n^2
		
		System.out.println(MergeSort(randomArrayList)); //theta: n
		
		quickSort(x);  //theta: nlogn
		
		System.out.println(selectionSort(x)); //theta: n

	}
	
	
	
	public static String bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length-1; j++) {
			
			if(arr[j] > arr[j+1]) {
				
				int simp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = simp;
				
			}
				
				
			}
			
		}
		return(Arrays.toString(arr));
		
	}
	
	
	public static String insertionSort(int[] arr) {
		
		int next_val=0;
        int count=0;
        for(int i=1; i<arr.length; i++) {
        
            next_val=arr[i];
            int j;
            for(j=i-1; j>=0; j--)
            {
               
                if(arr[j]>next_val)
                {
                    arr[j+1] = arr[j];
                }
                else
                {
                    break;
                }
                count++;
            }
           arr[j+1] = next_val;
      
	}
		return(Arrays.toString(arr));
        
	}
	
	
	public static ArrayList<Integer>MergeSort(ArrayList<Integer> arr ){
		
		ArrayList<Integer> left = new ArrayList<Integer>();
	    ArrayList<Integer> right = new ArrayList<Integer>();
	    int center;
	    if (arr.size() == 1) {    
	        return arr;
	    } else {
	        center = arr.size()/2;
	        for (int i=0; i<center; i++) {
	                left.add(arr.get(i));
	        }
	 
	        for (int i=center; i<arr.size(); i++) {
	                right.add(arr.get(i));
	        }
	 
	        left  = MergeSort(left);
	        right = MergeSort(right);
	 
	        merge(left, right, arr);
	       

		return arr;
	
	}
	    
}
	    
	
	    private static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
	        int leftIndex = 0;
	        int rightIndex = 0;
	        int wholeIndex = 0;
	     
	       
	        while (leftIndex < left.size() && rightIndex < right.size()) {
	        	
	            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
	                whole.set(wholeIndex, left.get(leftIndex));
	                leftIndex++;
	                
	            } else {
	            	
	                whole.set(wholeIndex, right.get(rightIndex));
	                rightIndex++;
	                
	            }
	            wholeIndex++;
	        }
	     
	        ArrayList<Integer> rest;
	        int restIndex;
	        if (leftIndex >= left.size()) {
	        	
	            rest = right;
	            restIndex = rightIndex;
	            
	        } else {
	        	
	            rest = left;
	            restIndex = leftIndex;
	            
	        }
	     
	        for (int i=restIndex; i<rest.size(); i++) {
	            whole.set(wholeIndex, rest.get(i));
	            wholeIndex++;
	            
	        }
	    }     
		
		
	
	
	public static void quickSort(int[] arr) {
		
		int high = arr.length-1;
		int low =0;
		
			sort(arr,low, high );
			System.out.println(Arrays.toString(arr));

	}
	  
	  
	
	private static void sort(int[] arr, int l, int h) {
		
		if (l < h) { 
            
            int m = partition(arr, l, h); 
  
            sort(arr, l, m-1); 
            sort(arr, m+1, h); 
        } 
	}
	
	
	private static int partition(int[] arr, int low, int high) {
		
		 int c = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) { 
	        	
	            if (arr[j] < c) {
	            
	                i++; 
	  
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	                
	            } 
	            
	        } 
	  
	        int simp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = simp; 
	  
			return (i+1);
			
	}
	

	public static String selectionSort(int[] arr) {
		
	     for(int i=0; i<arr.length-1; i++){
	    	 
	    		int minIndex=i;

	            for(int j=i+1; j<arr.length; j++)
	            {
	                if(arr[j]<arr[minIndex])
	                {
	                    minIndex=j;
	                }
	            }
	             
	            int tempo = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = tempo;
	            
	           
	        }
	      
			return(Arrays.toString(arr));
		}	

}
