public class Array_pj7 {
    public static void main(String[] args) {

        String[][] Name =  {{"Friend_Name","Feedback"},{"Amit","You are a very good person"},{"Nitesh","You are a very good person"},{"Rahul","You are a very good person",},{"Sachin","You are a very good person"}};
        for (int i=0; i< Name.length; i++){


            for (int j=0; j<2; j++){

                System.out.print(Name[i][j]+"     ");
            }
            System.out.println();



        }
    }
}
