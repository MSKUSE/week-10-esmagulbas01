import java.util.Objects;

public class Stackitem {
    private Objects item;
    private Stackitem next;
    public Stackitem(){

    }

    public Stackitem(Objects item) {
        this.item = item;
    }

    public Stackitem(Objects item, Stackitem next) {
        this.item = item;
        this.next = next;
    }

    public Objects getItem() {
        if (item == null){

            return item;
        }

    }

    public void setItem(Objects item) {
        this.item = item;
    }

    public Stackitem getNext() {
        return next;
    }

    public void setNext(Stackitem next) {
        this.next = next;
    }
}
