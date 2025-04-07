import java.util.HashMap;
class FrequencyCounter{
    public static void main(String[] args){
        int[] arr={2,3,2,4,3,5,2};
        
        HashMap <Integer,Integer> obj = new HashMap <> ();
        
        for(int num: arr){
            obj.put(num, obj.getOrDefault(num,0)+1);
        }
        
        for(int key: obj.keySet()){
            System.out.println(key+"~"+obj.get(key)+(obj.get(key)==1 ? "time":"times"));
        }
    }
}
