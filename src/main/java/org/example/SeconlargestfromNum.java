package org.example;

public class SeconlargestfromNum {

    public static void main(String[] args) {

        int n = 798;
        String s = Integer.toString(n);
        char c1[] = s.toCharArray();
        int  n1 = c1.length;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                if(c1[j]>c1[i]){
                    char temp = c1[j];
                    c1[j] = c1[i];
                    c1[i] = temp;
                }
            }
        }
        String n2 = "";
        for(int i=0;i<n1;i++){
           n2+= c1[i];
        }
        System.out.println(n2.charAt(1));
    }
}
