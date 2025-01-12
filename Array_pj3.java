public class Array_pj3 {
    public static void main(String[] args) {

        int[] num={1,4,7,5,9,8,3,2};

        int sum=0;
        for (int i=0; i< num.length; i++){
             sum = num[i]+sum;
            System.out.println(sum);
        }
    }
}
