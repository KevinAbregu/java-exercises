package prueba2;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }else if(item.compareTo(this.root) == 0){
            return false;
        }

        ListItem currentItem = this.root;
        int comparison;
        while(currentItem != null){
            comparison = currentItem.compareTo(item);
            if(comparison == 0){
                return false;
                }else if (comparison > 0){
                    ListItem previousItem = currentItem.previous();
                    item.setNext(currentItem).setPrevious(item);
                    if(previousItem != null){
                        item.setPrevious(previousItem).setNext(item);
                    }else{
                        this.root = item;
                    }
                    return true;
                }
            if(currentItem.next() != null) {
                currentItem = currentItem.next();
            }else{
                item.setPrevious(currentItem).setNext(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(this.root == null){
            return false;
        }
        ListItem currentItem = this.root;
        int comparison;
        while(currentItem != null){
            comparison = currentItem.compareTo(item);
            if(comparison == 0){
                ListItem previousItem = item.setPrevious(currentItem.previous());
                ListItem nextItem = item.setNext(currentItem.next());
                if(previousItem == null){
                    this.root = nextItem;
                    if(nextItem != null){
                        nextItem.setPrevious(null);
                    }else{
                        this.root = null;
                    }

                    return true;
                }
                previousItem.setNext(nextItem);
                if(nextItem != null){
                    nextItem.setPrevious(previousItem);
                }
                return true;
            }
            currentItem = currentItem.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("The list is empty");
        }else{
            ListItem currentItem = this.root;
            while(currentItem != null){
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }

        }


    }
}
