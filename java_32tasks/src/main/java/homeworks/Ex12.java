package homeworks;

public class Ex12 {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.addPrice(5);
        Beer beer2 = new Beer();
        beer2.addPrice(12);
        System.out.println("The cost of beer is " + Beer.beerPrice);
    }

    public static class Beer {
        public static int beerPrice = 0;

        public static void addPrice(int beerPrice) {
            System.out.println(beerPrice);
            Beer.beerPrice += beerPrice;


        }
    }
}