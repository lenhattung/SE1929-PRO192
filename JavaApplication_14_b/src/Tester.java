/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {
        Student s1 = new Student("SE001", "Hoa Minzy", 10);
        Student s2 = new Student("SE002", "Xuan Hinh", 9);
        Student s3 = new Student("SE003", "Tuan Cry", 8);
        Student s4 = new Student("SE004", "Nguyen Van A", 4);

        StudentList l = new StudentList();
        l.addStudent(s1);
        l.addStudent(s2);
        l.addStudent(s3);
        l.addStudent(s4);
        
        l.printAll();
        
        System.out.println(l.contains(s2));
        
        System.out.println("===");
        l.removeStudent(s3);
        l.printAll();
        
        System.out.println("=====");
        l.printPassedStudent();
    }
}
