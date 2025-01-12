public class Project31 {
    public static void main(String[] args) {

        //print prime number b/n 1 to 100

        for (int i = 2; i <100; i++) {
            int k=0;
            for (int j = 2; j < i; j++) {


                if (i%j==0){
                    k=k+1;
                }


            }if (k==0){
                System.out.println(i);
            }
        }
    }
}