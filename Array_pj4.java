public class Array_pj4 {
    public static void main(String[] args) {

        int[] num={1,4,7,5,9,8,3,2,1};

        int sum=0,avj=0;
        for (int i=0; i< num.length; i++){
            sum = num[i]+sum;
            avj = sum/ num.length;
           //  System.out.println(sum);
        }System.out.println("Sum of num :- "+sum);
        System.out.println("Average of num :- "+avj);
    }
}
