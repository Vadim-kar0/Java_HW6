package HW;

public class ElevatorHW {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(5);
        System.out.println(elevator.toString());
        Elevator elevator1 = new Elevator(2,5);
        System.out.println(elevator1.toString());
        elevator1.move(4);
        System.out.println(elevator1.toString());
        Elevator elevator2 = new Elevator(5,2);
        System.out.println(elevator2.toString());


    }

}
