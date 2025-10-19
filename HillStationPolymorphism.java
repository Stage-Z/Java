class Hillstations {
    void location() {
        System.out.println("Location is:");
    }

    void famousfor() {
        System.out.println("Famous for:");
    }
}

class Manali extends Hillstations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousfor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends Hillstations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousfor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends Hillstations {
    @Override
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    void famousfor() {
        System.out.println("It is Famous for skiing");
    }
}

 public class HillStationPolymorphism{
    public static void main(String args[]) {
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
}
