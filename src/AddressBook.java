import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> BuddyList;

    public AddressBook(){
        BuddyList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo Buddy){
        BuddyList.add(Buddy);
    }

    public void removeBuddy(BuddyInfo Buddy){
        BuddyList.remove(Buddy);
    }

    public void printAddressBook(){

        for (BuddyInfo Bud: BuddyList){
            System.out.println(Bud.getName());
        }
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        addressBook.printAddressBook();
    }

}
