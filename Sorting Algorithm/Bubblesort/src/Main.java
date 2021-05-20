public class Main {

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,10};
	    for(int lastunsortedindex = a.length-1; lastunsortedindex>0;lastunsortedindex--){
            for(int i = 0;i<lastunsortedindex;i++){
                if(a[i]>a[i+1])
                    swap(a,i,i+1);
            }
        }
	    for(int element:a)
	        System.out.println(element);
    }
    public static void swap(int a[],int i,int j){
        if(a[i] == a[j]){
            return;
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
