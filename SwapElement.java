public class SwapElement {
    int arr1[];
    int arr2[];
    SwapElement(int arr1[],int arr2[]){
        this.arr1=arr1;
        this.arr2=arr2;

    }
    public void swapArray()
    {
        for(int i=0;i< arr1.length&&i<arr2.length;i++)
        {
            int temp=arr1[i];
            arr1[i] =arr2[i];
            arr2[i]=temp;

        }
    }
    public void print()
    {
//        element of array1
        for(int i:arr1)
        {
            System.out.print(i+" ");
        }
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
    }

}
