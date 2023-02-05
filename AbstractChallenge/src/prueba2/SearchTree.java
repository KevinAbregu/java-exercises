package prueba2;

public class SearchTree implements NodeList{
    private ListItem root;

    public SearchTree(ListItem root) {
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
        while(currentItem != null){
            int comparison = item.compareTo(currentItem);
            if(comparison == 0){
                return false;
            }else if(comparison < 0){
                if(currentItem.previous() == null){
                    currentItem.setPrevious(item);
                    return true;
                }else{
                    currentItem = currentItem.previous();
                }

            }else{
                if(currentItem.next() == null){
                    currentItem.setNext(item);
                    return true;
                }
                currentItem = currentItem.next();

            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null) {
            int comparison = item.compareTo(currentItem);
            if(comparison == 0){
                performRemoval(currentItem, parentItem);
                return true;

            }else if(comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();

            }else{
                parentItem = currentItem;
                currentItem = currentItem.next();

            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null){
            traverse(root.leftLink);
            System.out.println(root.getValue());
            traverse(root.rightLink);
        }

    }

    private void performRemoval(ListItem item, ListItem parent){
        ListItem previousItem = item.previous();
        ListItem nextItem = item.next();
        if(nextItem == null){
            if(parent.next() == item){
                parent.setNext(previousItem);
            }else if(parent.previous() == item){
                parent.setPrevious(previousItem);
            }else{
                this.root = item.previous();
            }
        }else if(previousItem == null){
            if(parent.next() == item){
                parent.setNext(nextItem);
            }else if(parent.previous() == item){
                parent.setPrevious(nextItem);
            }else{
                this.root = item.next();
            }

        }else{
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current.previous() != null){
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }
}
