class SevenWonders {
        void wonderName() {
                System.out.println("I am a wonder");
        }
}

class GPOG extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Great Pyramid of Giza");
        }
}

class TM extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Taj Mahal");
        }
}

class PT extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Petra");
        }
}

class CR extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Colosseum of Rome");
        }
}

class MZ extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am Machu Picchu");
        }
}

class CI extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Chichen Itza");
        }
}

class CRW extends SevenWonders {
        @Override
        void wonderName() {
                System.out.println("I am the Christ the Redeemer");
        }
}

public class PolyMorphism {
    public static void main(String[] args) {
            SevenWonders giza = new GPOG();
            giza.wonderName();

            SevenWonders tajMahal = new TM();
            tajMahal.wonderName();

            SevenWonders petra = new PT();
            petra.wonderName();

            SevenWonders colosseum = new CR();
            colosseum.wonderName();

            SevenWonders machuPicchu = new MZ();
            machuPicchu.wonderName();

            SevenWonders chichenItza = new CI();
            chichenItza.wonderName();

            SevenWonders christRedeemer = new CRW();
            christRedeemer.wonderName();
    }
}