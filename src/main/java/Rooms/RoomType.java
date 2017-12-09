package Rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    DININGROOM(40),
    CONFERENCEROOM(100);

    private final int value;

    private RoomType(int value){
        this.value = value;
    }

    public int getTypeCapacity(){
        return this.value;
    }



}
