public class arry83 {
    public static void main(String[] args) {
        int max1,max2;
        int A[]={3,9,7,8,12,2};
        max1=max2=A[0];
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){

                max2=A[i];
            }
        }
        System.out.println(max1+" "+max2);
    }
}
