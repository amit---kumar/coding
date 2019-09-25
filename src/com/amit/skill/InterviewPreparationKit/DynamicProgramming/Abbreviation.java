package com.amit.skill.InterviewPreparationKit.DynamicProgramming;

public class Abbreviation
{
    public static void main(String[] args)
    {
        String a="wZPRSZwGIMUAKONSVAUBUgSVPBWRSTJZECxMTQXXA";
        String b="ZPRSZGIMUAKONSVAUBUSVPBWRSTJZECMTQXXA";
        System.out.println(abbreviation(a,b));
    }

    static String abbreviation(String a, String b) {
        int[][]l=new int [a.length()+1][b.length()+1];
        for (int i = 0; i <b.length()+1 ; i++)
        {
            l[0][i]=0;
        }
        for (int i = 0; i <a.length()+1 ; i++)
        {
            l[i][0]=0;
        }
        l[0][0]=1;
        int v1=0;
        int v2=0;
        int x=0;
        for (int i = 1; i <a.length()+1 ; i++)
        {
            for (int j = 1; j <b.length()+1 ; j++)
            {
                if( a.charAt(i-1)==b.charAt(j-1))
                    if(l[i-1][j-1]==0 && (i!=1 ||j!=1))
                        l[i][j]=0;
                    else
                        l[i][j]=l[i-1][j-1]+1;
                else if( Character.toLowerCase(a.charAt(i-1))==Character.toLowerCase(b.charAt(j-1))){
                    x=l[i-1][j-1]>l[i-1][j]?l[i-1][j-1]:l[i-1][j];
                    x=x>l[i][j-1]?x:l[i][j-1];
                    l[i][j]=x+1;
                }
                else {
                    if(Character.isLowerCase(a.charAt(i-1)))
                        v1=l[i-1][j];
                    if(Character.isLowerCase(b.charAt(j-1)))
                        v2=l[i][j-1];
                    l[i][j]=v1>v2?v1:v2;
                    if(v1!=0)
                        l[i][j]++;
                }
                v1=0;
                v2=0;
            }
        }
        for (int i = 0; i <a.length()+1 ; i++)
        {
            for (int j = 0; j <b.length()+1 ; j++)
            {
                System.out.print(l[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println(l[a.length()][b.length()]);
        System.out.println(a.length()+"   "+b.length());
        if(a.length()>b.length()){
            if(l[a.length()][b.length()]>=b.length() && l[a.length()][b.length()] <=a.length())
                return "YES";
            else
                return "NO";
        }else{
            if(l[a.length()][b.length()]>=a.length() && l[a.length()][b.length()] <=b.length())
                return "YES";
            else
                return "NO";
        }
    }
}
