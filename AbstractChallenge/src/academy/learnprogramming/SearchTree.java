package academy.learnprogramming;

import java.util.List;

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
        if(root == null){
            root = item;
            return true;
        }

        ListItem actualItem = this.root;
        ListItem parent = null;
        while(true){
            parent = actualItem;
            if(actualItem.compareTo(item) == 0){
                return false;
            }else if(actualItem.compareTo(item) < 0){
                actualItem = actualItem.previous();
                if(actualItem == null){
                    parent.setPrevious(item);
                    return true;
                }

            }else if(actualItem.compareTo(item) > 0){
                actualItem = actualItem.next();
                if(actualItem == null){
                    parent.setNext(item);
                    return true;
                }
            }

        }
    }


    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        ListItem parent = currentItem;

        while (currentItem != null){
            if (currentItem.compareTo(item) < 0){
                // move right
                parent = currentItem;
                currentItem = currentItem.next();
            } else if (currentItem.compareTo(item) > 0){
                // move left
                parent = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parent);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if(item != null){
            traverse(item.previous());
            System.out.println(item.getValue());
            traverse(item.next());
        }
    }
    private void performRemoval(ListItem item, ListItem parent) {
        ListItem right = item.next();
        ListItem left = item.previous();
        if (right == null) {
            if (parent.previous() == item) {
                parent.setPrevious(left);
            } else if (parent.next() == item) {
                parent.setNext(left);
            } else {
                this.root = left;
            }
        } else if (left == null) {
            if (parent.previous() == item) {
                parent.setPrevious(right);
            } else if (parent.next() == item) {
                parent.setNext(right);
            } else {
                this.root = right;
            }
        } else {
            ListItem currentItem = right;
            ListItem minItemParent = currentItem;
            // find the smallest value in the right tree (i.e., leftmost)
            while (currentItem.previous() != null) {
                minItemParent = currentItem;
                currentItem = currentItem.previous();
            }
            // set the value of the element to be the value of the min element
            item.setValue(currentItem.getValue());
            // delete the min element
            if (minItemParent == currentItem) {
                // if there is no left branch in the right tree
                // then connect the item to the right branch directly
                item.setNext(currentItem.next());
            } else {
                minItemParent.setPrevious(currentItem.next());
            }
        }
    }
}
