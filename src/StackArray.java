import java.util.ArrayList;
import java.util.Objects;

public class StackArray implements Stack{
    private ArrayList<Objects> stack = new ArrayList<>();



    @Override
    public void push(Objects item) {
        stack.add(0);

    }

    @Override
    public Object pop() {

        return this.isEmpty() ? null: stack.remove(0);
    }

    @Override
    public void peek() {
        if (this.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("the top element is"
        + stack.get(0));

    }

    @Override
    public boolean isEmpty() {
        return stack.size()==0;
    }



}
