package com.amit.skill.InterviewPreparationKit.arrays;

public class NewYearChaos
{
    public static void main(String[] args)
    {
        int [] arr={2,1,5,3,4};
        minimumBribes(arr);
    }
    static void minimumBribes(int[] a) {
        int bribe=0;
        for (int i = a.length-1; i >=0 ; i--)
        {
            if(a[i]==i+1)
                continue;
            else{
                if(a[i-1]==i+1)
                {
                    bribe++;
                    a[i-1]=a[i];
                    a[i]=i+1;
                }else if(a[i-2]==i+1){
                    bribe=bribe+2;
                    a[i-2]=a[i-1];
                    a[i-1]=a[i];
                    a[i]=i+1;
                }
            }
        }
        System.out.println(bribe);
    }
}
