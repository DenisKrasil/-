import java.util.Comparator;

public class NumbersComparator implements Comparator<Numbers> {

    @Override
    public int compare(Numbers num, Numbers t1) {
        // TODO Auto-generated method stub
        //     // TODO Auto-generated method stub
        int count = 0;
        count = t1.getNum() % 10;
        if(count< num.getNum()%10 ) {
            return -1;
        }
        if(count> num.getNum()%10 ) {
            return 1;
        }
        if(count == num.getNum()%10 ) {
            return 0;
        }
        return 0;
    }
}


