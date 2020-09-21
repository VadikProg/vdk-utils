import java.util.ArrayList;
import java.util.Arrays;

public class CycleArray <T> {
    private ArrayList<T> array;
    private int length;
    private int iterator = 0;

    public CycleArray(ArrayList<T> array) {
        this.array = array;
        this.length = array.size();
    }
    public CycleArray(T[] array){
        this.array = new ArrayList<>(Arrays.asList(array));
        this.length = array.length;
    }

    public T get(){
        if(length == 0){
            return null;
        }
        return array.get(iterator);
    }

    public T getNext(){
        if(length == 0){
            return null;
        }
        if(iterator == length - 1){
            iterator = 0;
        }else {
            iterator++;
        }

        return array.get(iterator);
    }
    public T getPrevious (){
        if(length == 0){
            return null;
        }

        if(iterator == 0){
            iterator = length - 1;
        }else{
            iterator--;
        }
        return array.get(iterator);
    }

    public void add(T element){
        this.array.add(element);
        this.length++;
    }
    public void add(int i, T element){
        this.array.add(i, element);
        this.length++;
    }

    public int getLength() {
        return length;
    }

    public int getIterator() {
        return iterator;
    }
}
