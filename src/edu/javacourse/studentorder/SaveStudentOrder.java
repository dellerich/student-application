package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        buildsStudentOrder();

//        System.out.println(saveStudentOrder(so));
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running: ");

        return answer;
    }

    static StudentOrder buildsStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        husband.setSurName("Петров");
        husband.setPassportNumber("112312312");
        so.setHusband(husband);

        System.out.println(husband.getPersonString());

        return so;
    }

}
