package com.amit.skill.collection;

/**
 * Created by amit on 15/11/16.
 */
public class Song implements Comparable<Song>{
    String t;
    String a;
    String r;
    String b;
    Song( String t,    String a,    String r,    String b){
        this.a=a;
        this.t=t;
        this.b=b;
        this.r=r;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Song{" +
                "t='" + t + '\'' +
                ", a='" + a + '\'' +
                ", r='" + r + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public int compareTo(Song s) {
        return a.compareTo(s.getA());
    }
}
