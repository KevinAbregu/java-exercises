package academy.learnprogramming;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem nextItem) {
        this.rightLink = nextItem;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem previousItem) {
        this.leftLink= previousItem;
        return this.leftLink;
    }
    @Override
    public int compareTo(ListItem listItem) {
        if(listItem != null){
            return this.getValue().toString().compareTo(listItem.getValue().toString());
        }
        return -1;
    }
}
