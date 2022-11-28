import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection implements Iterable<Integer> {
    private List<Integer> myCollection;

    public List<Integer> getMyCollection() {
        return this.myCollection;
    }
    

    public Collection(){
        myCollection = new ArrayList<Integer>();
    }

    public void addNumber(Integer num) {
        myCollection.add(num);
    }

    public void getNumber(int position) {
        myCollection.get(position); 
    }

    @Override
    public Iterator<Integer> iterator(){
        return new CollectionIterator();
    }

    class CollectionIterator implements Iterator<Integer>{

        int index = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return index < myCollection.size();
        }

        @Override
        public Integer next() {
            // TODO Auto-generated method stub
            return myCollection.get(index++);
        }
    }
}