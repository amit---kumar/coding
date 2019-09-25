package com.amit.skill.Basics;

import java.util.*;

/**
 * Created by amit on 6/11/16.
 */
public class Magic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            Set<Integer> mn=new HashSet<Integer>();
            List<Integer> p=new ArrayList<Integer>();
            for (int j = 2; j <=n ; j++) {
                int f=0;
                for (int k = 2; k <j/2 ; k++) {
                    if(j%k==0)
                        f=1;
                }
                if (f==0)
                    p.add(j);
            }
            /*for (int x:p) {
                System.out.println("Prime is "+x);
            }*/
            ListIterator<Integer> it=p.listIterator();
            while(it.hasNext()) {
                int d=it.next();
                for (int j = l; j <=r ; j++) {
                    if (j%d==0) {
                        mn.add(j);
                        System.out.println("mn is " + j);
                    }
                }
            }
            System.out.println(mn.size());
        }
    }
}
