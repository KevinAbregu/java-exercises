package academy.learnprogramming;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }


    @Override
    public boolean addItem(ListItem item) {
        if(root == null){
            root = item;
            return true;
        }else if(item.compareTo(root) == 0){
            return false;
        }
        ListItem actualItem = this.root;
        ListItem lastItem = actualItem;
        while(actualItem != null){
            if(actualItem.compareTo(item) == 0){
                return false;
            }else if(actualItem.compareTo(item) < 0){
                if(actualItem.previous() != null) {
                    ListItem previousItem = actualItem.previous();
                    item.setNext(actualItem);
                    item.setPrevious(previousItem);
                    previousItem.setNext(item);
                    actualItem.setPrevious(item);
                }else{
                    item.setNext(actualItem);
                    actualItem.setPrevious(item);
                }
                return true;
            }
            lastItem = actualItem;
            actualItem = actualItem.next();
        }
        item.setPrevious(lastItem);
        lastItem.setNext(item);

        return true;

    }

    @Override
    public boolean removeItem(ListItem item) {

        if(root == null){
            return false;
        }else if(item.compareTo(root) == 0){
            root = null;
            return true;
        }
        ListItem actualItem = this.root;
        while(actualItem != null){
            if(actualItem.compareTo(item) == 0){
                ListItem previousItem = actualItem.previous();
                ListItem nextItem = actualItem.next();
                previousItem.setNext(nextItem);
                nextItem.setPrevious(previousItem);
                return true;
            }
            actualItem = actualItem.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }
        ListItem actualItem = root;
        while(actualItem != null){
            System.out.println(actualItem.getValue());
            actualItem.next();
        }
    }
}
