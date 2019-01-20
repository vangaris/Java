public class Main {

    public static void main(String[] args) {
       double myDouble1 = 20;
       double myDouble2 = 80;

       double myDoubles = (myDouble1 + myDouble2) * 25;

       myDoubles = myDoubles % 40;

       if(myDoubles <= 20){
           System.out.println("Total was over the limit " + myDoubles);
       }


    }
}
