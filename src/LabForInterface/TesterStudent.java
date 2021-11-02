package LabForInterface;

import java.util.*;

public class TesterStudent {

    public static void main(String[] args) {
     List<Student>studentList= new ArrayList<Student>();
//        Student s1 = new Student("zew",112);
//        Student s2 = new Student("Andy",114);
//        Student s3 = new Student ("Ben",115);
//
        studentList.add(new Student("zew",112));
        studentList.add(new Student("Andy",114));
        studentList.add(new Student("Ben",115));

        Collections.sort(studentList);
        for(Student i:studentList){
            System.out.println(i);
        }

    }
}
