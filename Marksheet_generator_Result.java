

    import java.util.Scanner;

    class Marksheet_generator_Result {
        public static void main(String arg[]) {
            String name, fname, rollno;
            int i, Gtotal = 0, count = 0;

            String subject[] = {
                    "Mathematics",
                    "Human Value",
                    "Physics",
                    "Computer Programming",
                    "Electrical & Electronics",
                    "Mechanical Engineering"
            };

            String subcode[] = {
                    "MA-102",
                    "HU-103",
                    "PY-101",
                    "CS-103",
                    "EE-101",
                    "ME-101"
            };

            int midmarks[] = new int[6];
            int semmarks[] = new int[6];

            Scanner s = new Scanner(System.in);

            System.out.println("\tEnter your Full Name: ");
            name = s.nextLine();

            System.out.println("\tEnter your Father's Name:");
            fname = s.nextLine();

            System.out.println("\tEnter your Roll Number:");
            rollno = s.nextLine();

            for (i = 0; i < 6; i++) {
                System.out.println("\tEnter Midterm Marks for " + subject[i] + ":");
                midmarks[i] = s.nextInt();
            }

            System.out.println("\n\tOK NOW");

            for (i = 0; i < 6; i++) {
                System.out.println("\tEnter Final Exam Marks for " + subject[i] + ":");
                semmarks[i] = s.nextInt();
            }

            System.out.println("\n\t\t\t\tYOUR RESULT\n");
            System.out.println("\t\t  College:\tCollege of Engineering and Technology, Bikaner");
            System.out.print("\n\t\t  Name: " + name);
            System.out.println("\t\tFather's Name:\t" + fname);
            System.out.println("\t\t  Roll Number:\t" + rollno);

            System.out.println("\n\t\t " + "Subcode" + "\tmarks1" + "\tmarks2" + "\tTotal");

            for (i = 0; i < 6; i++) {
                if (((midmarks[i]) + (semmarks[i])) >= 40) {
                    System.out.println("\t\t  " + subcode[i] + "\t\t" + midmarks[i] + "\t" + semmarks[i] + "\t" + ((midmarks[i]) + (semmarks[i])));
                } else {
                    System.out.println("\t\t  " + subcode[i] + "\t\t" + midmarks[i] + "\t" + semmarks[i] + "\t" + ((midmarks[i]) + (semmarks[i])) + "*");
                    count++;
                }
                Gtotal = (Gtotal + ((midmarks[i]) + (semmarks[i])));
            }

            if (count > 0) {
                System.out.println("\n\t\t Grand Total:\t" + Gtotal + "\tResult:\tFAIL");
            } else {
                System.out.println("\n\t\t Grand Total:\t" + Gtotal + "\tResult:\tPASS");
            }
        }
    }


