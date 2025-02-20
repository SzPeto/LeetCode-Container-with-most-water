
public class Main {

	public static void main(String [] args) {
		
		
		
	}
	
    public static int maxArea(int[] height) {
        
    	int i = 0;
    	int j = height.length -1;
    	int result = 0;
    	int tempResult;
    	
    	while(j > i) {
    		
    		if(height[i] > height[j]) {
    			
    			tempResult = (j - i) * height[j];
    			if(tempResult > result) result = tempResult;
    			j--;
    			
    		} else if(height[i] == height[j]) {
    			
    			tempResult = (j - i) * height[i];
    			if(tempResult > result) result = tempResult;
    			i++;
    			
    		} else {
    			
    			tempResult = (j - i) * height[i];
    			if(tempResult > result) result = tempResult;
    			i++;
    			
    		}
    		
    	}
    	
    	return result;
    	
    }
	
}
