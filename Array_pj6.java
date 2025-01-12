public class Array_pj6 {
    public static void main(String[] args) {

        String[][] Name =  {{"STUDENT_NAME","ROLL_NO"},{"Amit","5"},{"Nitesh","8"},{"Rahul","2",},{"Sachin","6"}};
        for (int i=0; i< Name.length; i++){


            for (int j=0; j<2; j++){

                System.out.print(Name[i][j]+"     ");
            }
            System.out.println();



        }

    }
}
