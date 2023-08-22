package Unit_1.Primiitve_Types;

public class volume {
    public static void main(String[] args){
        int length = 5;
        int width = 10;
        int height = 15;
        int volume = length * width * height;
        System.out.println("The volume is " + volume);

        int surfaceArea = 2*((length*height)+(width*height)+(length*width));
        System.out.println("The surface area is " + surfaceArea);
    }
}