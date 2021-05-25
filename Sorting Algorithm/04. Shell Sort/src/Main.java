public class Main {

    public static void main(String[] args) {
        int a[] = {1,6,9,3,-3,6};
        for(int gap=a.length/2;gap>=1;gap = gap/2){
            //i used for getting new element
            //j used for traversing
            for(int i = gap;i<a.length;i++){
                int newelement = a[i];
                int j = i;
                while(j>=gap && a[j-gap] > a[j]){
                    a[j] = a[j-gap];
                    j = j-gap;
                }
                a[j] = newelement;
            }
        }
        for(int e : a)
            System.out.println(e);
    }
}
