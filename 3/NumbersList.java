import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NumbersList implements Iterable<Numbers> {
    private List <Numbers> NumList;

    public NumbersList(){
        NumList = new ArrayList<>();
    }

    public void addNum(Numbers num){
        
        NumList.add(num);
    }

    @Override
    public Iterator<Numbers> iterator(){
        return new NumbersListIterator();
    }

    class NumbersListIterator implements Iterator<Numbers>{

        int index = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return index < NumList.size();
        }

        @Override
        public Numbers next() {
            // TODO Auto-generated method stub
            return NumList.get(index++);
        }

        
    }

    public void sort() {
        Collections.sort(NumList, new NumbersComparator());
    }
}
