package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;


    public MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        if(isRight()) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }
    private boolean isRight(){
        if(count >= max) {
            return false;
        } else {
            return true;
        }
    }

    public int getCount(){
        return count;
    }
}
