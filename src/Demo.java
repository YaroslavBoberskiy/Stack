/**
 * Created by YB on 08.12.2015.
 */
public class Demo {

    public static void main(String [ ] args)
    {
     Stack stack = new Stack();

        //System.out.println(stack.peak());

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        // Peak

        System.out.println(stack.peak());
        System.out.println(stack.peak());

        // Pop

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
