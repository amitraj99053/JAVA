import java.util.Scanner;

public class Project33 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner=new Scanner(System.in);
        int n,sum=0;

        System.out.println("Enter n number :- ");
        n=scanner.nextInt();


        for (int i = 2; i<=n; i++ ){
            int k=0;
            for (int j=2; j<i; j++){

                if (i%j==0){
                    k=k+1;
                }

            }if (k==0){
                sum=sum+i;
                System.out.println(i);
            }


        }
       System.out.println(sum);
        
        
        
    }
}
