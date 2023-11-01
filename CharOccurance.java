import java.util.HashMap;

public class CharOccurance {
    HashMap<Character,Integer> hashMap ;
    String input="";
    public CharOccurance(String input){
        this.hashMap = new HashMap<>();
        this.input=input;
        for(char c:input.toCharArray()){

//            doing this because in question print character occurrence in order it presents in string
//            does not count the space occurrence
            if(c!=' '&&hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);
            }
            else if(c!=' '){
                hashMap.put(c,1);
            }
        }
    }
    public void printOccurance(){
        for(char c:input.toCharArray()){
//            doing this because in question print character occurrence in order it presents in string
            if(hashMap.containsKey(c))
            {
                System.out.print(c+" ="+hashMap.get(c)+" ");
                hashMap.remove(c);
            }
        }
    }
}
