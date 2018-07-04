package practice;

public class TwoDArrayPrint {

	
	
	
	
	public static void twoDArrayPrint(int array[][]){
		
		int array1[]=new int[array.length+1];

		int largest=0;
		int smallest=9;
		int max = array[0][0];
	
		//int [] result = new int[array.length];
		  int min=array[0][0];
		

		  for(int i=0;i<array[0].length;i++){
			   min = array[0][i];
	       for(int j=0;j<array.length;j++){

	           if(array[j][i]<=min){
	        	   min = array[j][i];
	           }
	          // result[i]=min;
	           System.out.println(i);
	       } 

	       
	  }
		  
		  
		  
		  for ( int i=0; i < array.length; i++)
		{
			max=array[i][0];
	  for(int j = 1; j < array[i].length; j++) {
		
			         if ( array[i][j] > max )
		
			             max = array[i][j];      
			
			     }
			
			     System.out.println("Maximum in row[" + i + "]: " + max);
			
			}
		
		
		
		
//	     for (int i = 0; i < array.length; ++i) {
//	       for(int j = 0; j < array[i].length; ++j) {
//	           
//	        if(array[i][j]>largest){
//	        	largest=array[i][j];
//	        
//	       }
//	        
//	        if(smallest<=array[i][j]){
//	        	smallest=array[i][j];
//	        }
//	        	
//	        	
//	        	System.out.print(array[i][j]+" ");
//	        System.out.println(largest); 
//	        System.out.println(smallest);
//	        }
//	        System.out.println();
//	      
//	     }
		
	    
	}
	public static void main(String[] args) {
		
		 int[][] array = {{5, 1, 9,5},{7, 5, 3},{2,4,6,8}};
		  
		 twoDArrayPrint(array);
		 
		 

	}

}
