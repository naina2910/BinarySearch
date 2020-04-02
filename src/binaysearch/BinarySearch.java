package binaysearch;

public class BinarySearch {
    private int arr[];

    public BinarySearch(int[] arr) {
        this.arr = arr;
    }

    //iterative
    public int BinarySearch(int searchelement)
    {
        int responese=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid = (low + high) / 2;
            if (searchelement == arr[mid]) {
                responese = mid;
                break;
            } else if (searchelement > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return responese;
    }

    public static void main(String[] args) {
        int sortedArray[]={10,20,30,40};
        BinarySearch obj=new BinarySearch(sortedArray);
        int index=obj.BinarySearch(40);
        if(index<0)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(index);
        }

    }
}
