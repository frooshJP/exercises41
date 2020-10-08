package task2;


import java.util.List;

public class Building {

    private List<Room> Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(List<Room> Rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public List<Room> getRooms()
    {
        return Rooms;
    }

    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms; }

    public int getNumberOfFloors()
    {
        return numberOfFloors; }

    public boolean getIsOfficeBuilding()
    {
        return isOfficeBuilding; }
}
