import java.util.*;
public class input_application {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        String s,cd,sub,c,p,d,h,sd,ed,t,m;

        //INPUT SECTION
        System.out.print("Enter College name ");
        s=scanner.nextLine();
        System.out.print("Enter current date ");
        cd=scanner.nextLine();
        System.out.print("Enter subject of application ");
        sub=scanner.nextLine();
        System.out.print("Enter your class ");
        c=scanner.nextLine();
        System.out.print("Enter who is not well ");
        p=scanner.nextLine();
        System.out.print("Enter days of effected ");
        d=scanner.nextLine();
        System.out.print("Enter your hometown place ");
        h=scanner.nextLine();
        System.out.print("Enter first leave date ");
        sd=scanner.nextLine();
        System.out.print("Enter end leave date ");
        ed=scanner.nextLine();
        System.out.print("Enter total leave day's ");
        t=scanner.nextLine();
        System.out.println("Enter student name ");
        m=scanner.nextLine();

        //OUTPUT SECTION
        System.out.println("To,");
        System.out.println("The Professor");
        System.out.println(s);
        System.out.println(cd);
        System.out.println("Subject:- " +sub);
        System.out.println("Respected sir,");
        System.out.println("I am a student of "+c+" in your college. My "+p+" is not well from the last "+d+" day's ");
        System.out.println("and my family has planned a visit to our hometown at "+h+", for a week. So, i won't be ");
        System.out.println("able to attend the college from "+sd+" to "+ed+". I will ensure that these holiday's ");
        System.out.println("don't hamper my studies. Thus, I requested you to grand "+t+" day's off from college. ");
        System.out.println("I shall be really thankful to you! ");
        System.out.println();
        System.out.println("Thank you");
        System.out.println();
        System.out.println("Your Obediently Student");
        System.out.println(m);

        


    }
}
