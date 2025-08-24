import java.util.Scanner;

class CubeSide {
    private double sideLength;
    private double volume;

    
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        }
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume = sideLength * sideLength * sideLength;
        }
    }
}

public class CubeVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        CubeSide cube = new CubeSide();

        System.out.print("Enter the side length of the cube: ");
        double inputSide = scan.nextDouble();
        cube.setSideLength(inputSide);

        System.out.println("The volume of the cube is: " + cube.getVolume());
        scan.close();
    }
}