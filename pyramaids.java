package Unit_1.Primiitve_Types;

public class pyramaids {
    static double volume(int l,int w, int h){
        double volume = (l*w*h)/3;
        return volume;
    }
    static double surfaceArea(int l, int w, int h){
        double surfaceArea = (l*w) * Math.sqrt(Math.pow(w/2,2) + Math.pow(h,2)) + w * Math.sqrt(Math.pow(l/2,2) * Math.pow(h,2));
        return surfaceArea;
    }

    public static void main(String[] args){
        int l1 = 1;
        int w1 = 2;
        int h1 = 4;
        
        int l2 = 3;
        int w2 = 5;
        int h2 = 7;

        int l3 = 8;
        int w3 = 8;
        int h3 = 4;

        int l4 = 2;
        int w4 = 6;
        int h4 = 4;

        int l5 = 5;
        int w5 = 5;
        int h5 = 10;
        // Pyramaids 1-5

        System.out.println("Pyramaid 1: Voulme: " + volume(l1,w1,h1) + " Surface Area: " + surfaceArea(l1, w1, h1));
        System.out.println();
        System.out.println("Pyramaid 2: Volume: " + volume(l2,w2,h2) + " Surface Area: " + surfaceArea(l3, w3, h3));
        System.out.println();
        System.out.println("Pyramaid 3: Volume: " + volume(l3, w3, h3) + " Surface Area: " + surfaceArea(l3, w3, h3));
        System.out.println();
        System.out.println("Pyramaid 4: Volume: " + volume(l4, w4, h4) + " Surface Area: " + surfaceArea(l4, w4, h4));
        System.out.println();
        System.out.println("Pyramaid 5: Volume:" + volume(l5, w5, h5) + " Surface Area: " + surfaceArea(l5, w5, h5));
        //Printing Area
    }
}
