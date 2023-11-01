public class FabnocciArray {
    int array[];
    int tearm1=0,tearm2=1;
    public FabnocciArray(int array[])
    {
        this.array = array;
    }
    public void printArray(){
        if(array.length<1)
            return;
        System.out.println(array[tearm1]);
        while(tearm2<array.length){
            System.out.println(array[tearm2]);
            int temp = tearm1+tearm2;
            tearm1=tearm2;
            tearm2=temp;
        }
    }

}
