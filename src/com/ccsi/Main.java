package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String s="PAYPALISHIRING";
        System.out.println(convert(s,4));
    }
    //The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
    //(you may want to display this pattern in a fixed font for better legibility)
    //And then read line by line:"PAHNAPLSIIGYIR"
    //Write the code that will take a string and make this conversion given a number of rows
    public static String convert(String s,int numRows){  //还需好好理解
        if(s==null||s.length()==0)return s;
        if(numRows==0)return s;
        int length=s.length();
        int step=2*(numRows-1);
        StringBuilder str=new StringBuilder();

        for (int i = 0; i < numRows; i++) {         //i为行
            for (int j = 0; j < length; j+=step) {  //j为每个循环的起点
               int p=j+i;
                if(p<length)str.append(s.charAt(p));
                p=j+step-i;
                if(i!=numRows-1&&i!=0&&p<length)str.append(s.charAt(p));
            }
        }
        return str.toString();
    }
}
