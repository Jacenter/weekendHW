package beersong;

public class Main {
    public static void main(String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {

            System.out.println(beerNum + " " + "bottles" + " " + "of beer on the wall");
            System.out.println(beerNum + " " + "bottles" + " " + "of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum -= 1;

            if (beerNum > 1) {
                System.out.println(beerNum + " " + "bottles" + " " + "of beer on the wall");
              } else if (beerNum == 1) {
                System.out.println(beerNum + " " + "bottle" + " " + "of beer on the wall");
                System.out.println(beerNum + " " + "bottle of beer on the wall");
                System.out.println(beerNum + " " + "bottle of beer");
                System.out.println("Take one down ");
                System.out.println("Pass it around");
                beerNum = beerNum - 1;
                System.out.println("No more bottles of beer on the wall");
              }
        }
    }
}

