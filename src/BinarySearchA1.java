public class BinarySearchA1 {
    public BinarySearchA1(){}
    public int search(int[] saidArray, int low, int high, int value){
        if (low <= high){
            int mid = (low+high)/2;
            System.out.println(mid);
            if      (saidArray[mid]==value)   { return mid;}
            else if (saidArray[mid] < value)  { search(saidArray, mid+1, high, value); }
            else if (saidArray[mid] > value)  { search(saidArray, low, mid-1, value); }
        }
        return -1;
    }

    public static void main(String[]args){
        int[] yomask = {1,14,18,39,45,50,53,55,75,79,89};
        BinarySearchA1 ak = new BinarySearchA1();
        int akm = ak.search(yomask, 0, yomask.length, 45);
        System.out.println(akm);
    }
}
