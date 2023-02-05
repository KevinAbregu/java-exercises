package academy.learnprogramming;

import java.util.ArrayList;

public class GloceryList {
    private ArrayList<String> gloceryList = new ArrayList<String>();

    public void addGloceryItem(String item){
        gloceryList.add(item);
    }

    public ArrayList<String> getGloceryList() {
        return gloceryList;
    }

    public void printGloceryList(){
        System.out.println("You have " + gloceryList.size() + " items in your glocery list " + gloceryList.toString());

        for(int i = 0; i < gloceryList.size(); i++){
            System.out.println((i+1) + ". " + gloceryList.get(i));
        }
    }

    private void modifyGloceryItem(int position, String newItem){
        gloceryList.set(position,newItem);
        System.out.println("Glocery item " + (position+1)+ " has been modified.");
    }
    private void removeGloceryItem(int position){
        gloceryList.remove(position);
    }

    private int findItem(String searchItem){
        return gloceryList.indexOf(searchItem);
    }

    public void modifyGloceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGloceryItem(position,newItem);
        }
    }
    public void removeGloceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGloceryItem(position);
        }
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
