package Hashs;
import java.util.HashMap;//are unordered 
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        //county(key),population(value) key is alwys unique
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("india",120);
        map.put("US",30);
        map.put("china",150);

        System.out.println(map);

        map.put("china",180);//updating the value
        System.out.println(map);

        //search
        if(map.containsKey("china")){
            System.out.println("key is present ");
        }
        else {
            System.out.println("key is not present ");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("bali"));//will give null value 

        //iteration i
        int arr[]={1,2,3};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");//normal way to traverse
        }

        for(int val:arr){
            System.out.println(val+" ");//second way 
        }

        //iteration in hashmap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //delete
        map.remove("china");
        System.out.println(map);


        }
    
}
    
