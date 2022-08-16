package Data;

public class CustomerImpl {
    public static void main(String[] args) {

        Customer object1 = new Customer("jdjjd", "wjedjwe", "rohit2000j@gmail.com", 532135455,true);
        object1.displayCustomer();
        Customer object = new Customer();
        object.setName("rgg");
        object.setAddress("dfgsgdsfg");
        object.setEmail("rohit@gamil.com");
        object.setPhoneno(5655564);
        object.setPremiumMembership(true);
        object.displayCustomer();
    }

}
