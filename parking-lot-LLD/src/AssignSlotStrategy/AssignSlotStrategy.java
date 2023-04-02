package AssignSlotStrategy;

import entities.Floor;

import java.util.List;

public interface AssignSlotStrategy
{
    public String assignSlot(String type, String regNo, String color, List<Floor> floorList);
}
