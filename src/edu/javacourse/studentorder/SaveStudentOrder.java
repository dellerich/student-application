package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {

//        System.out.println(saveStudentOrder(so));
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running: ");

        return answer;
    }

    static StudentOrder buildsStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }

}
