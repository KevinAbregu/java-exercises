package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact){
        for(int i = 0; i < myContacts.size();i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) == -1){
            return myContacts.add(contact);
        }
        return false;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index >= 0){
            myContacts.set(index,newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Conta  ct contact){
        if(findContact(contact) >= 0){
            return myContacts.remove(contact);
        }
        return false;
    }


    public Contact queryContact(String contact){
        int index = findContact(contact);
        if(index >= 0){
            return myContacts.get(index);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
