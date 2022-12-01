import java.util.*;
public class FindPositionInInfiniteArray {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		 int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                               140, 160, 170};
		int target =10;
		System.out.println(solve(arr,target));
        sc.close();
	}
	
	static int solve(int a[],int target){
	    int start = 0 ;
	    int end = 1;
	    while(target>a[end]){
	        int newStart = end+1;
            end = end + (end-start+1) * 2;	 
            start = newStart;
	    }
return binary(a,start,end,target);
	}
	static int binary(int a[],int s,int e,int target){
	    while(s<=e)
	    {
	        int mid=s+(e-s)/2;
	        if(a[mid]>target)
	            e=mid-1;
	        else if(a[mid]<target)
	            s=mid+1;
	        else
	            return mid;
	    }
	    return -1;
	}
}