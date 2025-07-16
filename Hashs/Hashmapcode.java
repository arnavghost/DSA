package Hashs;
import java.util.*;
import java.util.Map;

public class Hashmapcode {
    static class HashMap<K,V>{
        K key;
        V value;

        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }

    private int n;//n-total no of nodes
    private int N;//N-buckets 
    private LinkedList<Node> buckets[];
    
    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]= new LinkedList<>();
        }
    }

    private int hashfunction(K key ){//value should lie between 0 to N-1 only
        int bi=key.hashCode();
        return Math.abs(bi) % N;//need a positive value always

    }

    private int searchinLL(K key, int bi){
        LinkedList<Node> ll = buckets[bi];
        int di=0;
        for (int i =0;i<ll.size();i++){
            if(ll.get(i).key== key ){
                return i;
            }
        }
        return -1;
     }

     private void rehash(){
        LinkedList<Node> oldbucket[]= buckets;
        buckets=new LinkedList[N*2];

        for(int i=0;i<N*2;i++){
            buckets[i]= new LinkedList<>();
        }

        for(int i=0;i<oldbucket.length;i++){
            LinkedList<Node> ll = oldbucket[i];
            for(int j=0;j<ll.size();j++){
                Node node= ll.get(j);
                put(node.key, node.value);
            }
        }
     }

    public void put(K key, V value){
        int bi = hashfunction(key);
        int di= searchinLL(key,bi);//data index in linked list 

        if(di == -1){//when di=-1 key dosent exist 
            buckets[i].add(new Node(key,value));
            n++;
        }else{//exist
            Node node= buckets[bi].get(di);
            return node.value = value;
        }
        double lamda=(double)n/N;
        if(lamda>2.0){//rehashing if lamda value exceed 
            rehash();
        }

    }

    public boolean conatinsKey(K key){

        int bi = hashfunction(key);
        int di= searchinLL(key,bi);//data index in linked list 

        if(di == -1){//when di=-1 key dosent exist 
            return false;
        }else{//exist
            return true;
        }

    }

    public V remove(K key){

        int bi = hashfunction(key);
        int di= searchinLL(key,bi);//data index in linked list 

        if(di == -1){//when di=-1 key dosent exist 
            return null;
        }else{//key exist
            Node node= buckets[bi].remove(di);
            n--;
            return node.value ;
        }
    }

    public V get(K key){

        int bi = hashfunction(key);
        int di= searchinLL(key,bi);//data index in linked list 

        if(di == -1){//when di=-1 key dosent exist 
            return null;
        }else{//exist
            Node node= buckets[bi].get(di);
            return node.value ;
        }
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys=new ArrayList<>();

        for(int i=0;i<buckets.length;i++){//bi
            LinkedList<Node> ll=buckets[i];
            for(int j=0;j<ll.size();j++){//di
                Node node=ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isempty(){
        return n==0;
    }

    public static void main(String args[]){
        HashMap<String , Integer> map= new HashMap<>();
        map.put("india",120);
        map.put("US",30);
        map.put("china",150);

        ArrayList<String> keys=map.keySet();
        for(int i=;i<keys.size;i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }

    }
    
}
