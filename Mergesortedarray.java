/**
 * Mergesortedarray
 */

public class Mergesortedarray {
    public static void main(String[] args) 
        
    {
        int[] n1={1,2,3,0,0,0};
        int[] n2={4,5,6};
        int m=3;
        int n=3;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && n1[i]>n2[j]){
                n1[k--]=n1[i--];
            }
            else{
                n1[k--]=n2[j--];
            }
            
        }
        System.out.println(n1);
    }
}