package Rooms;

public enum RoomType {
    SINGLE("Single", 1, 40.00),
    DOUBLE("Double", 2, 60.00),
    FAMILY("Family", 4, 120.00),
    DININGROOM("Dining Room", 40, 10.00),
    CONFERENCEROOM("Conference Room", 100, 1000.00);

    private final String name;
    private final int value;
    private final double price;

    RoomType(String name, int value, double price){
        this.name = name;
        this.value = value;
        this.price = price;
    }

    public int getTypeCapacity(){
        return this.value;
    }


    public double getTypePrice() {
        return this.price;
    }

    public String roomTypeName() {
        return this.name;
    }
}
