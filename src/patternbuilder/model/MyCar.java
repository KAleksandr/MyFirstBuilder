package patternbuilder.model;

public class MyCar {
    private int id;
    private String name;
    private TypeCar typeCar;
    private int countDoor;
    private Color color;
    private Transmission transmission;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public int getCountDoor() {
        return countDoor;
    }

    public Color getColor() {
        return color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    private MyCar(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.typeCar = builder.typeCar;
        this.countDoor = builder.door;
        this.color = builder.color;
        this.transmission = builder.transmission;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", typeCar=" + typeCar +
                ", countDoor=" + countDoor +
                ", color='" + color + '\'' +
                ", transmission=" + transmission +
                '}';
    }

    static class Builder {
        private static int id =0;
        private String name;
        private TypeCar typeCar = TypeCar.SEDAN;
        private int door = 4;
        private Color color =Color.CYAN;
        private Transmission transmission = Transmission.MANUAL;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTypeCar(TypeCar typeCar) {
            this.typeCar = typeCar;
            return this;
        }

        public Builder setDoor(int door) {
            this.door = door;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public MyCar build() {
            return new MyCar(this);
        }
    }
}
