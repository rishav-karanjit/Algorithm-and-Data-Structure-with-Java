public class Main {

    public static void main(String[] args) {
        int[] input = {9,2,-1,2,32};
        mergesort(input,0,input.length);

        for(int i:input)
            System.out.println(i);
    }
    public static void mergesort(int[] input,int start,int end){
        if(end-start<2){
            return;
        }
        int mid = (start+end)/2;
        mergesort(input,start,mid);
        mergesort(input,mid,end);
        merge(input,start,mid,end);
    }
    public static void merge(int[] input, int start,int mid,int end){
        //Already Sorted case
        if(input[mid-1]<input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int[] temp = new int[end-start];
        int k = 0;
        while(i<mid && j<end){
            temp[k++] = input[i]<input[j] ? input[i++] : input[j++];
        }
        //copy the element of 1st array to second if it is not added to temp. If added no change
        System.arraycopy(input,i,input,start + k,mid-i);

        System.arraycopy(temp,0,input,start,k);
    }

}
