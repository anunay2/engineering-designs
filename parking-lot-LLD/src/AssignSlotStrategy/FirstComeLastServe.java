package AssignSlotStrategy;

import entities.Floor;

import java.util.List;

public class FirstComeLastServe implements AssignSlotStrategy{

    @Override
    public String assignSlot(String type, String regNo, String color, List<Floor> floorList) {
        System.out.println("First Come last serve");
        return null;
    }
}
