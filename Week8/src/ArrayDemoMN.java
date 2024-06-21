import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Megan Noel
 * Arrays
 * 3/6/24
 */
public class ArrayDemoMN {

	/**
	 * this is the main entry point
	 */
	public static void main(String[] args) {
		 int aintValues[]; 
	     int intArraySize = 0;
	     double dblAverage = 0;
	     int intMaximumValue = 0;
	     int aintValues7[];
	     int aintValues8[];
	     int aintValues9[];
	     int aintValues10[];
	        
	     aintValues = MakeArray(intArraySize); 
	     PopulateArray(aintValues);
	     PrintArrayValues(aintValues);
	     dblAverage = CalculateAverage(aintValues);
	     
	     System.out.println("The average value is " + dblAverage);
	     
	     intMaximumValue = GetMaximumValue(aintValues);
	     
	     System.out.println("The maximum value is " + intMaximumValue);
	     
	     aintValues7 = AddValueToEndOfArray(aintValues, 5);
	     
	     PrintArrayValues(aintValues7);
	     
	     aintValues8 = AddValueToFrontOfArray(aintValues, 10);
	     
	     PrintArrayValues(aintValues8);
	     
	     aintValues9 = InsertValueIntoArray(aintValues, 42, 2);
	     
	     PrintArrayValues(aintValues9);
	     
	     aintValues10 = RemoveValueFromArray(aintValues, 2);
	     
	     PrintArrayValues(aintValues10);
	     
	     
}
	    


	/**
	   * This method prompts the user for an array size and allocates space accordingly
	   * @return aintValues
	   */
	 public static int[] MakeArray(int intArraySize) {      
	     do {
	         System.out.println("Enter an array size from 0 to 100: ");
	         intArraySize = ReadIntegerFromUser();
	     } while (intArraySize < 0 || intArraySize > 100);
	        
	     int[] aintValues = new int[intArraySize]; 
	        
	     return aintValues;
	 }
	
	/* This method returns an integer value from a users input
	 * 
	 */
	public static int ReadIntegerFromUser( )
	{

		int intValue = 0;

		try
		{
			String strBuffer = "";	

			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;

			// Read a line from the user
			strBuffer = burInput.readLine( );
			
			// Convert from string to integer
			intValue = Integer.parseInt( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}
		

		// Return integer value
		return intValue;
	}
	
	
	
	
	  /**
	   * this method populates the array
	   * @param aintValues
	   */
	  public static void PopulateArray(int[] aintValues) {
		
		  int intIndex = 0;
		  
		  for (intIndex = 0; intIndex < aintValues.length; intIndex += 1) {
			  System.out.println("Enter value " + (intIndex +1) + ": ");
			  aintValues[intIndex] = ReadIntegerFromUser();
		  }		  	  
		
	}
	  
	  
	  /**
	   * this method prints each value of the array
	   * 
	   */
	   public static void PrintArrayValues(int[] aintValues) {
			int intIndex = 0;
			
			for (intIndex = 0; intIndex < aintValues.length; intIndex+= 1) {
				System.out.println("Value number " + (intIndex + 1) + " is " + aintValues[intIndex]);
			}
			
		}
	   
		  /**
		   * this method calculates the average value of the array and returns it
		   * 
		   */
		public static double CalculateAverage(int[] aintValues) {
			double dblAverage = 0;
			int intIndex = 0;
			int intTotal = 0;
			
			
			for (intIndex = 0; intIndex < aintValues.length; intIndex+= 1) {
				intTotal += aintValues[intIndex];
			}
			
			dblAverage = (double) intTotal / aintValues.length;
			
			return dblAverage;
		}

		/**
		 * this method finds the maximum value in the array and returns it
		 * 
		 * 
		 */
		public static int GetMaximumValue(int[] aintValues) {
			int intIndex = 0;
			int intMaximum = 0;
			
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1) {
				if (aintValues[intIndex] > intMaximum) {
					intMaximum = aintValues[intIndex];
				}								
			}
			
			return intMaximum;
		}
		
		
		/**
		 * this method makes a copy of an array and adds a given value to the end of it
		 * 
		 * 
		 */
		public static int[] AddValueToEndOfArray(int[] aintValues, int intValue) {
			int aintValues7[];
			aintValues7 = new int[aintValues.length + 1];
			int intIndex = 0;
			
			for (intIndex = 0; intIndex < aintValues.length; intIndex+= 1) {
				aintValues7[intIndex] = aintValues[intIndex];
			
			}
			
			aintValues7[aintValues.length] = intValue;
			
			return aintValues7;
		}
		
		

		/**
		 * this method makes a copy of an array and adds a given value to the front of it
		 * 
		 * 
		 */

		public static int[] AddValueToFrontOfArray(int[] aintValues, int intValue) {
			int aintValues8[];
			aintValues8 = new int[aintValues.length + 1];
			int intIndex = 0;
			
			for (intIndex = 0; intIndex < aintValues.length; intIndex += 1) {
				aintValues8[intIndex + 1] = aintValues[intIndex];
			
			}
			
			aintValues8[0] = intValue;
			
			return aintValues8;
		}
		
		/**
		 * this method takes in an array, index, and value and inserts the value into the array at the given index
		 * 
		 * 
		 */

		public static int[] InsertValueIntoArray(int[] aintValues, int intValue, int intIndex) {
			int aintValues9[];
			aintValues9 = new int[aintValues.length + 1];
			int intCount = 0;
			
			if (intIndex < 0 || intIndex >= aintValues.length) {
				intIndex = 0;
			}
			
			for (intCount = 0; intCount < intIndex; intCount += 1) {
				aintValues9[intCount] = aintValues[intCount];
			}
			
			aintValues9[intIndex] = intValue;
			
			for (intCount = intIndex; intCount < aintValues.length; intCount += 1) {
				aintValues9[intCount + 1] = aintValues[intCount];
			}
			
			
			
			return aintValues9;
		}

		/**
		 * this method takes in an array and an index and removes the value located at that index
		 * 
		 * 
		 */
		
		public static int[] RemoveValueFromArray(int[] aintValues, int intIndex) {
			int aintValues10[];
			aintValues10 = new int[aintValues.length - 1];
			int intCount = 0;
			
			if (intIndex < 0 || intIndex >= aintValues.length ) {
				intIndex = 0;
			}
			
			for (intCount = 0; intCount < intIndex; intCount += 1) {
				aintValues10[intCount] = aintValues[intCount];
				
			}
			
			for (intCount = intIndex + 1; intCount < aintValues.length; intCount += 1 ) {
				aintValues10[intCount - 1] = aintValues[intCount];
			}
			
			
			
			
			return aintValues10;
		}





		
		

}
