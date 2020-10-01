import java.util.ArrayList;

public class AddressBookSimple {
    private ArrayList<BuddyInfo> book;

    public AddressBookSimple(){
        this.book = new ArrayList<BuddyInfo>();

    }
    public void addBuddyInfo(BuddyInfo e){
        if (e!=null){
            this.book.add(e);
        }
    }
    public void removeBuddyInfo(int i){
        if (i>=0 && i<this.book.size()){
            this.book.remove(i);
        }
    }
    public static void main(String[] args){
        System.out.println("AddressBook");

        BuddyInfo buddy = new BuddyInfo("tom","xyz str.","613-xxx-xxxx","tom@ex.com");
        BuddyInfo buddy2 = new BuddyInfo("Adam","beta str.","613-xxx-xxxx","adam@ex.com");
        AddressBookSimple book = new AddressBookSimple();
        book.addBuddyInfo(buddy);
        book.addBuddyInfo(buddy2);
        book.removeBuddyInfo(0);


        System.out.println("This is a book");
    }
}
