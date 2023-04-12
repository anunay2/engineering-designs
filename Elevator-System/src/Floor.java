public class Floor {
    int floorNum;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNum){
        this.floorNum = floorNum;
        externalDispatcher = new ExternalDispatcher();
    }
    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floor) {
        this.floorNum = floor;
    }

    public ExternalDispatcher getExternalDispatcher() {
        return externalDispatcher;
    }

    public void setExternalDispatcher(ExternalDispatcher externalDispatcher) {
        this.externalDispatcher = externalDispatcher;
    }

    public void pressButton(Direction direction) {
        externalDispatcher.submitExternalRequest(floorNum, direction);
    }

}
