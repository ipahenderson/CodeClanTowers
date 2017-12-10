package Rooms;

public enum RoomType {
    SINGLE(1, 40.00),
    DOUBLE(2, 60.00),
    FAMILY(4, 120.00),
    DININGROOM(40, 10.00),
    CONFERENCEROOM(100, 1000.00);

    private final int value;
    private final double price;

    RoomType(int value, double price){
        this.value = value;
        this.price = price;
    }

    public int getTypeCapacity(){
        return this.value;
    }


    public double getTypePrice() {
        return this.price;
    }
}
