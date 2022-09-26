public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public BuddyInfo(){
        name = "hadi";
        phone = "6138690363";
        address = "15 ballymore";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer", "Carleton", "613");
        System.out.println("Hello " + buddy1.getName());
    }
}
