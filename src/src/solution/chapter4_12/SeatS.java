package solution.chapter4_12;

public class SeatS{
    Seat[] seats = new Seat[10];

    public SeatS(){
        for (int i = 0; i < seats.length; i++) {
        seats[i] = new Seat("---");
        }
    }
    public void show() {
        for (Seat seat : seats) {
            System.out.print(seat.getName() + " ");
        }
        System.out.println();
    }

    public void set(String name,int seatNum){
        seats[seatNum].setName(name);
    }

    public void erase(String name) {
        for (int i = 0; i < seats.length; i++) {
            Seat seat = seats[i];
            if(seat.getName().equals(name)){
                seat.setName("---");
            }
        }
    }
}
