package patternbuilder.model;



public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar.Builder("Ferrari").setColor(Color.RED).setDoor(2).build();
        System.out.println(myCar);

    }
}
