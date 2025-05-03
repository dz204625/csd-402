package module10;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision internationalDivision1 = new InternationalDivision("Global Marketing", 1001, "France", "French");
        InternationalDivision internationalDivision2 = new InternationalDivision("Asia Operations", 1002, "Japan", "Japanese");

        DomesticDivision domesticDivision1 = new DomesticDivision("East Coast Sales", 2001, "New York");
        DomesticDivision domesticDivision2 = new DomesticDivision("West Coast Support", 2002, "California");

        internationalDivision1.display();
        internationalDivision2.display();
        domesticDivision1.display();
        domesticDivision2.display();
    }
}

