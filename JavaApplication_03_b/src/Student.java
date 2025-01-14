
public class Student {

    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

    public void setCode(String code) {
        if (code != null && code.length() > 0) {
            this.code = code;
        }
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public void setbYear(int bYear) {
        if (bYear > 0) {
            this.bYear = bYear;
        }
    }

    public void setAddress(String address) {
        if (address != null && address.length() > 0) {
            this.address = address;
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getbYear() {
        return bYear;
    }

    public String getAddress() {
        return address;
    }

    
}
