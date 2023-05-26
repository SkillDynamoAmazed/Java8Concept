package org.example;

public class SubArray {

    public static int maxk(int nums[],int k)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-k+1;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum=sum+nums[j];
            }
            min=Math.min(min,sum);
        }
        return min;
    }
    public static void main(String args[])
    {
        int a[]={1,2,1,2,3};
        int k=2;
        int ans=maxk(a,k);
        System.out.println(ans);
    }
}
