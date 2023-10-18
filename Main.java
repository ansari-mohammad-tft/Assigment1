public class Main {
    public static void main(String[] args) {

        CharOccurance occurance = new CharOccurance("Think Future Technology");
//        occurance.printOccurance();
        int arr[]={50,6,1,9,3,22,590,44,90,93,9,28,3,25,80};
        FabnocciArray fabnocciArray = new FabnocciArray(arr);
      fabnocciArray.printArray();
        ConstructorChain constructorChain = new ConstructorChain("Hello");
        DeadlockExample deadlockExample = new DeadlockExample();
    }
}