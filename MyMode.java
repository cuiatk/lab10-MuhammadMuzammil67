package lab10;
import java.util.Arrays;
public class MyMode implements Mode {

	
	@Override
	
	public int getMode(int[] val)
	{
		
		int max = Arrays.stream(val).max().getAsInt();
		int t = max + 1; 
        int[] count = new int[t]; 
        for (int i = 0; i < t; i++)  
        { 
            count[i] = 0; 
        } 
        
        
        int mode = 0; 
        int k = count[0]; 
        for (int i = 1; i < t; i++)  
        { 
            if (count[i] > k) 
            { 
                k = count[i]; 
                mode = i; 
            } 
        } 
  
  //      System.out.println("mode = " + mode); 
    	    return 0;
	}

	public static void main(String[] args) {
		MyMode mm=new MyMode();
		int[] arr = {0, 0, 1, 4, 1, 0, 2, 7, 1, 0, 2, 5, 0, 3, 6}; 
      
        System.out.print("Mode is "+ mm.getMode(arr));
       

	}

}
