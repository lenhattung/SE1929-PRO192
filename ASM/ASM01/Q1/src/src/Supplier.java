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
        setPhone("");
        this.status = false;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        // this.name = name; => setName(name);
        setName(name);
        this.address = address;
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
            this.status = true;
        } else {
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.startsWith("0") && (phone.length() == 9 || phone.length() == 10)) {
            this.phone = phone;
        } else {
            this.phone = "000.000.0000";
        }

    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toTitleCase(String s) {
        // nguyen XUAN sOn => Nguyen Xuan Son
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            String word = temp[i];
            if (word.length() > 1) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            temp[i] = word;
        }
        s = String.join(" ", temp);
        // Xoa 2 khoang trang gan nhau
        while(s.indexOf("  ")>-1){
            s = s.replace("  ", " ");
        }
        // xoa khoang trang du thua o 2 dau chuoi
        s = s.trim();
        return s;
    }
    public String getStatusValue(){
        return (status)?"Available":"Unavailable";
    }
    @Override
    public String toString() {
        return getId()+","+getName()+","+getAddress()+","+getPhone()+","+getStatusValue();
    }
    
    

}
