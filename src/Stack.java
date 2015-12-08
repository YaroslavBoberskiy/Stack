import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by YB on 08.12.2015.
 */
public class Stack {

    LinkedList<Object> list = new LinkedList();

    public void push(Object obj) {
        list.push(obj);
    }

    public Object peak() {
        if (list.size() > 0) {
            return list.getFirst();
        } else {
            throw new NoSuchElementException();
        }
    }

    public Object pop() {
        if (list.size() > 0) {
            Object objToReturn = list.getFirst();
            list.remove(list.getFirst());
            return objToReturn;
        } else {
            throw new NoSuchElementException();
        }
    }

}
