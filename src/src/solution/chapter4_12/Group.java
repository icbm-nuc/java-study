package solution.chapter4_12;

public class Group {
    private String type; // 등급 이름 (S, A, B)
    private Seat[] seats = new Seat[10];

    public Group(String type) {
        this.type = type;
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat("---");
        }
    }

    public void show() {
        System.out.print(type + ">> ");
        for (Seat seat : seats) {
            System.out.print(seat.getName() + " ");
        }
        System.out.println();
    }

    public void set(String name, int seatNum) {
        seats[seatNum].setName(name);
    }

    public void erase(String name) {
        for (Seat seat : seats) {
            if (seat.getName().equals(name)) {
                seat.setName("---");
            }
        }
    }
}