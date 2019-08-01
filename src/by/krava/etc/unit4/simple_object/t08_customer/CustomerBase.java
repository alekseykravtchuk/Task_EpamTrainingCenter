package by.krava.etc.unit4.simple_object.t08_customer;


import java.util.ArrayList;
import java.util.Comparator;

public class CustomerBase {
    private String customersGroup;
    private ArrayList<Customer> base;

    CustomerBase(String customersGroup, ArrayList<Customer> base) {
        this.customersGroup = customersGroup;
        this.base = base;
    }

    void sortName(){
        base.sort(Comparator.comparing(Customer::getLastName));
    }

    ArrayList<Customer> getCustomerByCreditCardRange(String min, String max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.base) {
            if (customer.getCardNumber().toString().compareTo(min) > 0
                && customer.getCardNumber().toString().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }

    ArrayList<Customer> getBase() {
        return base;
    }

    public void setBase(ArrayList<Customer> base) {
        this.base = base;
    }

    public String getCustomersGroup() {
        return customersGroup;
    }

    public void setCustomersGroup(String customersGroup) {
        this.customersGroup = customersGroup;
    }
}
