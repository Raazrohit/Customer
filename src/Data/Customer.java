package Data;

import static java.lang.System.*;

public class Customer {
    private String name;
    private String address;
    private String email;
    private long phoneno;
    private boolean premiumMembership;

    public Customer(){
        name = "";
        address = "";
        email = "";
        phoneno = 0;
        premiumMembership = true;
    }
    public Customer(String name, String address, String email, long phoneno, boolean premiumMembership){
        this.name = name;
        this.address = address;
        this.email  = email;
        this.phoneno = phoneno;
        this.premiumMembership = premiumMembership;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneno(long phoneno){
        this.phoneno = phoneno;
    }
    public long getPhoneno(){
        return phoneno;
    }
    public void setPremiumMembership(boolean premiumMembership){
        this.premiumMembership = premiumMembership;
    }
    public boolean isPremiumMembership(){
        return premiumMembership;
    }
    public void displayCustomer(){
        out.println("Name:"+name);
        out.println("Address:"+address);
        out.println("Email:"+email);
        out.println("phone no:"+phoneno);
        out.println("Is Premium Membership:"+premiumMembership);
    }
}
