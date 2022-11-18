package bridgelabz.javasample;

public class frequency {
     public static void main(String[] args) {
    	 int []arr = new int[] {1,2,6,8,4,4,2,2,2,1,1,8,};
    	 int []a = new int[arr.length];
    	 int visited = -1;
    	 for (int i=0;i<arr.length;i++) {
    		 int count=1;
    		 for (int j=i+1;j<arr.length;j++) {
    			 if(arr[i]==arr[j]) {
    				 count++;
    				 a[j]=visited;
    			 }
    			 if(a[i]!=visited)
    				 a[i]=count;
    		 }
    	 }
        for(int i=0;i<a.length;i++) {
        	if(a[i]!=visited)
        		System.out.println(" "+arr[i]+" "+a[i]);
        }
    	 
     }
}
