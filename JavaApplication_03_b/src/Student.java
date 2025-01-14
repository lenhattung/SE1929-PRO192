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
    
}
