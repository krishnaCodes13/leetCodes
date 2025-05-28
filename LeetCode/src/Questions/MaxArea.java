package Questions;

// problem no. 11
//container with most water

public class MaxArea {

	public static void main(String[] args) {
		int height[] = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
	
	public static int maxArea(int[] height) {
        int maxArea = 0;
        int start=0;
        int end = height.length-1;

      while(start<end){
            if(height[start]<height[end]){
                int value = height[start]*(end-start);
                if(maxArea<value){
                    maxArea=value;
                }
            }else{
                int value = height[end]*(end-start);
                if(maxArea<value){
                    maxArea=value;
                }
            }
             if(height[start]<height[end]){
                start++;
            }else{
               end--;
            }
        }

        return maxArea;
        
    }

}
