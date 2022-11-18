package bridgelabz.javasample;

public class LargestElement
{
    public static void main(String[] args)
    {
    	int []arr = new int[] {25,78,56,12,3};
    	int max=arr[0];
    	for(int i=0;i<arr.length;i++) 
    	{
    		if(arr[i]>max)
    			max=arr[i];
    	}
    	System.out.println("Largest element in an array:" +max);
    }
}