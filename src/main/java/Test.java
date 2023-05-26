import com.sun.source.tree.Tree;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        String input = "Rakesh=20,Mukesh=10,Anu=10,Vikram=30,sachin=50,Mukesh=30,Anu=100,Vikram=90,Rakesh=30,Kishan=10,Sumit=5,Abhay=20,Rajesh=8,Sumit=30,Rajesh=100,Vikram=30,sachin=50,Mukesh=30,Anu=100,Vikram=90,Rakesh=30,Kishan=10";

        String arr[] = input.split(",");
//        for(String s:arr){
//            System.out.println(s);
//        }
        HashMap<String,Integer> mymap = new HashMap<>();
        ArrayList<String>myname = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("=")){
                String mylatest[] = arr[i].split("=");
                String name  = mylatest[0];
                myname.add(name);

//                System.out.println("The count of" +name +"is"+count);
                int val = Integer.parseInt(mylatest[1]);

                if(mymap.containsKey(name)){

//                    System.out.println("The count of" +name +"is"+count);
                    int sum = mymap.get(name)+val;
                    mymap.put(name,sum);
                }
                else{
                    mymap.put(name,val);
                }
            }
        }
//        System.out.println("Freq of Mukesh: "+Collections.frequency(myname, "Mukesh"));
        for(Map.Entry<String,Integer> entry : mymap.entrySet()){
            String mykey = entry.getKey();
            double count = Collections.frequency(myname, mykey);
//            System.out.println("The count of" +mykey +"is"+count);
            System.out.println("Average of"+mykey+"is"+mymap.get(mykey)/count);

        }
        }
    }

