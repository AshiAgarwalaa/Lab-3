import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private final List<BuddyInfo> listOfEntries;

    public static void main(String[] args) {

        System.out.println("***PROGRAM INFORMATION FOR ADDRESS BOOK*** \nNAME" +
                "->  IS THE NAME OF THE PERSON IN THE ADDRESSBOOK \nADDRESS" +
                "->  THE ADDRESS OF THE PERSON \nMOBILE NUMBER" +
                "->  THE MOBILE NUMBER OF THE PERSON \nEMAIL ADDRESS" +
                "->  THE EMAIL ADDRESS OF THE PERSON\n");

        String input;
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        //boolean stop = false;
        do
        {

            System.out.println("\nMain Menu");
            System.out.println("1. Add a Buddy");
            System.out.println("2. Delete a Buddy");
            System.out.println("3. View All Buddies");
            System.out.println("4. Update a Buddy's Info");
            System.out.println("5. Exit");
            System.out.print("Please enter Choices from 1 to 5: \n");
            input =(in.next());



            switch (input) {
                case "1":
                    //create a new entry for the addressbook
                    BuddyInfo entry = new BuddyInfo();

                    System.out.println("***Adding Entry in Address Book***");

                    System.out.print("First Name: ");
                    entry.setName(in.next());

                    System.out.print("Address: ");
                    entry.setAddress(in.next());

                    System.out.print("Mobile Number: ");
                    entry.setMobileNumber(in.next());

                    System.out.print("Email Address: ");
                    entry.setEmailAddress(in.next());

                    //add new entry to the addressbook
                    addressBook.add(entry);

                    System.out.println("Added a new entry.");
                    break;

                case "2":
                    System.out.println("Enter the index of the entry, which you want to delete:");
                    //delete the entry at the given index
                    addressBook.delete(in.nextInt());

                    break;

                case "3":
                    System.out.println("Your addressbook contains the following entries:");
                    //get array of all entries
                    BuddyInfo[] listOfEntries = addressBook.viewAll();

                    //for every entry in the array
                    for (BuddyInfo listOfEntry : listOfEntries) {
                        System.out.println(listOfEntry.toString());
                    }

                    break;
                case "4":
                    System.out.println("Enter the index of the entry, which you want to update:");
                    //get entry at the given index
                    BuddyInfo entryToUpdate = addressBook.get(in.nextInt());

                    System.out.print("First Name (current: " + entryToUpdate.getName() + "):");
                    entryToUpdate.setName(in.next());

                    System.out.print("Address: (current: " + entryToUpdate.getAddress() + "):");
                    entryToUpdate.setAddress(in.next());

                    System.out.print("Mobile Number: (current: " + entryToUpdate.getMobileNumber() + "):");
                    entryToUpdate.setMobileNumber(in.next());

                    System.out.print("Email Address: (current: " + entryToUpdate.getEmailAddress() + "):");
                    entryToUpdate.setEmailAddress(in.next());

                    break;

                default:
                    break;
            }
            //execute while stop is false
        } while (!input.equals("5"));
        System.out.println("***THANK YOU FOR USING MY PROGRAM...***");
    }

    public AddressBook() {
        //initialize list of entries
        this.listOfEntries = new ArrayList<>();
    }

    public void add(BuddyInfo addressBookEntry) {
        //adds a new Object to a List
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(int index) {
        //removes a object at the given index
        this.listOfEntries.remove(index);
    }

    public BuddyInfo get(int index) {
        //returns the object at the given index
        return this.listOfEntries.get(index);
    }

    public BuddyInfo[] viewAll() {
        //create a new array with the size of our list
        BuddyInfo[] result = new BuddyInfo[this.listOfEntries.size()];

        //fills our array with data from the list
        this.listOfEntries.toArray(result);

        //return the filled array
        return result;
    }
}
