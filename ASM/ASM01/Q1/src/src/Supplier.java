/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Supplier {
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
        this.id = 0;
        setName("");
        this.address = "";
        this.phone = "";
        this.status = false;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        // this.name = name; => setName(name);
        setName(name);
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty() && name.length()>=5 && name.length()<=50){
            this.name = name;
            this.status = true;
        }else{
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        // phone.startsWith("0")
        this.phone = phone;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
