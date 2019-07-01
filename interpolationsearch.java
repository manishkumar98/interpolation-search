class interpolationsearch{
//this search has uniform distribution and hence the formula calculated taking average int .....
//.....pos=lo+((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]);
 static int arr[]=new int []{10,12,13,14,47};
 static int test(int n)
{
 int lo=0;
 int hi=arr.length-1;
 int x=n;
 while(lo<=hi&&arr[lo]<=x&&arr[hi]>=x)
 {
    if(lo==hi){
    
        if(arr[lo]==x)
        return lo; 
        return -1;
    
    }
    int pos=(int)(lo+((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));
    if(arr[pos]==x)
    return pos;
    if(arr[pos]<x)
    lo=pos+1;
    else
    hi=pos-1;
       
    }
    return -1;
}
   public static void main(String args[])
 {
    int x=13;
    for(int i=0;i<arr.length;i++)
    
    System.out.print(arr[i]+" ");
    System.out.println();
    int index=test(x);
    if(index==-1)
    System.out.println("Not  found");
    else
    System.out.println("Element found at index "+(index+1));
    
   }
}






