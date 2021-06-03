public class Main {

    public static void main(String[] args) {
	    int input[] = {9,3,2,0,1,7,5,3,6,2,10};
	    counting_sort(input,0,10);
        for(int ele:input)
            System.out.println(ele);
    }
    public static void counting_sort(int[] input,int min, int max){
        int[] CountArray = new int[max-min+1];

        for(int ele:input)
            CountArray[ele - min]++;

        int j = 0;
        for(int i=min;i<=max;i++){
            while(CountArray[i-min]>0){
                input[j++] = i;
                CountArray[i-min]--;
            }
        }
    }
}
