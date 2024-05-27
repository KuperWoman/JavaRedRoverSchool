import java.util.Arrays;

public class L_07 {
    public static void main(String[] args) {

        int myVar = 12;

// экземпляр класса = объект
        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.address = new Address();
        apt1.address.city = "San Francisco";
        apt1.address.state = "CA";
        apt1.price = 3500;
        apt1.area = 100;

        Apartment apt2 = new Apartment();
        apt2.bedrooms = 2;
        apt2.address = new Address();
        apt2.address.city = "Atlanta";
        apt2.address.state = "GA";
        apt2.price = 1800;
        apt2.area = 200;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 4;
        apt3.address = new Address();
        apt3.address.city = "Fresno";
        apt3.address.state = "CA";
        apt3.price = 600;

        Apartment apt4 = new Apartment();
        apt4.bedrooms = 2;
        apt4.address = new Address();
        apt4.address.city = "San Francisco";
        apt4.address.state = "CA";
        apt4.price = 3800;

        Apartment apt5 = new Apartment();
        apt5.bedrooms = 3;
        apt5.address = new Address();
        apt5.address.city = "Atlanta";
        apt5.address.state = "GA";
        apt5.price = 2000;

        Apartment[] apts = new Apartment[]{apt1, apt2, apt3, apt4, apt5};
        for (int i = 0; i < apts.length; i++) {
            Apartment currentApt = apts[i];
             boolean isInSF = currentApt.address.city.equals("San Francisco");
             if (isInSF) {
//            if (currentApt.city.equals("San Francisco")){
                System.out.println("Bedrooms: " + currentApt.bedrooms);
                System.out.println("Price: " + currentApt.price);
                System.out.println("-------------------------");
            }
        }

        System.out.println("==========================");

        for (int i = 0; i < apts.length; i++) {
            if (apts[i].price <= 2500) {
                System.out.println("Bedrooms: " + apts[i].bedrooms);
                System.out.println("Price: " + apts[i].price);
                System.out.println("City: " + apts[i].address.city);
                System.out.println("-------------------------");

            }
        }
        System.out.println("=========================");
        for (int i = 0; i < apts.length; i++) {
            if (apts[i].address.state.equals("CA"))  {
                System.out.println(apts[i].getInfoCard());


//                System.out.println("Bedrooms: " + apts[i].bedrooms);
//                System.out.println("Price: " + apts[i].price);
//                System.out.println("City: " + apts[i].address.city);
//                System.out.println("-------------------------");





            }
        }
//        String.valueOf()

// свойства - пропертис - поля класса - могут быть разных типов
//



    }
}
