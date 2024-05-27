public class Apartment {

    int bedrooms;
//    String city;
    Address address;
    int price;
    int area;

    String getInfoCard() {
        String result =
        "===================" +
                "\nPrice: " + price +
                "\nBedrooms: " + bedrooms +
                "\nCity: " + address.city +
                "\nState: " + address.state +
                "\n===================";
        return result;
    }

//    String getInfoCard() {
//        String result = "----------------------" +
//        "Price: " + price +
//        "Bedrooms: " + bedrooms +
//        "City: " + address         ;
//
//        return result;
//
//    }
//

}
