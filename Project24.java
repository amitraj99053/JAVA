public class Project24 {
    public static void main(String[] args) {

        /*102030405060708090100
          91827364554637281
          816243240485664
          7142128354249
          61218243036
          510152025
          481216
          369
          24
          1
          */
        int i,j;

        for (i=10; i>=1; i--){

            for (j=1; j<=i; j++){

                int r=i*j;
                System.out.print(r);
            }
            System.out.println("\n");
        }
    }
}
