public class Nested_if {

    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) {

            if(isSenior){
                System.out.println("you will get 30% discount on movie ticket");
                price = price * 0.7;

            } else {

                System.out.println("you will get 10% discount on movie ticket");
                price *= 0.9;
            }
        }

        else if(isSenior){
            System.out.println("you will get 20% discount");
            price*=0.8;

        }
        else{

            price *= 1;
        }

        System.out.println("the price of the movie ticket is:"+ price);
    }

}
