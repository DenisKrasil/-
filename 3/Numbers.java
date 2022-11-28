public class Numbers implements Comparable<Numbers>{
    private int num;

    public Numbers(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ""+num;
    }

    @Override
    public int compareTo(Numbers o) {
        // TODO Auto-generated method stub
        return 0;
    }

    // @Override
    // public int compareTo(Numbers num) {
    
}
