package Hashs;
import java.util.HashSet;
import java.util.Iterator;//using import java.util.Iterator to iterate in set to travel
public class Hashing {
    public static void main(String[] args) {
       HashSet<Integer> set=new HashSet<>();//creating
       
       //insert
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);
      
       //size
       System.out.println("set seize is ="+set.size());

       //print all elements 
       System.out.println(set);

       //serach - contains is a fucntion to serach an elemnt 
       if(set.contains(1)){
        System.out.println("set conatins 1");;
       }
       if(!set.contains(6)){
        System.out.println("does not conatin");
       }

    //    //delete 
    //    set.remove(1);
    //    if(!set.contains(1)){
    //     System.out.println("1 deleted");
    //    }
       
       //iterator- it saves it. the first value it has its null and followed by other values 
       Iterator it=set.iterator();

       while(it.hasNext()){//hasnext just gives true or false value tells if there is next element present or no 
        System.out.println(it.next());//it incarements itself and print the values in the set 
       }
    }
}
