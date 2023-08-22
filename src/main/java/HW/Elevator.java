package HW;

public class Elevator {
    private int maxFloor;
    private int minFloor;
    private int currentFloor;

    public Elevator(int minFloor,int maxFloor) {
        if(minFloor >= maxFloor){
            throw new IllegalArgumentException("Максимальный этаж должен быть больше минимального");
        } else {
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
            this.currentFloor = minFloor;
        }
    }
    public Elevator(int maxFloor){
        this(1,maxFloor);
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setMaxFloor(int maxFloor) {
        if(maxFloor <= this.minFloor){
            throw new IllegalArgumentException("Изменение невозможно значение maxFloor не может быть <= minFloor");
        } else if(maxFloor > this.currentFloor){
            this.maxFloor = maxFloor;
            this.currentFloor = maxFloor;
            System.out.println("Текущий этаж равен максимальному");
        } else {
            this.maxFloor = maxFloor;
        }
    }

    public void setMinFloor(int minFloor) {
        if(minFloor >= this.maxFloor){
            throw new IllegalArgumentException("Изменение невозможно значение maxFloor не может быть <= minFloor");
        } else if(minFloor > this.currentFloor) {
            this.minFloor = minFloor;
            this.currentFloor = minFloor;
            System.out.println("Текущий этаж равен минимальному");
        } else {
            this.minFloor = minFloor;
        }
    }

    public void move(int currentFloor) throws IllegalArgumentException {
        if (currentFloor >= this.minFloor && currentFloor <= this.maxFloor){
            this.currentFloor = currentFloor;
        } else {
            throw new IllegalArgumentException("Движение невозможно, этажа" + currentFloor + " не существует");
        }
    }

    @Override
    public String toString() {
        return "[" + minFloor + ", " + maxFloor + "]" + "->" + currentFloor;
    }
}
