public class Cars1 {

    String color;
    String brand;

    public static void tranfers(String [] args) {
        Cars firstCar = new Cars();
        firstCar.color = "black";
        firstCar.brand = "bmw";

        Cars secondCar = new Cars();
        secondCar.color = "white";
        secondCar.brand = "toyota";

        Cars thirdCar = new Cars();
        thirdCar.color = "blue";
        thirdCar.brand = "lexus";
    }
}
