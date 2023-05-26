package org.example;

public class Mergedoddandeven {

    public static void main(String[] args) {


        int odd[] = {1, 3, 5, 7, 9};
        int oddlength = odd.length;

        int even[] = {2, 4, 6, 8, 10};

        int evenlength = even.length;


        int merged[] = new int[oddlength + evenlength];

         int count =0;

         for(int i=0;i<merged.length;i++){

             if(i%2==0 && i/2<even.length){
                 merged[i] = even[i/2];
             }
             if(i%2==1 && i/2<odd.length){
                 merged[i] = odd[i/2];
             }
         }

         for(int a :merged){
             System.out.println(a);
         }

    }


}
