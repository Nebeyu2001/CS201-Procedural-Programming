package LabForInterface;

public class Student implements Comparable<Student> {

    private String lastName;
    private int idNumber;

    public Student() {
    }

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

//    @Override
//    public int compareTo(Student o) {
//
//        if(idNumber>o.idNumber)
//        return 1;
//        else if (idNumber==o.idNumber)
//            return -1;
//        else
//            return 0;
//    }


    @Override
    public int compareTo(Student o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
