public class Main {

    public static void main(String[] args) {
	    int[] input = {1,6,2,-5,5};
	    quicksort(input,0,input.length);
	    for(int ele:input)
	        System.out.println(ele);
    }

    public static void quicksort(int[] input,int start,int end ){
        if(end-start<2){
            return;
        }
        int pivot_index = partition(input,start,end);
        quicksort(input,start,pivot_index);
        quicksort(input,pivot_index+1,end);
    }
    public static int partition(int[] input,int start,int end){
        int pivot = input[start],i = start, j = end;
        while(i<j){

            while(i<j && input[--j]>=pivot);
            if(i<j){
                input[i]= input[j];
            }

            while(i<j && input[++i]<=pivot);
            if(i<j){
                input[j]= input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
