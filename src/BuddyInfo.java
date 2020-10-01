public class BuddyInfo {

    private String name;
    private String address;
    private String mobilenumber;
    private String emailaddress;

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Ashi",
                "XYZ Street",
                "6130001212",
                "ashi@example.com");
        String name = buddy.getName();
        System.out.println("Hello "+name);
        System.out.println();
    }

    public BuddyInfo() { }

    public BuddyInfo(String name, String address,
                     String mobilenumber, String emailaddress){
        this.name = name;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.emailaddress = emailaddress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getMobileNumber(){
        return mobilenumber;
    }
    public void setMobileNumber(String mobilenumber){
        this.mobilenumber = mobilenumber;}

    public String getEmailAddress(){
        return emailaddress;
    }
    public void setEmailAddress(String emailaddress){
        this.emailaddress = emailaddress;
    }

    public String toString(){
        return "Name: " + name + ", Address: " + address +
                ", Mobile Number: " + mobilenumber + ", Email Address: " + emailaddress;
    }
}
