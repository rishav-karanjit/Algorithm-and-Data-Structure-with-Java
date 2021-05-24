public class Main {

    public static void main(String[] args) {
        int a[] = {1,7,4,3,5,2,9};
        for(int sortedlastindex=0;sortedlastindex<a.length-1;sortedlastindex++){
            int j=a[sortedlastindex+1];
            int i=sortedlastindex;
            while(a[i]>j && i>=0){
                a[i+1]=a[i];
                i--;
            }
            a[i+1] = j;
        }
        for(int element:a)
            System.out.println(element);
    }

}
